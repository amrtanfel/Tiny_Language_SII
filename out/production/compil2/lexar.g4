lexer grammar lexar;

ENTIER:[+-]?([1-9][0-9]*|'0');
REAL:'0'|[+-]?[1-9][0-9]*('.'[0-9]*) ;
IDF:[a-zA-Z][a-zA-Z0-9]*;
//COMET: "/*"(.)*"*/"' | '//(.)*;
OPERATOR:'-'|'+'|'/'|'*';
AFFECT :'=';
OP_COMP: '<' | '>' | '<=' | '>=' | '<>' | '==';
PRM_NAME: [A-Z]([_]?[a-z A-Z])*;
MESSAGE: '"'(~["])*'"';
CTE:([1-9][0-9]*|'0');
WHITESPACE : [ \n\t\r] -> skip;
