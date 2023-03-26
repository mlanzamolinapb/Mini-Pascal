import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Trees;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static org.antlr.v4.runtime.CharStreams.fromString;
import Parser.*;


import java.io.FileInputStream;
import java.io.IOException;

public class Main {


    public static void main(String[] args){
        try{
            String input = "writeln('Please enter your name:');\n" +
                    "readln(name);\n";
            String file_name = "test.txt";
            CharStream cs = fromFileName(file_name);// entrada desde un archivo de texto


            String str_input = "HOLI ASD duk 3";
            CharStream ch =  fromString(input);//entrada desde un string

            GramaticaLexer lexer = new GramaticaLexer(cs);// depende que charStream usemos lo enviamos al lexer
            CommonTokenStream token = new CommonTokenStream(lexer);
            GramaticaParser parser = new GramaticaParser(token);

            ParseTree tree = parser.prule();


            MyVisitor visitor = new MyVisitor();


            visitor.visit(tree);

//            for (String key : visitor.symbolTable.keySet()) {
//                Object value = visitor.symbolTable.get(key);
//                System.out.println(key + " = " + value);
//            }



//            String file_name = "test.txt";
//            CharStream cs = fromFileName(file_name);// entrada desde un archivo de texto
//            GramaticaLexer lexer = new GramaticaLexer(cs);
//            CommonTokenStream tokens = new CommonTokenStream(lexer);
//            GramaticaParser parser = new GramaticaParser(tokens);
//            ParseTreeWalker walker = new ParseTreeWalker();
//            MyListener listener = new MyListener();
//            walker.walk(listener, parser.program());

        }catch (Exception e){
            e.printStackTrace();
        }


    }


}