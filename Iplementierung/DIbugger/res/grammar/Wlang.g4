
grammar Wlang;
r: programm;
webppterm: condition | term;


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

arrayDeclaration: type = TYPE '[' index = term']' id = ID ';' #arrayDeclarationOneDim
					| type = TYPE '[' firstIndex = term']' '['secondIndex=term']' id = ID ';' #arrayDeclarationTwoDim
					| type = TYPE '[' firstIndex = term']' '['secondIndex=term']' '[' thirdIndex = term']' id = ID ';' #arrayDeclarationThreeDim
					;
					
arrayDeclareAssign: type = TYPE dims id = ID ASSIGN '{'filledArglist'};';

arrayElementAssign: id = ID '['index=term']'  ASSIGN value = term';' #arrayElementAssignOneDim
		| id = ID '['firstIndex=term']' '['secondIndex=term']'  ASSIGN value = term';' #arrayElementAssignTwoDim
		| id = ID '['firstIndex=term']' '['secondIndex=term']' '['thirdIndex=term']'  ASSIGN value = term';' #arrayElementAssignThreeDim
		;

dims: '['term']' #oneDims
	| '['term']''['term']' #twoDims
	| '['term']''['term']''['term']' #threeDims
	;


pureAssign: id = ID ASSIGN value = term ';';
declareAssign: type = TYPE id = ID ASSIGN value = term ';';
declaration: type = TYPE id = ID ';';
returnState: 'return' returnvalue = term ';';

//Kontrollstrukturen
ifState: 'if' '(' condition ')' content = block #ifWithBlock
	| 'if' '('condition ')' content = statement #ifWithSingle
	;
ifelseState: ifPart = ifState 'else' content = block #ifElseWithBlock
	| ifPart = ifState 'else' content = statement #ifElseWithSingle
	;
whileState: 'while' '(' condition ')' content = block #whileWithBlock
	| 'while' '('condition ')' content = statement #whileWithSingle
	;
//Bedingungen
condition: ID #IdCondition
	| REL_ID #RelIdCondition
	| arrayAccess #ArrayAccessCondition
	| comparison #ComparisonCondition
	| BOOLEANLITERAL #ConstantCondition
	| '('inner = condition')'#BracketCondition
	| left = condition '&&' right = condition #AndCondition
	| left = condition '||' right = condition #OrCondition
	| '!' inner = condition #NotCondition
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
	|'('inner = term')' #Brackets
	| FLOATLITERAL #FloatLiteral
	| INTLITERAL #IntLiteral
	| LONGLITERAL #LongLiteral
	| DOUBLELITERAL #DoubleLiteral
	| ID #Id
	| REL_ID #RelId
	| CHARLITERAL #CharLiteral
	| funcCall #FunctionCallInTerm
	| arrayAccess #ArrayAccessInTerm
	;

arrayAccess: id = ID '['index=term']' #OneDimArrayAccess
		| id = ID '['firstIndex=term']' '['secondIndex=term']' #TwoDimArrayAccess
		| id = ID '['firstIndex=term']' '['secondIndex=term']' '['thirdIndex=term']' #ThreeDimArrayAccess
		;


//LITERALE bzw TOKENS



COMPOPERATOR:  '<'|'>'|'<='|'>='|'=='|'!=';
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
COMMENT:   '/*' .*? '*/' -> skip;
LINE_COMMENT:   '//' ~[\r\n]* -> skip;
TYPE: 'float' | 'int' | 'char' | 'boolean' | 'double' | 'long';
ID : ([a-z]|[A-Z])+ ;
REL_ID : [A-Z]'.'([a-z]|[A-Z])+ ;
INTLITERAL: '-'? [1-9][0-9]* | '0';
FLOATLITERAL: ([1-9][0-9]*'.'[0-9]+ | '0') 'f';
CHARLITERAL: '\'' ~['\\\r\n] '\'';
BOOLEANLITERAL:	'true'|	'false';
NULLLITERAL: 'null';
LONGLITERAL: ([1-9][0-9]* | '0' )'L';
DOUBLELITERAL: [1-9][0-9]*'.'[0-9]+ | '0';
ASSIGN: '=';
