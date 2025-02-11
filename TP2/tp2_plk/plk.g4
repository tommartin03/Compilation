grammar plk;  //Programming Language Kit

prog: (varDecl | stat)* ;

stat: assignStat | exp ;

assignStat: ID '=' exp Pv ;

exp:
       INT                                    		#expInt
      |ID                                  		#expID
      |Const                              		#expConst
      |exp Op exp                         		#expBin
      |Op exp             				#expUn
      |'(' exp ')'                           		#expPar
;

Pv: ';';

// Lexèmes :

Op:'*'|'+'|'-'|'&&'|'||'|'=='|'<' | 'not'|'abs';
WS:[ \t\n\r] -> skip;
INT:[0-9]+;
Const:'true'|'false';
Type: 'bool' | 'int' ;
ID:[a-zA-Z][a-zA-Z0-9]*;

// Déclaration de variable
varDecl: Type ID Pv;