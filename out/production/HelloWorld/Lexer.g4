grammar Lexer;

//El  proyecto  a  desarrollar  durante  este  curso  consiste  en  la  implementación  de  un 
// compilador  para  el  lenguaje  Mini-Pascal,  un  subconjunto  del  lenguaje  Pascal,  cuya 
// sintaxis se define más adelante en este documento.

// tokens

INTEGER     : [0-9]+ ;
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
STRING  : '"' (~["\r\n] | '""')* '"' ;
CHAR    : '\'' (~['\r\n] | '\'\'')* '\'' ;
WS      : [ \n\t]+ -> skip ;
COMMENT : '{' ~[\r]* '}' -> skip;
BOOLEAN : 'true' | 'false';
ARRAY   : 'array';

// rule
prule : 'program' ID ';' begin statement end '.' ;
var     : ID ':=' type ';' ;
type    : INTEGER | STRING | BOOLEAN | CHAR | 'array' '[' INTEGER | CHAR | BOOLEAN ']' 'of' type ;
array   : 'array' '[' INTEGER | CHAR | BOOLEAN']' 'of' type ;
begin   : 'begin' ;
end     : 'end' ;
statement : ID ':=' expression ';' ;
expression : term ( '+' | '-' | 'or' ) term ;
term    : factor ( '*' | '/' | 'and' ) factor ;
factor  : INTEGER | ID | '(' expression ')' | 'not' factor | 'true' | 'false' | STRING | CHAR | array ;
segundo: ;