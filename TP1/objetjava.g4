grammar objetjava;

// Lexèmes
TYPE : 'bool' | 'int' | 'float' | 'void' | 'String';
ID : [a-zA-Z_][a-zA-Z_0-9]*;
INT : [0-9]+;
FLOAT : [0-9]+ '.' [0-9]* | [0-9]* '.' [0-9]+;
STRING : '"' .*? '"';
NEW : 'new';
CLASS : 'class';
EXTENDS : 'extends';
STATIC : 'static';
FINAL : 'final';
PUBLIC : 'public';
PRIVATE : 'private';
PROTECTED : 'protected';
RETURN : 'return';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
PRINT : 'System.out.print';
PRINTLN : 'System.out.println';

// Expressions
expression :
    expression ('+' | '-' | '*' | '/' | '&&' | '||' | '<' | '<=' | '>' | '>=' | '==' | '!=') expression #binaryOp
    | '(' expression ')' #parenthesis
    | ID #identifier
    | INT #integer
    | FLOAT #float
    | STRING #string
    | array_access #arrayAccess
    | method_call_expr #methodCall
    | NEW ID '(' (expression (',' expression)*)? ')' #newObject
;

array_access : ID '[' expression ']' #arrayElement;

method_call_expr : ID '(' (expression (',' expression)*)? ')' #methodCallExpr;

// Instructions
instruction :
    PRINT '(' expression ')' ';' #print
    | PRINTLN '(' expression ')' ';' #println
    | 'read' '(' ID ')' ';' #read
    | ID '[' expression ']' '=' expression ';' #arrayAssign
    | TYPE ID ('=' expression)? ';' #varDeclaration
    | ID '=' expression ';' #assign
    | 'if' '(' expression ')' '{' instruction* '}' ('else' '{' instruction* '}')? #conditional
    | 'while' '(' expression ')' '{' instruction* '}' #while
    | ID '++' ';' #increment
    | ID '--' ';' #decrement
    | RETURN expression? ';' #return
;

// Déclarations
declaration :
    TYPE ID ('=' expression)? ';' #varDecl
    | method_decl #methodDecl
;

// Méthodes
method_decl :
    (PUBLIC | PRIVATE | PROTECTED)? STATIC? FINAL? TYPE ID '(' (param_list)? ')' '{' instruction* '}' #method
;

param_list : TYPE ID (',' TYPE ID)* ;

// Classes
class_decl :
    CLASS ID (EXTENDS ID)? '{' class_body '}' #classDecl
;

class_body : (declaration | method_decl | instruction)* ;

// Programme
prog : class_decl* EOF;

COMMENT : '//' ~[\r\n]* -> skip;
WS : [ \t\r\n]+ -> skip;