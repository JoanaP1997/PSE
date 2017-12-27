
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
		| funcCall ';'	
		| returnState;
		

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
returnState: 'return' returnvalue = term ';';

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
	| arrayAccess #ArrayAccessCondition
	| comparison #ComparisonCondition
	| BOOLEANLITERAL #ConstantCondition
	| '('condition')'#BracketCondition
	| condition '&&' condition #AndCondition
	| condition '||' condition #OrCondition
	| '!'condition #NotCondition
	;

comparison: left=term '<' right=term #LessComp
	   | left=term '<=' right=term #LessEqualComp
	   | left=term '>' right=term #MoreComp
	   | left=term '>=' right=term #MoreEqualComp
	   | left=term '==' right=term #EqualComp
	   | left=term '!=' right=term #NotEqualComp
	;

term : '-' inner = term #NegativeTerm
    | left = term '/' right = term #Division
	| left = term '*' right = term #Multiplication
	| left = term '-' right = term #Subtraction
	| left = term '+' right = term #Addition
	| left = term '%' right = term #Modulo
	|'('term')' #Brackets
	| FLOATLITERAL #FloatLiteral
	| INTLITERAL #IntLiteral
	| LONGLITERAL #LongLiteral
	| DOUBLELITERAL #DoubleLiteral
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
TYPE: 'float' | 'int' | 'char' | 'boolean' | 'double' | 'long';
ID : ([a-z]|[A-Z])+ ;
INTLITERAL: '-'? [1-9][0-9]* | '0';
FLOATLITERAL: ([1-9][0-9]*'.'[0-9]+ | '0') 'f';
CHARLITERAL: '\'' ~['\\\r\n] '\'';
BOOLEANLITERAL:	'true'|	'false';
NULLLITERAL: 'null';
LONGLITERAL: ([1-9][0-9]* | '0' )'L';
DOUBLELITERAL: [1-9][0-9]*'.'[0-9]+ | '0';
ASSIGN: '=';
