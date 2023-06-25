import Parser.GramaticaBaseVisitor;
import Parser.GramaticaParser;
import Parser.*;
import org.antlr.v4.runtime.Token;



import java.util.*;

public class MyVisitor extends GramaticaBaseVisitor<Object>
{
    private StringBuilder llvmCode;

    public MyVisitor() {
        llvmCode = new StringBuilder();
    }
    public String getLLVMCode() {
        return llvmCode.toString();
    }

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
        llvmCode.append("; LLVM code for prule\n");
        llvmCode.append("define i32 @main() {\n");
        visitChildren(ctx);
        llvmCode.append("\tret i32 0\n");
        llvmCode.append("}\n");
        return null;
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
    private int llvmCodeIndex = 0;

    private int getNextIndex() {
        return llvmCodeIndex++;
    }

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

        // Define and initialize the llvmCodeIndex
        int llvmCodeIndex = getNextIndex();

        // Append LLVM code for writeln statement
        llvmCode.append("; LLVM code for writeln statement\n");
        llvmCode.append("@.str").append(llvmCodeIndex).append(" = private unnamed_addr constant [");
        llvmCode.append(output.length() + 1); // +1 to account for null terminator
        llvmCode.append(" x i8] c\"");
        llvmCode.append(output).append("\\00\"\n");
        llvmCode.append("call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([");
        llvmCode.append(output.length() + 1); // +1 to account for null terminator
        llvmCode.append(" x i8], [");
        llvmCode.append(output.length() + 1);
        llvmCode.append(" x i8]* @.str");
        llvmCode.append(llvmCodeIndex);
        llvmCode.append(", i32 0, i32 0))\n");

        System.out.println(output+"\n");
        return null;
    }


    @Override
    public String visitReadln_statement(GramaticaParser.Readln_statementContext ctx) {
        String id = ctx.ID().getText();

        // Append LLVM code for readln statement
        llvmCode.append("; LLVM code for readln statement\n");
        llvmCode.append("%").append(id).append(" = alloca i8*, align 8\n");
        llvmCode.append("call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.str0, i32 0, i32 0), i8* getelementptr inbounds ([100 x i8], [100 x i8]* @.str1, i32 0, i32 0), i8** %").append(id).append(")\n");

        // Read input from the user
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Store the input in the symbol table
        symbolTable.put(id, input);

        System.out.println("You entered: " + input + id);
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
       // String expressionType = visit(ctx.expression()).toString();

//        if (symbolTable.containsKey(variable)) {
//            String variableType = symbolTable.get(variable).toString();
//            if (!variableType.equals(expressionType)) {
//                System.err.println("Error de tipo: La asignación de " + variable + " es incompatible con el tipo " + expressionType);
//            }
//        } else {
//            System.err.println("Error de declaración: La variable " + variable + " no está declarada.");
//        }

        // Append LLVM code for assignment statement
        llvmCode.append("; LLVM code for assign statement\n");
        llvmCode.append("%").append(varName).append(" = alloca i32, align 4\n");
        llvmCode.append("store i32 ").append(exprValue.expressionValue).append(", i32* %").append(varName).append(", align 4\n");

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
        List<String> vars = new ArrayList<>();

        try {
            for (int i = 0; i < ctx.ID().size(); i++) {
                vars.add(ctx.ID(i).getText());
            }

            List<String> elementos = encontrarElementosRepetidos(vars);

            for (int i = 0; i < ctx.ID().size(); i++) {
                String varName = ctx.ID(i).getText();

                for (int j = 0; j < elementos.size(); j++) {
                    if (varName.equals(elementos.get(j))) {
                        Token idToken = ctx.ID(i).getSymbol();
                        String token = idToken.getText();
                        int line = idToken.getLine();
                        int column = idToken.getCharPositionInLine() + 1;
                        String errorMsg = "Error: Variable " + token + " en la línea " + line + ", columna " + column + " - la variable está repetida";
                        erroresSemanticos.add(errorMsg);
                        System.out.println(errorMsg);
                    }
                }

                for (int j = 0; j < ctx.type().size(); j++) {
                    String varType = ctx.type(j).getText();
                    symbolTable.put(varName, varType);

                    // Generate LLVM code for variable declaration
                    llvmCode.append("; Variable declaration\n");
                    llvmCode.append("%").append(varName).append(" = alloca ");

                    if (varType.equals("INTEGER")) {
                        llvmCode.append("i32\n");
                    } else if (varType.equals("float")) {
                        llvmCode.append("float\n");
                    } else if (varType.equals("double")) {
                        llvmCode.append("double\n");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    @Override
    public Object visitExpression(GramaticaParser.ExpressionContext ctx) {
        if (ctx.INTEGER() != null) {
            llvmCode.append("\t; Generating LLVM code for INTEGER expression\n");
            llvmCode.append("\t%tmp = alloca i32\n");  // Allocate memory for the integer
            llvmCode.append("\tstore i32 ").append(ctx.INTEGER().getText()).append(", i32* %tmp\n");  // Store the value in the allocated memory
            return "Integer";
        } else if (ctx.CHAR() != null) {
            llvmCode.append("\t; Generating LLVM code for CHAR expression\n");
            llvmCode.append("\t%tmp = alloca i8\n");  // Allocate memory for the character
            llvmCode.append("\tstore i8 ").append(ctx.CHAR().getText()).append(", i8* %tmp\n");  // Store the value in the allocated memory
            return "CHAR";
        } else if (ctx.STRING() != null) {
            llvmCode.append("\t; Generating LLVM code for STRING expression\n");
            llvmCode.append("\t@str = private unnamed_addr constant ").append(ctx.STRING().getText()).append("\n");  // Define the string constant
            llvmCode.append("\t%tmp = getelementptr [").append(ctx.STRING().getText().length() + 1).append(" x i8], [").append(ctx.STRING().getText().length() + 1).append(" x i8]* @str, i32 0, i32 0\n");  // Get a pointer to the string constant
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
            // Check if the control variable is an Integer
            if (ctx.INTEGER(0) != null) {
                if (!isInteger(ctx.INTEGER(0).getText())) {
                    // Handle error for non-integer control variable
                    idToken = ctx.ID(0).getSymbol();
                    int line = idToken.getLine();
                    int column = idToken.getCharPositionInLine() + 1;
                    erroresSemanticos.add("Error: Variable " + idToken + " en la linea: " + line + " columna " + column + " la variable debe ser un Integer");
                    System.out.println("Error for");
                }
            } else if (ctx.ID(0).toString() == null) {
                // Handle error for missing control variable
                erroresSemanticos.add("Error: Variable, se esperaba Integer");
                System.out.println("Se esperaba integer");
            }

            // Check if the final value is an Integer
            if (ctx.INTEGER(1) != null) {
                if (!isInteger(ctx.INTEGER(1).getText())) {
                    // Handle error for non-integer final value
                    idToken = ctx.ID(1).getSymbol();
                    String nombre = idToken.getText();
                    int line = idToken.getLine();
                    int column = idToken.getCharPositionInLine() + 1;
                    erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable debe ser un Integer");
                    System.out.println("Error for");
                } else {
                    valorFinal = Integer.parseInt(ctx.INTEGER(1).getText());
                }
            } else if (ctx.ID(1).toString() == null) {
                // Handle error for missing final value
                erroresSemanticos.add("Error: Se esperaba Integer");
                System.out.println("Se esperaba integer");
            } else {
                // Get the final value from the symbol table
                valorFinal = Integer.parseInt(symbolTable.get(ctx.ID(1).getText()).toString());
            }

            // Check if the control variable is declared and initialized
            if (!symbolTable.containsKey(ctx.ID(0).getText())) {
                idToken = ctx.ID(0).getSymbol();
                String nombre = idToken.getText();
                int line = idToken.getLine();
                int column = idToken.getCharPositionInLine() + 1;
                erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");
                System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta declarada");
            } else {
                if (symbolTable.get(ctx.ID(0).getText()) == null) {
                    idToken = ctx.ID(0).getSymbol();
                    String nombre = idToken.getText();
                    int line = idToken.getLine();
                    int column = idToken.getCharPositionInLine() + 1;
                    erroresSemanticos.add("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta inicializada");
                    System.out.println("Error: Variable " + nombre + " en la linea: " + line + " columna " + column + " la variable no esta inicializada");
                } else {
                    valorInicial = Integer.parseInt(symbolTable.get(ctx.ID(0).getText()).toString());
                }
            }

            // Generate LLVM code for the for loop
            String controlVariable = ctx.ID(0).getText();
            String indexVariable = "index_" + controlVariable;

            llvmCode.append("; LLVM code for for loop\n");
            llvmCode.append("br label %for.cond\n");
            llvmCode.append("\n");
            llvmCode.append("for.cond:\n");
            llvmCode.append("\t%" + indexVariable + " = phi i32 [ " + valorInicial + ", %entry ], [ %" + controlVariable + ".next, %for.inc ]\n");
            llvmCode.append("\t%" + controlVariable + ".next = add nsw i32 %" + indexVariable + ", 1\n");
            llvmCode.append("\t%cmp = icmp sle i32 %" + indexVariable + ", " + valorFinal + "\n");
            llvmCode.append("\tbr i1 %cmp, label %for.body, label %for.end\n");
            llvmCode.append("\n");
            llvmCode.append("for.body:\n");
            visitChildren(ctx.statement());
            llvmCode.append("\tbr label %for.inc\n");
            llvmCode.append("\n");
            llvmCode.append("for.inc:\n");
            llvmCode.append("\tbr label %for.cond\n");
            llvmCode.append("\n");
            llvmCode.append("for.end:\n");

        } catch (Exception e) {
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
            List<GramaticaParser.ParametrosContext> parametroContextList = parametrosContext.parametros();


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
    private int tempVariableCount = 0;
    private String getNewTempVariable(String prefix) {
        int count = tempVariableCount++;
        return "%" + prefix + count;
    }
    private String generateComparisonCode(String operator, String leftValue, String rightValue) {
        String comparisonResult = getNewTempVariable("cmp");

        llvmCode.append(comparisonResult).append(" = icmp ")
                .append(operator).append(" i32 ").append(leftValue)
                .append(", ").append(rightValue).append("\n");

        return comparisonResult;
    }

    private String generateExpressionCode(GramaticaParser.ExpressionContext ctx, String destVar) {
        String expressionCode = "";

        if (ctx.INTEGER() != null) {
            String value = ctx.INTEGER().getText();
            // Generate LLVM code to store the integer value in the destination variable
            expressionCode += destVar + " = alloca i32\n";
            expressionCode += "store i32 " + value + ", i32* " + destVar + "\n";
        } else if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            // Retrieve the value from the symbol table
            Integer varValue = (Integer) symbolTable.get(varName);
            if (varValue != null) {
                // Generate LLVM code to store the variable value in the destination variable
                expressionCode += destVar + " = alloca i32\n";
                expressionCode += "store i32 " + varValue + ", i32* " + destVar + "\n";
            } else {
                throw new RuntimeException("Undefined variable: " + varName);
            }
        } else if (ctx.STRING() != null || ctx.bool_literal() != null || ctx.CHAR() != null) {
            throw new RuntimeException("Unsupported expression type: " + ctx.getText());
        } else if (ctx.PLUS() != null) {
            // Evaluate left and right operands
            String leftVar = getNewTempVariable("tmp");
            String rightVar = getNewTempVariable("tmp");
            String leftCode = generateExpressionCode(ctx.expression(0), leftVar);
            String rightCode = generateExpressionCode(ctx.expression(1), rightVar);
            // Generate LLVM code to perform addition and store the result in the destination variable
            expressionCode += leftCode;
            expressionCode += rightCode;
            expressionCode += destVar + " = add i32 " + leftVar + ", " + rightVar + "\n";
        } else if (ctx.MINUS() != null) {
            // Evaluate left and right operands
            String leftVar = getNewTempVariable("tmp");
            String rightVar = getNewTempVariable("tmp");
            String leftCode = generateExpressionCode(ctx.expression(0), leftVar);
            String rightCode = generateExpressionCode(ctx.expression(1), rightVar);
            // Generate LLVM code to perform subtraction and store the result in the destination variable
            expressionCode += leftCode;
            expressionCode += rightCode;
            expressionCode += destVar + " = sub i32 " + leftVar + ", " + rightVar + "\n";
        } else if (ctx.TIMES() != null) {
            // Evaluate left and right operands
            String leftVar = getNewTempVariable("tmp");
            String rightVar = getNewTempVariable("tmp");
            String leftCode = generateExpressionCode(ctx.expression(0), leftVar);
            String rightCode = generateExpressionCode(ctx.expression(1), rightVar);
            // Generate LLVM code to perform multiplication and store the result in the destination variable
            expressionCode += leftCode;
            expressionCode += rightCode;
            expressionCode += destVar + " = mul i32 " + leftVar + ", " + rightVar + "\n";
        } else if (ctx.DIV() != null) {
            // Evaluate left and right operands
            String leftVar = getNewTempVariable("tmp");
            String rightVar = getNewTempVariable("tmp");
            String leftCode = generateExpressionCode(ctx.expression(0), leftVar);
            String rightCode = generateExpressionCode(ctx.expression(1), rightVar);
            // Generate LLVM code to perform division and store the result in the destination variable
            expressionCode += leftCode;
            expressionCode += rightCode;
            expressionCode += destVar + " = sdiv i32 " + leftVar + ", " + rightVar + "\n";
        } else {
            throw new RuntimeException("Unknown expression type: " + ctx.getText());
        }

        return expressionCode;
    }


    @Override
    public Object visitWhile(GramaticaParser.WhileContext ctx) {
        boolean condition = evalBool_expr(ctx.bool_expr());
        String operator = "";

        if (ctx.bool_expr().bool_term().bool_factor().bool_comparison().EQUALS() != null) {
            operator = "eq";
        } else if (ctx.bool_expr().bool_term().bool_factor().bool_comparison().NOTEQUALS() != null) {
            operator = "ne";
        } else if (ctx.bool_expr().bool_term().bool_factor().bool_comparison().GREATER() != null) {
            operator = "sgt";
        } else if (ctx.bool_expr().bool_term().bool_factor().bool_comparison().LESS() != null) {
            operator = "slt";
        } else if (ctx.bool_expr().bool_term().bool_factor().bool_comparison().GREATEREQ() != null) {
            operator = "sge";
        } else if (ctx.bool_expr().bool_term().bool_factor().bool_comparison().LESSEQ() != null) {
            operator = "sle";
        } else {
            throw new RuntimeException("Unknown comparison operator");
        }
        var left = ctx.bool_expr().bool_term().bool_factor().bool_comparison().expression(0);
        var right = ctx.bool_expr().bool_term().bool_factor().bool_comparison().expression(1);
        System.out.println("left: " + left + " right: " + right);


        String loopHeader = "while.header";
        String loopBody = "while.body";
        String loopExit = "while.exit";

        llvmCode.append("; LLVM code for while loop\n");
        llvmCode.append("br label %" + loopHeader + "\n");
        llvmCode.append("\n");
        llvmCode.append(loopHeader + ":\n");
        llvmCode.append("\t; Evaluate the loop condition\n");
        // Generate LLVM code for evaluating the condition expressions 'left' and 'right'
        String leftValue = generateExpressionCode(left, "%left");
        String rightValue = generateExpressionCode(right, "%right");
        String conditionResult = generateComparisonCode(operator,leftValue, rightValue); // add the operator
        llvmCode.append("\tbr i1 " + conditionResult + ", label %" + loopBody + ", label %" + loopExit + "\n");
        llvmCode.append("\n");
        llvmCode.append(loopBody + ":\n");
        // Generate LLVM code for the loop body
        visitChildren(ctx.statement());
        llvmCode.append("\tbr label %" + loopHeader + "\n");
        llvmCode.append("\n");
        llvmCode.append(loopExit + ":\n");

        return null;
    }


    @Override
    public Object visitIf_stmt(GramaticaParser.If_stmtContext ctx) {
        boolean condition = evalBool_expr(ctx.bool_expr(0));
        boolean executedElseif = false;

        if (condition) {
            visit(ctx.statement(0));
        } else {
            int elseifCount = ctx.ELSEIF().size();

            String ifLabel = "if.then";
            String elseLabel = (elseifCount > 0 || ctx.ELSE() != null) ? "if.else" : "if.end";
            String mergeLabel = (elseifCount > 0 || ctx.ELSE() != null) ? "if.merge" : "if.end";

            // Generate LLVM code for the condition evaluation
            String conditionValue = generateExpressionCode(ctx.bool_expr(0).bool_term().bool_factor().bool_comparison().expression(0), "%condition");
            String rightValue = generateExpressionCode(ctx.bool_expr(0).bool_term().bool_factor().bool_comparison().expression(1), "%condition");

            // Branch to the if.then or if.else block based on the condition
            llvmCode.append("br i1 ").append(conditionValue).append(", label %").append(ifLabel)
                    .append(", label %").append(elseLabel).append("\n");

            // Generate LLVM code for the if.then block
            llvmCode.append(ifLabel).append(":\n");
            visit(ctx.statement(0));
            llvmCode.append("br label %").append(mergeLabel).append("\n");

            if (elseifCount > 0) {
                // Generate LLVM code for the elseif blocks
                for (int i = 0; i < elseifCount; i++) {
                    String elseifLabel = "elseif" + i;
                    String elseifMergeLabel = (i == elseifCount - 1) ? mergeLabel : "elseif" + (i + 1);

                    llvmCode.append(elseLabel).append(":\n");
                    boolean elseifCondition = evalBool_expr(ctx.bool_expr(i + 1));
                    String elseifConditionValue = generateExpressionCode(ctx.bool_expr(i + 1).bool_term().bool_factor().bool_comparison().expression(0), "%condition");
                    String elseifRightValue = generateExpressionCode(ctx.bool_expr(i + 1).bool_term().bool_factor().bool_comparison().expression(1), "%condition");
                    llvmCode.append("br i1 ").append(elseifConditionValue).append(", label %").append(elseifLabel)
                            .append(", label %").append(elseifMergeLabel).append("\n");

                    llvmCode.append(elseifLabel).append(":\n");
                    visit(ctx.statement(i + 1));
                    llvmCode.append("br label %").append(mergeLabel).append("\n");

                    elseLabel = elseifMergeLabel;
                    executedElseif = true;
                }
            }

            if (!executedElseif && ctx.ELSE() != null) {
                // Generate LLVM code for the else block
                llvmCode.append(elseLabel).append(":\n");
                visit(ctx.statement(elseifCount + 1));
                llvmCode.append("br label %").append(mergeLabel).append("\n");
            }

            // Generate LLVM code for the merge label
            llvmCode.append(mergeLabel).append(":\n");
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





