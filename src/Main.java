import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.Trees;
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

            GramaticaLexer lexer = new GramaticaLexer(cs);// depende que charStream usemos lo enviamos al lexer
            CommonTokenStream token = new CommonTokenStream(lexer);
            GramaticaParser parser = new GramaticaParser(token);
            ParseTree tree = parser.prule();

            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);

        }catch (Exception e){
            e.printStackTrace();
        }


    }


}