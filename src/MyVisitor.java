import Parser.GramaticaBaseVisitor;
import Parser.GramaticaParser;

public class MyVisitor extends  GramaticaBaseVisitor<Object> {



    @Override public Object visitPrule(GramaticaParser.PruleContext ctx) {
//        System.out.println("validando tree..."+ ctx.toString());
        System.out.println("Si hay errores arriba PANICO!!!");
        return visitChildren(ctx);
    }


    @Override public Object visitSegundo(GramaticaParser.SegundoContext ctx) {
        return visitChildren(ctx);
    }



}