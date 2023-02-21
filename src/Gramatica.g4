grammar Gramatica;

PROCEDURE: 'procedure';
FUNCTION: 'function';
SEMICOLON:  ';';
ASIGNACION : ':=';
VALUE: 'Value';
PUNTOS: ':';
FOR: 'for';
TO: 'to';
DO: 'do';
IF: 'if';

INTEGER     : [0-9]+ ;
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
STRING  : '"' (~["\r\n] | '""')* '"' ;
//if single quotes just allow 1 char
CHAR   : '\'' (~["\r\n] | '\'') '\'' ;
Whitespace : [ \t\r\n]+ ->skip ;
COMMENT : '{' ~[\t]* '}' -> skip;
BOOLEAN : 'true' | 'false';
ARRAY   : 'array';
COMILLA :  ',';


PAR_ABRE: '(';
PAR_CIERRA: ')';


// rule
prule : 'program' ID SEMICOLON initVars (program*) '.' ;
program: begin statement end;
initVars : var* ;
var     : ID ':=' type SEMICOLON ;
type    : (INTEGER | STRING | BOOLEAN | CHAR | '[' array ']');
array   : (INTEGER | CHAR | BOOLEAN | ','array)*  ;
begin   : 'begin' ;
end     : 'end' ;

for: FOR INTEGER TO INTEGER DO begin statement end SEMICOLON;
parametros: VALUE PUNTOS type SEMICOLON | COMILLA VALUE PUNTOS type parametros;
function: FUNCTION ID PAR_ABRE parametros PAR_CIERRA PUNTOS type begin statement end SEMICOLON;
//eliminate statement left recursion
statement : ID ':=' expression SEMICOLON statement | var* | for;
expression : term ( '+' | '-' | 'or' ) term ;
term    : factor ( '*' | '/' | 'and' ) factor ;
factor  : INTEGER | ID | '(' expression ')' | 'not' factor | 'true' | 'false' | STRING | CHAR | array ;
segundo: ;