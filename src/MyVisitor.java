import Parser.GramaticaBaseVisitor;
import Parser.GramaticaParser;

import java.util.*;

public class MyVisitor extends  GramaticaBaseVisitor<Object> {

    private Map<String, Object> symbolTable = new HashMap<String, Object>();
    public class TwoValues {
        public int expressionValue;
        public boolean placeInTable;
        public String valueString="";
    }

    @Override public Object visitPrule(GramaticaParser.PruleContext ctx) {
//        System.out.println("validando tree..."+ ctx.toString());
        System.out.println("Si hay errores arriba PANICO!!!");
        return visitChildren(ctx);
    }


    @Override public Object visitSegundo(GramaticaParser.SegundoContext ctx) {
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
            values.expressionValue=0;
            values.placeInTable = false;
            if(ctx.STRING() != null){
                // put in simbol table
                String varValue = ctx.STRING().getText();
                values.expressionValue=0;
                values.valueString=varValue;
            }else if(ctx.bool_literal() != null){
                String varValue = ctx.bool_literal().getText();
                values.expressionValue=0;
                values.valueString=varValue;
            }
            else if(ctx.CHAR() != null){
                String varValue = ctx.CHAR().getText();
                values.expressionValue=0;
                values.valueString=varValue;
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
        }else {
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
    public String  visitReadln_statement(GramaticaParser.Readln_statementContext ctx) {

        String id = ctx.ID().getText();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
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
        if(exprValue.placeInTable){
            symbolTable.put(varName, exprValue.expressionValue);
        }else{
            symbolTable.put(varName,exprValue.valueString);
        }

        return null;
    }



}