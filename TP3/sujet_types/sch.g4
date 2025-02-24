grammar sch;//Soft Compiler Hub
//Règles de grammaire


program : (statement|methodDecl)*;

methodDecl : type Id '(' (formal (',' formal)*)? ')' statement ;

formal : type Id;

type : 'int'		#intType
	|'boolean'	#boolType
;
 statement : '{' statement* '}'				#statList
	|'if' '(' exp ')' statement 'else' statement	#statIf
	|'while' '(' exp ')' statement			#statWhile
	|'print' '(' exp ')' ';'			#statPrint
	|Id '=' exp ';'					#statAff
	|'return' exp ';'				#statReturn
	|type Id ';'					#statVarDecl
;

exp : exp Binop exp			#exBinop
	|Unop exp			#exUnop
	|Int				#exInt	
	|'true'				#exTrue
	|'false'			#exFalse	
	|Id				#exId
	|'(' exp ')'			#exParenthesis
	|Id '(' (exp (',' exp)*)?  ')'	#exCall
	|'read' '(' ')'			#exRead
;


//Lexèmes

Binop : '&&' |'<' |'>'|'!='|'/'| '+' 
	|'*'|'=='|'+='|'||'|'<='|'>='|'-' ;
Unop : '!'|'-' ;

WS : [ \t\r\n]+ -> skip;


Id : [a-zA-Z][0-9a-zA-Z_]*;
Int : [0-9]+;
