grammar Gramatica;

PROCEDURE: 'procedure';
FUNCTION: 'function';
SEMICOLON:  ';';
VALUE: 'Value';
PUNTOS: ':';
FOR: 'for';
TO: 'to';
DO: 'do';
IF: 'if';
ELSEIF: 'else if';
ELSE: 'else';
LLAVE_ABR: '[';
LLAVE_CIERRA: ']';
ASIGNACION : ':=';
EQUALS: '==';
NOTEQUALS: '<>';
GREATER: '>';
LESS: '<';
GREATEREQ: '>=';
LESSEQ: '<=';
NOT: '!';
AND: '&&';
OR: '||';

THEN: 'then';
WHILE: 'while';
REPEAT: 'repeat';
UNTIL: 'until';

INTEGER     : [0-9]+ ;
NUM: 'INTEGER';
TYPESTRING: 'STRING';
STRING  : '"' (~["\r\n] | '""')* '"';
//if single quotes just allow 1 char
CHAR   : '\'' (~["\r\n] | '\'') '\'' ;
Whitespace : [ \t\r\n]+ ->skip ;
COMMENT : '{' ~[\t]* '}' -> skip;
TRUE: 'true';
FALSE: 'false';
ARRAY   : 'array';
COMILLA :  ',';
ID: [a-zA-Z_] [a-zA-Z0-9_]*;
PAR_ABRE: '(';
PAR_CIERRA: ')';
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIV: '/';
// rule
prule : 'program' ID SEMICOLON initVars (program*) '.' ;
program: begin statement end | function | procedure;
initVars : assign_statement* | var ;
var  : 'Var' ID PUNTOS type SEMICOLON | ID PUNTOS STRING LLAVE_ABR INTEGER LLAVE_CIERRA | 'Var' ID PUNTOS type (',' ID PUNTOS type)* SEMICOLON
| 'Var' ID (',' ID)*  PUNTOS type SEMICOLON
(decl)*
| ID PUNTOS type SEMICOLON {notifyErrorListeners("Falta palabra Var");}
|'Var' ID PUNTOS type SEMICOLON SEMICOLON {notifyErrorListeners("Error de Comillas");}
|'Var'ID PUNTOS SEMICOLON  {notifyErrorListeners("Especifique el tipo");}
|'Var'ID type SEMICOLON{notifyErrorListeners("No se encontraron los puntos");};
assign_statement: ID ':=' expression ';';
expression :
           | bool_literal
           | INTEGER
           | ID
           | STRING
           | CHAR
           | expression '+' expression
           | expression '-' expression
           | expression '*' expression
           | expression '/' expression
           | '(' expression ')' ;
type    : (INTEGER | STRING | bool_literal | CHAR | NUM | TYPESTRING);
array_declaration : 'array' ID '[' INTEGER ']' ';';
begin   : 'begin' ;
end     : 'end' ;
writeln_statement: 'writeln' '(' (STRING | ID) ')' ';' ;
readln_statement: 'readln' '(' ID ')' ';' ;
decl:  ID ASIGNACION INTEGER SEMICOLON | ID ASIGNACION ID SEMICOLON
| ID ASIGNACION INTEGER SEMICOLON SEMICOLON {notifyErrorListeners("Error de Comillas");}
| ID INTEGER SEMICOLON {notifyErrorListeners("Falta Token Asignacion");};
procedure: PROCEDURE ID PAR_ABRE parametros PAR_CIERRA begin statement end '.'
| PROCEDURE ID SEMICOLON begin statement end
| PROCEDURE ID parametros {notifyErrorListeners("Falto comillas");};
for: FOR INTEGER TO INTEGER DO begin statement end SEMICOLON | FOR ID TO ID DO begin statement end SEMICOLON
|FOR TO ID DO begin statement end SEMICOLON {notifyErrorListeners("Falto valor");}
|FOR ID TO DO begin statement end SEMICOLON {notifyErrorListeners("Falto valor");}
|FOR ID  ID DO begin statement end SEMICOLON {notifyErrorListeners("Falto palabra reservada");}
| FOR ID TO ID  begin statement end SEMICOLON {notifyErrorListeners("Falto palabra reservada");}
|FOR ID TO ID  statement end SEMICOLON {notifyErrorListeners("Falto Begin");}
|FOR ID TO ID  begin statement  SEMICOLON {notifyErrorListeners("Falto End");};
parametros: ID PUNTOS type | COMILLA ID PUNTOS type parametros
| ID type {notifyErrorListeners("Falto :");}
|ID PUNTOS {notifyErrorListeners("Especificar Tipo");};
function : FUNCTION ID PAR_ABRE parametros PAR_CIERRA PUNTOS type begin statement end SEMICOLON;

while: WHILE PAR_ABRE INTEGER bool_expr INTEGER PAR_CIERRA DO begin statement end SEMICOLON
|WHILE PAR_ABRE ID bool_expr ID PAR_CIERRA DO begin statement end SEMICOLON;

repeat: REPEAT statement UNTIL INTEGER bool_expr INTEGER SEMICOLON
|REPEAT statement UNTIL ID bool_expr ID SEMICOLON;

//eliminate statement left recursion
statement : assign_statement statement | assign_statement* | for*| writeln_statement*| writeln_statement statement  | readln_statement statement
| readln_statement*
| array_declaration*
| array_declaration statement
| if_stmt statement
| if_stmt*
| for statement
| for*
| while statement
| while*
| repeat statement
| repeat*;
//expression : term ( '+' | '-' | 'or' ) term ;
//term    : factor ( '*' | '/' | 'and' ) factor ;
// read and write
if_stmt: IF PAR_ABRE bool_expr PAR_CIERRA statement (ELSEIF PAR_ABRE bool_expr PAR_CIERRA statement)* (ELSE statement)?;
bool_comparison: expression (EQUALS|NOTEQUALS|GREATER|LESS|GREATEREQ|LESSEQ) expression;
bool_expr: bool_term
         | bool_expr OR bool_term
         ;
bool_term: bool_factor
         | bool_term AND bool_factor
         ;
bool_factor: bool_literal
           | PAR_ABRE bool_expr PAR_CIERRA
           | NOT bool_factor
           | bool_comparison
           ;
bool_literal: TRUE | FALSE;



segundo: ;