import Parser.GramaticaBaseVisitor;
import Parser.GramaticaParser;
import Parser.*;
import org.antlr.v4.runtime.Token;




import java.util.*;

public class MyVisitor extends GramaticaBaseVisitor<Object>
{

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
        Token idToken = null;

        String variable = ctx.ID().getText();
        String expressionType = visit(ctx.expression()).toString();



        if (symbolTable.containsKey(variable)) {
            String variableType = symbolTable.get(variable).toString();
            if (!variableType.equals(expressionType)) {
                System.err.println("Error de tipo: La asignación de " + variable + " es incompatible con el tipo " + expressionType);
            }
        } else if(!symbolTable.containsKey(variable)){
            System.err.println("Error de declaracion: La variable " + variable + " no esta declarada " );
        }else{
            symbolTable.put(variable, expressionType);
        }
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
        String id = ctx.ID(0).getText();
        Token idToken = null;
        String name ="";
        ArrayList<String> vars = new ArrayList<>();

        try {
            for(int i =0; i<ctx.ID().size();i++){
                vars.add(ctx.ID(i).getText());
            }
            List<String> elementos = encontrarElementosRepetidos(vars);

            for(int i =0; i<ctx.ID().size();i++){
                for(int j =0; j<elementos.size();j++) {

                    if (elementos.get(j).toString() !=null) {
                        if (ctx.ID(i).getText().equals(elementos.get(j))) {
                            idToken = ctx.ID(i).getSymbol();
                            String Token = idToken.getText();
                            int line = idToken.getLine();
                            int column = idToken.getCharPositionInLine() + 1;
                            erroresSemanticos.add("Error: Variable " + Token + " en la linea: " + line + "columna " + column + "la variable esta repetida");
                            System.out.println("Error: Variable " + Token + " en la linea: " + line + " columna " + column + " la variable esta repetida");
                        }
                    }
                }
            }

            for(int i=0; i<ctx.ID().size();i++){

                for(int j=0; j<ctx.type().size() ; j++){
                    symbolTable.put(ctx.ID(i).getText(), ctx.type(j).getText());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object visitExpression(GramaticaParser.ExpressionContext ctx) {
        if (ctx.INTEGER() != null) {
            return "INTEGER";
        } else if (ctx.CHAR() != null) {
            return "CHAR";
        } else if (ctx.STRING() != null) {
            return "STRING";
        }
        return null;
    }

    public List<String> encontrarElementosRepetidos(List<String> lista) {
        List<String> elementosRepetidos = new ArrayList<>();
        Set<String> elementosUnicos = new HashSet<>();

        for (int i = 0; i < lista.size(); i++) {
            String elementoActual = lista.get(i);
            if (!elementosUnicos.add(elementoActual) && !elementosRepetidos.contains(elementoActual)) {
                elementosRepetidos.add(elementoActual);
            }
        }

        return elementosRepetidos;
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

            if(ctx.ID(0) != null) {
                if (!symbolTable.containsKey(ctx.ID(0).getText())) {

                    idToken = ctx.ID(0).getSymbol();
                    String nombre = idToken.getText();
                    int line = idToken.getLine();
                    int column = idToken.getCharPositionInLine() + 1;
                    erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");
                    System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");


                }
            }


            if(ctx.ID(1)!=null) {
                if (!symbolTable.containsKey(ctx.ID(1).getText())) {
                    idToken = ctx.ID(1).getSymbol();
                    String nombre = idToken.getText();
                    int line = idToken.getLine();
                    int column = idToken.getCharPositionInLine() + 1;
                    erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");
                    System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");
                }
            }



            if(ctx.ID(0) !=null) {
                if (ctx.ID(0).getText() != null) {
                    if (symbolTable.get(ctx.ID(0).getText()) == null) {
                        idToken = ctx.ID(0).getSymbol();
                        String nombre = idToken.getText();
                        int line = idToken.getLine();
                        int column = idToken.getCharPositionInLine() + 1;
                        erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta inicializada");
                        System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta inicializada");

                    }
                }
            }




            if(ctx.INTEGER(0)!=null) {
                if (ctx.INTEGER(0).getText() != null) {
                    Token variableControl = ctx.INTEGER(0).getSymbol();
                    GramaticaParser.StatementContext paso = ctx.statement();
                    String varControl = variableControl.getText();
                    int variableC = Integer.parseInt(ctx.INTEGER(0).getText());
                    int variableFinal = Integer.parseInt(ctx.INTEGER(1).getText());

                    for (int i = variableC; i <= variableFinal; i ++) {
                        System.out.println("Entro for "+ i);


                        symbolTable.put("i", i);
                        // ...
                    }


                }
            }

            if (ctx.ID(0) !=null) {

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
                    System.out.println("Entro aqui");
                    if(ctx.ID(1)!=null){
                        int variableControl = Integer.parseInt(ctx.INTEGER(0).getText());
                        int variableFinal = Integer.parseInt(symbolTable.get(ctx.ID(1).getText()).toString());
                        String varControl = ctx.ID(0).getText();
                        System.out.println("Control"+ variableControl);
                        System.out.println("final"+ variableFinal);


                        for (int i = variableControl; i <= variableFinal; i ++) {
                            System.out.println("Entro for "+ i);


                            symbolTable.put(varControl, i);
                            // ...
                        }

                    }
                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Object visitFunction(GramaticaParser.FunctionContext ctx) {
        String functionName = ctx.ID().getText(); // Obtener el nombre de la función
        List<String> parameterList = new ArrayList<>(); // Lista para almacenar los parámetros

        // Obtener los parámetros de la regla "parametros"
        GramaticaParser.ParametrosContext parametrosContext = ctx.parametros();
//        System.out.println(parametrosContext.getText().toString());
        if (parametrosContext != null) {
            //List<GramaticaParser.ParametrosContext> parametroContextList = parametrosContext.parametros();


//            for (GramaticaParser.ParametrosContext parametroContext : parametroContextList) {
//                String parameterName = parametroContext.ID().getText(); // Obtener el nombre del parámetro
//                System.out.println(parameterName);
//                System.out.println(parametroContextList.size());
//                parameterList.add(parameterName);
//            }
        }

        String returnType = ctx.type().getText(); // Obtener el tipo de retorno de la función

        // Verificar si la función tiene un bloque de código "begin statement end"
        GramaticaParser.BeginContext beginContext = ctx.begin();
        GramaticaParser.StatementContext statementContext = ctx.statement();
        if (beginContext != null && statementContext != null) {
            // Aquí puedes realizar acciones semánticas adicionales, como verificar la validez de los parámetros, el tipo de retorno, etc.
            // También puedes generar el código intermedio correspondiente para la función.
            // En este ejemplo, simplemente imprimiremos información sobre la función.

            System.out.println("Function: " + functionName);
            System.out.println("Parameters: " + parameterList);
            System.out.println("Return Type: " + returnType);

            return null;
        } else {
            // Si falta el bloque de código "begin statement end", puedes lanzar una excepción o mostrar un mensaje de error.
            System.err.println("Error: Missing 'begin statement end' block for function: " + functionName);
            return null;
        }
    }

    @Override
    public Object visitWhile(GramaticaParser.WhileContext ctx) {
        boolean condition = evalBool_expr(ctx.bool_expr());
        var left = ctx.bool_expr().bool_term().bool_factor().bool_comparison().expression(0);
        var right = ctx.bool_expr().bool_term().bool_factor().bool_comparison().expression(1);
        System.out.println("left: " + left + " right: " + right);
        if (condition){
            visit(ctx.statement());
            return null;
        }
        return null;
    }

    @Override
    public Object visitIf_stmt(GramaticaParser.If_stmtContext ctx) {

        boolean condition = evalBool_expr(ctx.bool_expr(0));
        boolean executedElseif = false;

        if (condition){
            visit(ctx.statement(0));
            return null;
        }else {
            int elseifcount = ctx.ELSEIF().size();

            for (int i = 0; i < elseifcount; i++){
                boolean elseifcond = evalBool_expr(ctx.bool_expr(i+1));
                if (elseifcond){
                    System.out.println("entra al elseif");
                    visit(ctx.statement(i+1));
                    executedElseif = true;
                    break;
                }
            }

            if (executedElseif == false && ctx.ELSE() != null) {
                // Ejecutar el statement dentro del else
                System.out.println("Entra al else");
                visit(ctx.statement(elseifcount + 1));
            }
        }
        return null;
    }

    private boolean evalBool_expr(GramaticaParser.Bool_exprContext ctx){
        return evalBool_term(ctx.bool_term());
//        return false;
    }

    private boolean evalBool_term(GramaticaParser.Bool_termContext ctx){
        return evalBool_factor(ctx.bool_factor());
//        return false;
    }

    private boolean evalBool_factor(GramaticaParser.Bool_factorContext ctx){
        return evalBool_comparison(ctx.bool_comparison());
//        return false;
    }

    private boolean evalBool_comparison(GramaticaParser.Bool_comparisonContext ctx){
        int left = evalExpression(ctx.expression(0));
        int right = evalExpression(ctx.expression(1));

        if (ctx.EQUALS() != null){
            return  left == right;
        } else if (ctx.NOTEQUALS() != null) {
            return left != right;
        } else if (ctx.GREATER() != null) {
            return left > right;
        } else if (ctx.LESS() != null) {
            return left < right;
        }else if (ctx.GREATEREQ() != null) {
            return left >= right;
        }else if (ctx.LESSEQ() != null) {
            return left <= right;
        }
        return false;
    }

    private int evalExpression(GramaticaParser.ExpressionContext ctx){
       try {
           if (ctx.INTEGER() != null){
               return Integer.parseInt(ctx.INTEGER().getText());
           } else if (ctx.ID() != null) {
               String varValue = symbolTable.get(ctx.ID().getText()).toString();
               return Integer.parseInt(varValue);
           } else {
               int left = evalExpression(ctx.expression(0));
               int right = evalExpression(ctx.expression(1));
               if (ctx.PLUS() != null) {
                   return left + right;
               }else if (ctx.MINUS() != null) {
                   return left - right;
               }else if (ctx.TIMES() != null) {
                   return left * right;
               }else if (ctx.DIV() != null) {
                   return left / right;
               }else{
                   return 0;
               }
           }
       }catch (Exception E){

       }

        return 0;
    }

}


