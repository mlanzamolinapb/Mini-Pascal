package Expression;


import Parser.*;
import java.util.List;



public class AntlrToExpression extends GramaticaBaseVisitor<Expression>{
    private List<String> vars;
    private List<String> SintaxError;


    public AntlrToExpression(List<String> sintaxError) {
        this.SintaxError = sintaxError;
    }

   /* public Expression visitVar(GramaticaParser.VarContext ctx) {

        Token idToken = ctx.ID().getSymbol();
        ctx.SEMICOLON();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

       String id =  ctx.getChild(0).getText();
       String puntos = ctx.getChild(1).getText();
       String type = ctx.getChild(2).getText();
       String Colon = ctx.getChild(3).getText();


       if(!puntos.equals(":")){
        SintaxError.add("Error: Sintactico "+ "Se esperaba "+ " : " + "(" + line+ ", " + column + ")"  );
       }

       if(!type.equals("Integer")| !type.equals("String")| !type.equals("Boolean")){
           SintaxError.add("Error: Sintactico "+ " tipo indefinido " + "(" + line+ ", " + column + ")" );
       }

    return new VariableDeclaration(id, type);
    }*/

   /* @Override
    public Expression visitDecl(GramaticaParser.DeclContext ctx) {
        Token idToken = ctx.ID().get
       ctx.SEMICOLON();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String id =  ctx.getChild(0).getText();
        String asign = ctx.getChild(1).getText();
        int num = Integer.parseInt(ctx.getChild(2).getText());
        String Colon = ctx.getChild(3).getText();


        if(!asign.equals(":=")){
            SintaxError.add("Error: Sintactico "+ "Se esperaba "+ " := " + "(" + line+ ", " + column + ")"  );
        }

        if(num != 0){
            SintaxError.add("Error: Sintactico "+ "Se esperaba "+ "valor " + "(" + line+ ", " + column + ")"  );
        }



        if(!asign.equals(";")){
            SintaxError.add("Error: Sintactico "+ "Se esperaba "+ " ; " + "(" + line+ ", " + column + ")"  );
        }

        return new VariableInitialization(id,num);

    }*/



}
