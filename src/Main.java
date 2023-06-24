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


public class Main {


    public static void main(String[] args) {
        // Use invokeLater() to execute the GUI code asynchronously in the EDT
//        SwingUtilities.invokeLater(() -> {
//            // Create an instance of the DarkThemeGUI class
//            DarkThemeGUI darkThemeGUI = new DarkThemeGUI();
//
//            // Set the default close operation for the window
//            darkThemeGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        });

        try {
            String ruta = "test.txt";
            System.out.println("");
            GramaticaParser parser = getParser(ruta);
            GramaticaLexer lexer = getLexer(ruta);
            if (MyErrorListener.hasError) {
                System.out.println("Errores Encontrados");

            } else {

                ParseTree antlrAST = parser.prule();

                AntlrToProgram progVisitor = new AntlrToProgram();

                MyVisitor visitor = new MyVisitor();
                program prog = progVisitor.visit(antlrAST);
                visitor.visit(antlrAST);

            }
                /*f(progVisitor.sintaxError.isEmpty()){
                    ExpressionProcessor ep = progVisitor = new ExpressionProcessor(prog.expressions);
                    for (String eva: ep.getEvaluationResults()){
                        System.out.println(eva);
                    }
                }else{
                    for (String error: progVisitor.sintaxError){
                        System.out.println(error);
                    }
                }*/

        }catch(
                Exception e)

        {
            e.printStackTrace();
        }

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