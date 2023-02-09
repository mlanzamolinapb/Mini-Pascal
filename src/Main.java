
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static org.antlr.v4.runtime.CharStreams.fromString;
import Parser.*;


import java.io.FileInputStream;
import java.io.IOException;

public class Main {


    public static void main(String[] args){
        try{

            String file_name = "test.txt";
            CharStream cs = fromFileName(file_name);// entrada desde un archivo de texto


            String str_input = "HOLI ASD d 3";
            CharStream ch =  fromString(str_input);//entrada desde un string

            LexerLexer lexer = new LexerLexer(ch);// depende que charStream usemos lo enviamos al lexer
            CommonTokenStream token = new CommonTokenStream(lexer);
            LexerParser parser = new LexerParser(token);
           // ParseTree tree = parser.prule();

//            MyVisitor visitor = new MyVisitor();
//            visitor.visit(tree);

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}