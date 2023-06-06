package Expression;

import java.util.ArrayList;
import java.util.List;
import Parser.*;
public class AntlrToProgram extends GramaticaBaseVisitor<program> {

    public List<String> sintaxError;

    @Override
    public program visitProgram(GramaticaParser.ProgramContext ctx) {
        program prog = new program();
        AntlrToExpression exprVisitor = new AntlrToExpression(sintaxError);
        sintaxError = new ArrayList<>();
        for(int i=0; i< ctx.getChildCount();i++){
            if(i== ctx.getChildCount()-1){
                //
            }else{
                prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
            }

        }
        return null;
    }
}
