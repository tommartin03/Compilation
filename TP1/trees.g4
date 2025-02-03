grammar trees;

//Règles pour grammaire

tree_int : 
	tree_int 'b' tree_int #branche
	|'(' tree_int ')' #par
	|Int #feuille
;
start: tree_int* EOF;

//Règles pour lexèmes

Int : [0-9]+;


COMMENT : '#' ~( '\r' | '\n' )* -> skip;
WS : [ \t\r\n]+ -> skip ; // oublie tabulations, espaces, retours ligne

