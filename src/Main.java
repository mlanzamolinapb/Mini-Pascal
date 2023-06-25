import Parser.*;
import Parser.GramaticaLexer;
import Parser.GramaticaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import Expression.MyErrorListener;
import Expression.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static org.antlr.v4.runtime.CharStreams.fromString;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        // Crear una ventana
        JFrame ventana = new JFrame("Mi pantalla generada");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);

        // Crear un panel
        JPanel panel = new JPanel();

        // Crear un botón para seleccionar archivo
        JButton botonSeleccionar = new JButton("Seleccionar archivo");
        botonSeleccionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar un diálogo de selección de archivo
                JFileChooser fileChooser = new JFileChooser();
                int resultado = fileChooser.showOpenDialog(ventana);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    File archivoSeleccionado = fileChooser.getSelectedFile();
                    // Aquí puedes hacer algo con el archivo seleccionado
                    System.out.println("Archivo seleccionado: " + archivoSeleccionado.getAbsolutePath());

                    try {
                        GramaticaParser parser = getParser(archivoSeleccionado.getPath().toString());
                        GramaticaLexer lexer = getLexer(archivoSeleccionado.getPath().toString());
                        if (MyErrorListener.hasError) {
                            System.out.println("Errores Encontrados");
                        } else {
                            ParseTree antlrAST = parser.prule();
                            AntlrToProgram progVisitor = new AntlrToProgram();
                            MyVisitor visitor = new MyVisitor();
                            program prog = progVisitor.visit(antlrAST);
                            visitor.visit(antlrAST);

                        }
                    }catch(Exception exception)
                    {
                        exception.printStackTrace();
                    }

                }
            }
        });

        // Agregar el botón al panel
        panel.add(botonSeleccionar);

        // Agregar el panel a la ventana
        ventana.add(panel);

        // Mostrar la ventana
        ventana.setVisible(true);
    }


    private static GramaticaParser getParser(String filename){
        GramaticaParser parser = null;
        try {
            CharStream input = fromFileName(filename);
            GramaticaLexer lexer = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new GramaticaParser(tokens);

            //Manejo de errores
            /*lexer.addErrorListener();
            lexer.addErrorListener(new MyErrorListener());*/

            // Syntax Error handling
            parser.removeErrorListeners();
            parser.addErrorListener(new MyErrorListener());

        } catch (IOException e){
            e.printStackTrace();
        }
        return parser;
    }

    private static GramaticaLexer getLexer(String filename){
        GramaticaLexer lexer = null;

        try {
            CharStream input = fromFileName(filename);
            lexer = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //Manejo de errores
            lexer.removeErrorListeners();
            lexer.addErrorListener(new MyErrorListener());

        } catch (IOException e){
            e.printStackTrace();
        }
        return lexer;
    }
}