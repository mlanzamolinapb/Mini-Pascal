import Parser.GramaticaBaseListener;
import Parser.GramaticaParser;

public class MyListener extends GramaticaBaseListener {
    @Override
    public void exitWriteln_statement(GramaticaParser.Writeln_statementContext ctx) {
        String str = ctx.STRING().getText();
        String text = str.substring(1, str.length() - 1);
        System.out.println(text);
    }

    @Override
    public void exitReadln_statement(GramaticaParser.Readln_statementContext ctx) {
        String id = ctx.ID().getText();
        System.out.print("Enter a value for " + id + ": ");
    }
}