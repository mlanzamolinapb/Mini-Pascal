grammar Gramatica;

INTEGER     : [0-9]+ ;
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
STRING  : '"' (~["\r\n] | '""')* '"' ;
CHAR    : '\'' (~['\r\n] | '\'\'')* '\'' ;
Whitespace : [ \t\r\n]+ ->skip ;
COMMENT : '{' ~[\t]* '}' -> skip;
BOOLEAN : 'true' | 'false';
ARRAY   : 'array';
SEMICOLON:  ';';

// rule
prule : 'program' ID SEMICOLON initVars (program*) '.' ;
program: begin statement end;
initVars : var* ;
var     : ID ':=' type SEMICOLON ;
type    : (INTEGER | STRING | BOOLEAN | CHAR | '[' array ']');
array   : (INTEGER | CHAR | BOOLEAN | ','array)*  ;
begin   : 'begin' ;
end     : 'end' ;
//eliminate statement left recursion
statement : ID ':=' expression SEMICOLON statement | var*;
expression : term ( '+' | '-' | 'or' ) term ;
term    : factor ( '*' | '/' | 'and' ) factor ;
factor  : INTEGER | ID | '(' expression ')' | 'not' factor | 'true' | 'false' | STRING | CHAR | array ;
segundo: ;