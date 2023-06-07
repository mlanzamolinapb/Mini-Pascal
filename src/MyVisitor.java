import Parser.GramaticaBaseVisitor;
import Parser.GramaticaParser;
import Parser.*;
import org.antlr.v4.runtime.Token;

import java.util.*;

public class MyVisitor extends  GramaticaBaseVisitor<Object> {

    private Map<String, Object> symbolTable = new HashMap<String, Object>();
    public ArrayList<String> erroresSemanticos = new ArrayList<>();

    public class TwoValues {
        public int expressionValue;
        public boolean placeInTable;
        public String valueString = "";
    }

    @Override
    public Object visitPrule(GramaticaParser.PruleContext ctx) {
//        System.out.println("validando tree..."+ ctx.toString());
        System.out.println("Si hay errores arriba PANICO!!!");
        return visitChildren(ctx);
    }


    @Override
    public Object visitSegundo(GramaticaParser.SegundoContext ctx) {
        return visitChildren(ctx);
    }


    public TwoValues evaluateExpression(GramaticaParser.ExpressionContext ctx) {
        TwoValues values = new TwoValues();
        if (ctx.INTEGER() != null) {
            values.expressionValue = Integer.parseInt(ctx.INTEGER().getText());
            values.placeInTable = true;
        } else if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            Integer varValue = (Integer) symbolTable.get(varName);
            if (varValue != null) {
                values.expressionValue = varValue;
                values.placeInTable = true;
            } else {
                throw new RuntimeException("Undefined variable: " + varName);
            }
        } else if (ctx.STRING() != null || ctx.bool_literal() != null || ctx.CHAR() != null) {
            // code for handling strings, booleans, and chars goes here...
            // If the expression is a string, boolean or char, throw an error since we don't support them
            values.expressionValue = 0;
            values.placeInTable = false;
            if (ctx.STRING() != null) {
                // put in simbol table
                String varValue = ctx.STRING().getText();
                values.expressionValue = 0;
                values.valueString = varValue;
            } else if (ctx.bool_literal() != null) {
                String varValue = ctx.bool_literal().getText();
                values.expressionValue = 0;
                values.valueString = varValue;
            } else if (ctx.CHAR() != null) {
                String varValue = ctx.CHAR().getText();
                values.expressionValue = 0;
                values.valueString = varValue;
            }
            return values;
        } else if (ctx.PLUS() != null) {
            // Evaluate left and right operands
            TwoValues leftValues = evaluateExpression(ctx.expression(0));
            TwoValues rightValues = evaluateExpression(ctx.expression(1));
            // Check if the values should be placed in the symbol table
            values.placeInTable = leftValues.placeInTable || rightValues.placeInTable;
            // Perform the addition and store the result in expressionValue
            values.expressionValue = leftValues.expressionValue + rightValues.expressionValue;
        } else if (ctx.MINUS() != null) {
            // Evaluate left and right operands
            TwoValues leftValues = evaluateExpression(ctx.expression(0));
            TwoValues rightValues = evaluateExpression(ctx.expression(1));
            // Check if the values should be placed in the symbol table
            values.placeInTable = leftValues.placeInTable || rightValues.placeInTable;
            // Perform the subtraction and store the result in expressionValue
            values.expressionValue = leftValues.expressionValue - rightValues.expressionValue;
        } else if (ctx.TIMES() != null) {
            // Evaluate left and right operands
            TwoValues leftValues = evaluateExpression(ctx.expression(0));
            TwoValues rightValues = evaluateExpression(ctx.expression(1));
            // Check if the values should be placed in the symbol table
            values.placeInTable = leftValues.placeInTable || rightValues.placeInTable;
            // Perform the multiplication and store the result in expressionValue
            values.expressionValue = leftValues.expressionValue * rightValues.expressionValue;
        } else if (ctx.DIV() != null) {
            // Evaluate left and right operands
            TwoValues leftValues = evaluateExpression(ctx.expression(0));
            TwoValues rightValues = evaluateExpression(ctx.expression(1));
            // Check if the values should be placed in the symbol table
            values.placeInTable = leftValues.placeInTable || rightValues.placeInTable;
            // Perform the division and store the result in expressionValue
            values.expressionValue = leftValues.expressionValue / rightValues.expressionValue;
        } else {
            throw new RuntimeException("Unknown expression type: " + ctx.getText());
        }
        return values;
    }

    //    public int evaluateArray(GramaticaParser.ArrayContext ctx) {
//        String arrayName = ctx.ID().getText();
//        Integer[] array = (Integer[]) symbolTable.get(arrayName);
//        if (array == null) {
//            throw new RuntimeException("Undefined array: " + arrayName);
//        }
//
//        int index = evaluateExpression(ctx.type());
//        if (index < 0 || index >= array.length) {
//            throw new RuntimeException("Index out of bounds for array " + arrayName + ": " + index);
//        }
//
//        return array[index];
//    }
    @Override
    public Void visitWriteln_statement(GramaticaParser.Writeln_statementContext ctx) {
        String output;

        // Check if the argument is a STRING
        if (ctx.STRING() != null) {
            output = ctx.STRING().getText();
        }
        // Check if the argument is an ID
        else if (ctx.ID() != null) {
            // Get the variable name from the ID
            String varName = ctx.ID().getText();
            // Get the value of the variable from the symbol table
            Object varValue = symbolTable.get(varName);
            // Convert the variable value to a string
            output = varValue.toString();
        }
        // Throw an error if the argument is neither a STRING nor an ID
        else {
            throw new RuntimeException("Invalid argument for writeln statement.");
        }

        // Output the string
        System.out.println(output);
        return null;
    }


    @Override
    public String visitReadln_statement(GramaticaParser.Readln_statementContext ctx) {

        String id = ctx.ID().getText();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("You entered: " + input + id);

        symbolTable.put(id, input);
        System.out.println("Symbol table in hashmap");
        for (String key : symbolTable.keySet()) {
            Object value = symbolTable.get(key);
            System.out.println(key + " = " + value);
        }
        return input;
    }

    @Override
    public Object visitAssign_statement(GramaticaParser.Assign_statementContext ctx) {
        // Retrieve the variable name and expression from the parse tree
        String varName = ctx.ID().getText();
        TwoValues exprValue = evaluateExpression(ctx.expression());


        // Store the value in the symbol table
        if (exprValue.placeInTable) {
            symbolTable.put(varName, exprValue.expressionValue);
        } else {
            symbolTable.put(varName, exprValue.valueString);
        }

        return null;
    }


    @Override
    public Object visitVar(GramaticaParser.VarContext ctx) {
        String text = ctx.getText();
        String tipo = ctx.type(0).getText();
        String id = ctx.ID(0).getText();
        Token idToken = null;
        String name ="";





        for (int i =1; i< ctx.ID().size();i++){
            String id2 = ctx.ID(i).getText();
            name = ctx.ID(0).getText();

            if(name.equals(id2)){
                idToken = ctx.ID(i).getSymbol();
                String nombre = idToken.getText();
                int line = idToken.getLine();
                int column = idToken.getCharPositionInLine() + 1;
                erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable ya esta declarada");
                System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable ya esta declarada");

            }else if (!name.equals(id2)){
                symbolTable.put(id2, null);


            }



        }






        return null;
    }

    @Override
    public Object visitDecl(GramaticaParser.DeclContext ctx) {
        return super.visitDecl(ctx);
    }

    public static boolean isInteger(String variable) {
        try {
            Integer.parseInt(variable);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }



    @Override
    public Object visitFor(GramaticaParser.ForContext ctx) {
        Token idToken = null;
        int valorInicial = 0;
        int valorFinal = 0;



        try {

            ctx.ID(0);

            if(ctx.INTEGER(0)!= null){

                if (!isInteger(ctx.INTEGER(0).getText())) {
                    idToken = ctx.ID(0).getSymbol();
                    int line = idToken.getLine();
                    int column = idToken.getCharPositionInLine() + 1;
                    erroresSemanticos.add("Error: Variable" + idToken + "en la linea: " + line + "columna " + column + "la variable debe ser un Integer");
                    System.out.println("Error for");

                }
            }else if (ctx.ID(0).toString() == null){
                erroresSemanticos.add("Error: Variable, Se esperaba Integer");
                System.out.println("Se esperaba integer");
            }

            if(ctx.INTEGER(1)!= null){


                if (!isInteger(ctx.INTEGER(1).getText())) {
                    idToken = ctx.ID(1).getSymbol();
                    String nombre = idToken.getText();
                    int line = idToken.getLine();
                    int column = idToken.getCharPositionInLine() + 1;
                    erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + "columna " + column + "la variable debe ser un Integer");
                    System.out.println("Error for");

                }

            }else if (ctx.ID(1).toString() == null){
                erroresSemanticos.add("Error: Se esperaba Integer");
                System.out.println("Se esperaba integer");
            }


            if (!symbolTable.containsKey(ctx.ID(0).getText())) {

                idToken = ctx.ID(0).getSymbol();
                String nombre = idToken.getText();
                int line = idToken.getLine();
                int column = idToken.getCharPositionInLine() + 1;
                erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");
                System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");


            }



            if (!symbolTable.containsKey(ctx.ID(1).getText())) {
                idToken = ctx.ID(1).getSymbol();
                String nombre = idToken.getText();
                int line = idToken.getLine();
                int column = idToken.getCharPositionInLine() + 1;
                erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");
                System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");
            }

          /*  if(symbolTable.containsKey(ctx.ID(0).getText())) {
                if (symbolTable.get(ctx.ID(0).getText()) != null) {
                    if (isInteger(symbolTable.get(ctx.ID(0)).toString())) {
                        idToken = ctx.ID(0).getSymbol();
                        String nombre = idToken.getText();
                        int line = idToken.getLine();
                        int column = idToken.getCharPositionInLine() + 1;
                        erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta inicializada");
                        System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta inicializada");
                    }
                }
            }*/


            if(ctx.ID(0).getText()!=null) {
                if (symbolTable.get(ctx.ID(0).getText()) == null) {
                    idToken = ctx.ID(0).getSymbol();
                    String nombre = idToken.getText();
                    int line = idToken.getLine();
                    int column = idToken.getCharPositionInLine() + 1;
                    erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta inicializada");
                    System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta inicializada");

                }
            }




            if(ctx.INTEGER(0)!=null) {
                if (ctx.INTEGER(0).getText() != null) {
                    Token variableControl = ctx.INTEGER(0).getSymbol();
                    GramaticaParser.StatementContext paso = ctx.statement();
                    String varControl = variableControl.getText();

                    if (paso.getText().equals(varControl + " " + ":=" + " " + varControl + " " + "+" + " " + "1")) {
                        int variableInicial = Integer.parseInt(variableControl.getText());
                        System.out.println(variableInicial);

                    }


                }
            }

            if (ctx.ID(0).getText()!=null) {

                Token variableControl = ctx.ID(0).getSymbol();
                GramaticaParser.StatementContext paso = ctx.statement();

                String varControl = variableControl.getText();
                String cad = varControl + ":=" + varControl + "+" + "1" +";".replace(" ", "");

                if (paso.getText().equals(cad)) {
                    int variableInicial = Integer.parseInt(variableControl.getText());
                    System.out.println("Entro AQUI");
                }
            }

            if(ctx.ID(0)!=null){
                if(ctx.ASIGNACION(0)!=null){
                    if(ctx.ID(1)!=null){
                        int variableControl = Integer.parseInt(ctx.ID(1).getText());
                        System.out.println(variableControl);
                    }
                }

            }









        }catch (Exception e){
            e.printStackTrace();
        }



        return null;
    }














    @Override
    public Object visitWhile(GramaticaParser.WhileContext ctx) {
        Token idToken = null;
        if(ctx.INTEGER(0)!=null){
            if(!isInteger(ctx.INTEGER(0).getText())){
                idToken = ctx.ID(0).getSymbol();
                String nombre = idToken.getText();
                int line = idToken.getLine();
                int column = idToken.getCharPositionInLine() + 1;
                erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable debe de ser un integer ");
                System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable debe de ser un integer");

            }
        }

        if(ctx.INTEGER(1)!=null){
            if(!isInteger(ctx.INTEGER(1).getText())){
                idToken = ctx.ID(1).getSymbol();
                String nombre = idToken.getText();
                int line = idToken.getLine();
                int column = idToken.getCharPositionInLine() + 1;
                erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable debe de ser un integer ");
                System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable debe de ser un integer");

            }
        }

        if (!symbolTable.containsKey(ctx.ID(0).getText())) {

            idToken = ctx.ID(0).getSymbol();
            String nombre = idToken.getText();
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine() + 1;
            erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");
            System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");


        }

        if (!symbolTable.containsKey(ctx.ID(1).getText())) {

            idToken = ctx.ID(1).getSymbol();
            String nombre = idToken.getText();
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine() + 1;
            erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");
            System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");


        }


        if (ctx.INTEGER(0).getText()!=null){

            Token variableControl = ctx.INTEGER(0).getSymbol();
            GramaticaParser.StatementContext paso = ctx.statement();
            String varControl = variableControl.getText();
            //int control = control +1;

            if(paso.getText().equals(varControl + " " + ":=" + " "  + varControl + " " + "+" + " " + "1")){
                int variableInicial = Integer.parseInt(variableControl.getText());

            }




        }


        if (ctx.INTEGER(1).getText()!=null) {

            Token variableControl = ctx.INTEGER(1).getSymbol();
            GramaticaParser.StatementContext paso = ctx.statement();
            String varControl = variableControl.getText();


            if (paso.getText().equals(varControl + " " + ":=" + " " + varControl + " " + "+" + " " + "1")) {
                int variableInicial = Integer.parseInt(variableControl.getText());

            }


        }

        if (ctx.ID(0).getText()!=null) {
            System.out.println("Entro AQUI");
            Token variableControl = ctx.INTEGER(0).getSymbol();
            GramaticaParser.StatementContext paso = ctx.statement();
            String varControl = variableControl.getText();



            if (paso.getText().equals(varControl + " " + ":=" + " " + varControl + " " + "+" + " " + "1")) {
                int variableInicial = Integer.parseInt(variableControl.getText());


            }


        }


        if (ctx.ID(1).getText()!=null) {
            Token variableControl = ctx.INTEGER(1).getSymbol();
            GramaticaParser.StatementContext paso = ctx.statement();
            String varControl = variableControl.getText();


            if (paso.getText().equals(varControl + " " + ":=" + " " + varControl + " " + "+" + " " + "1")) {
                int variableInicial = Integer.parseInt(variableControl.getText());


            }


        }




        return null;
    }

    @Override
    public Object visitIf_stmt(GramaticaParser.If_stmtContext ctx) {


        return null;
    }
}



