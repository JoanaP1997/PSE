
grammar Wlang;
r: statements;


//Statements

statements : statement statements #CompStatement 
			| statement #SingleStatement
			;
statement:  ifState 
		| ifelseState 
		| whileState 
		| assignment 
		| declaration 
				;//or funcCall
		
		
block: '{'statements'}';
assignment: declareAssign
			| pureAssign
			;
pureAssign: id = ID ASSIGN value = term ';';
declareAssign: type = TYPE id = ID ASSIGN value = term ';';
declaration: type = TYPE id = ID ';';

//Kontrollstrukturen
ifState: 'if' '(' condition ')' block
	| 'if' '(' condition ')' statement
	;
ifelseState: ifState 'else' block
	| ifState 'else' statement
	;
whileState: 'while' '(' condition ')' block
	| 'while' '(' condition ')' statement
	;
//Bedingungen
condition: ID #IdCondition
	| comparison #ComparisonCondition
	| BOOLEANLITERAL #PureCondition
	| '('condition')' '||' '('condition')' #OrCondition
	| '('condition')' '&&' '('condition')' #AndCondition
	| '!'condition #NotCondition
	;
comparison: left=term comperator=COMPOPERATOR right=term;


term : left = term '/' right = term #Division
	| left = term '*' right = term #Multiplication
	| left = term '-' right = term #Subtraction
	| left = term '+' right = term #Addition
	| left = term '%' right = term #Modulo
	|'('term')' #Brackets
	| FLOATLITERAL #FloatLiteral
	| INTLITERAL #IntLiteral
	| ID #ID
	;
//maybe func-call here


//LITERALE bzw TOKENS



COMPOPERATOR:  '<'|'>'|'<='|'>='|'==';
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
COMMENT:   '/*' .*? '*/' -> skip;
LINE_COMMENT:   '//' ~[\r\n]* -> skip;
TYPE: 'float' | 'int' | 'char' | 'boolean';
ID : ([a-z]|[A-Z])+ ;
INTLITERAL: [1-9][0-9]* | '0';
FLOATLITERAL: [1-9][0-9]*.[0-9]+ | '0';
CHARLITERAL: '([a-z]|[A-Z])';
BOOLEANLITERAL:	'true'|	'false';
ASSIGN: '=';

