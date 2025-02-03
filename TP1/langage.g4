grammar langage;

// Lexèmes
TYPE : 'bool' | 'int' | 'float';
ID : [a-zA-Z_][a-zA-Z_0-9]*;
INT : [0-9]+;
FLOAT : [0-9]+ '.' [0-9]* | [0-9]* '.' [0-9]+;

// Expressions
expression :
    expression ('+' | '-' | '*' | '/' | '&&' | '||' | '<' ) expression #binaryOp
    | '(' expression ')' #parenthesis
    | ID #identifier
    | INT #integer
    | FLOAT #float
    | array_access #arrayAccess
;

array_access : ID '[' expression ']' #arrayElement;

// Instructions
instruction :
    'print' '(' expression ')' ';' #print
    | 'read' '(' ID ')' ';' #read
    | ID '[' expression ']' '=' expression ';' #arrayAssign
    | TYPE ID ('=' expression)? ';' #declaration
    | ID '=' expression ';' #assign
    | 'if' '(' expression ')' '{' instruction* '}' ('else' '{' instruction* '}')? #conditional
    | 'while' '(' expression ')' '{' instruction* '}' #while
    | ID '++' ';' #increment
    | ID '--' ';' #decrement
    
;

// Programme
prog : instruction* EOF;

COMMENT : '#' ~( '\r' | '\n' )* -> skip;
WS : [ \t\r\n]+ -> skip;