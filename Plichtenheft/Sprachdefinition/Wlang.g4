
grammar Wlang;
r: programm;


programm: routine* mainRoutine;
routineHead: returntype = TYPE id = ID '(' args=arglist? ')' #FunctionHead
			| 'void' id =ID '('args=arglist?')' #ProcedureHead
			;

mainHead: returntype = TYPE 'main' '(' args=arglist? ')' #MainFunctionHead
			| 'void' 'main' '('args=arglist?')' #MainProcedureHead
			;

arglist: argument ',' arglist | argument;
argument: type=TYPE id=ID;
filledArglist: filledArgument ',' filledArglist | filledArgument;
filledArgument: term;
routine: routineHead block;
mainRoutine: mainHead block;

//Statements

statements : statement statements #CompStatement 
			| statement #SingleStatement
			;
statement:  ifState 
		| ifelseState 
		| whileState 
		| assignment
		| arrayDeclaration
		| arrayDeclareAssign
		| arrayElementAssign
		| declaration 
		| funcCall ';'	;
		

funcCall: functionname = ID '(' args=filledArglist? ')' 
	  |functionname = 'main' '(' args=filledArglist? ')'
	;

	
block: '{'statements'}';
assignment: declareAssign
			| pureAssign
			;

arrayDeclaration: type = TYPE dims id = ID ';';
arrayDeclareAssign: type = TYPE dims id = ID ASSIGN '{'filledArglist'};';
arrayElementAssign: arrayAccess ASSIGN value = term';';
dims: '['term']' #oneDims
	| '['term']''['term']' #twoDims
	| '['term']''['term']''['term']' #threeDims
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
	| funcCall #FunctionCallInTerm
	| arrayAccess #ArrayAccessInTerm
	;

arrayAccess: id = ID '['index=term']' #OneDimArrayAccess
		| id = ID '['firstIndex=term']' '['secondIndex=term']' #TwoDimArrayAccess
		| id = ID '['firstIndex=term']' '['secondtIndex=term']' '['thirdIndex=term']' #ThreeDimArrayAccess
		;


//LITERALE bzw TOKENS



COMPOPERATOR:  '<'|'>'|'<='|'>='|'=='|'!=';
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
COMMENT:   '/*' .*? '*/' -> skip;
LINE_COMMENT:   '//' ~[\r\n]* -> skip;
TYPE: 'float' | 'int' | 'char' | 'boolean';
ID : ([a-z]|[A-Z])+ ;
INTLITERAL: [1-9][0-9]* | '0';
FLOATLITERAL: [1-9][0-9]*'.'[0-9]+ | '0';
CHARLITERAL: '\'' ~['\\\r\n] '\'';
BOOLEANLITERAL:	'true'|	'false';
NULLLITERAL: 'null';
ASSIGN: '=';

