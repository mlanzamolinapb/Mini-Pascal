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
LLAVE_ABR: '[';
LLAVE_CIERRA: ']';
ASIGNACION : ':=';

INTEGER     : [0-9]+ ;
NUM: 'INTEGER';
TYPESTRING: 'STRING';
STRING  : '"' (~["\r\n] | '""')* '"';

//if single quotes just allow 1 char
CHAR   : '\'' (~["\r\n] | '\'') '\'' ;
Whitespace : [ \t\r\n]+ ->skip ;
COMMENT : '{' ~[\t]* '}' -> skip;
BOOLEAN: TRUE | FALSE;
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
program: begin statement end;
initVars : assign_statement* | var ;
var     : 'Var' ID PUNTOS type SEMICOLON | ID PUNTOS STRING LLAVE_ABR INTEGER LLAVE_CIERRA |
begin (decl)* end
|ID PUNTOS type SEMICOLON SEMICOLON {notifyErrorListeners("Error de Comillas");}
|ID PUNTOS SEMICOLON  {notifyErrorListeners("Especifique el tipo");}
|ID type SEMICOLON{notifyErrorListeners("No se encontraron los puntos");};
assign_statement: ID ':=' expression ';';
expression :
           | BOOLEAN
           | INTEGER
           | ID
           | STRING
           | CHAR
           | expression '+' expression
           | expression '-' expression
           | expression '*' expression
           | expression '/' expression
           | '(' expression ')' ;
type    : (INTEGER | STRING | BOOLEAN | CHAR | NUM | TYPESTRING);

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
//eliminate statement left recursion
statement : assign_statement statement | assign_statement* | for*| writeln_statement*| writeln_statement statement  | readln_statement statement | readln_statement* | array_declaration*| array_declaration statement;
//expression : term ( '+' | '-' | 'or' ) term ;
//term    : factor ( '*' | '/' | 'and' ) factor ;
// read and write

segundo: ;