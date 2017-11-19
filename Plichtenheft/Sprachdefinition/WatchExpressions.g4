
grammar WatchExpressions;
r: we;

we: comparison | term


//Bedingungen
comparison: left=term '<' right=term #LessComp
	   | left=term '<=' right=term #LessEqualComp
	   | left=term '>' right=term #MoreComp
	   | left=term '>=' right=term #MoreEqualComp
	   | left=term '==' right=term #EqualComp
	   | left=term '!=' right=term #NotEqualComp
	;


term : left = term '/' right = term #Division
	| left = term '*' right = term #Multiplication
	| left = term '-' right = term #Subtraction
	| left = term '+' right = term #Addition
	| left = term '%' right = term #Modulo
	|'('term')' #Brackets
	| FLOATLITERAL #FloatLiteral
	| INTLITERAL #IntLiteral
	| ID #ID
	| CHARLITERAL #CharLiteral
	| arrayAccess #ArrayAccessInTerm
	;

arrayAccess: id = ID '['index=term']' #OneDimArrayAccess
		| id = ID '['firstIndex=term']' '['secondIndex=term']' #TwoDimArrayAccess
		| id = ID '['firstIndex=term']' '['secondtIndex=term']' '['thirdIndex=term']' #ThreeDimArrayAccess
		;

//LITERALE bzw TOKENS

COMPOPERATOR:  '<'|'>'|'<='|'>='|'==';
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
COMMENT:   '/*' .*? '*/' -> skip;
LINE_COMMENT:   '//' ~[\r\n]* -> skip;
TYPE: 'float' | 'int' | 'char' | 'boolean';
ID : [A-Z]'.'([a-z]|[A-Z])+ ;
INTLITERAL: [1-9][0-9]* | '0';
FLOATLITERAL: [1-9][0-9]*'.'[0-9]+ | '0';
CHARLITERAL: '\'' ~['\\\r\n] '\'';
BOOLEANLITERAL:	'true'|	'false';
NULLLITERAL: 'null';
ASSIGN: '=';

