import Parser.LexerBaseVisitor;
import Parser.LexerParser;

public class MyVisitor extends  LexerBaseVisitor<Object> {



    @Override public Object visitPrule(LexerParser.PruleContext ctx) {
        System.out.println("<estoy en prule> "+ ctx.toString());
        return visitChildren(ctx);
    }


    @Override public Object visitSegundo(LexerParser.SegundoContext ctx) {
        return visitChildren(ctx);
    }

}