package dibugger.DebugLogic.Interpreter;

import dibugger.DebugLogic.AntlrParser.WlangBaseVisitor;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayDeclarationOneDimContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayDeclarationThreeDimContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayDeclarationTwoDimContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayElementAssignOneDimContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayElementAssignThreeDimContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayElementAssignTwoDimContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.FuncCallContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IfElseWithBlockContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IfElseWithSingleContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IfWithBlockContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IfWithSingleContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.PureAssignContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.WhileWithBlockContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.WhileWithSingleContext;

public class CommandGenerationVisitor extends WlangBaseVisitor<Command> {
    private GenerationController controller;
    private TermGenerationVisitor termGenVisitor;
    public CommandGenerationVisitor(GenerationController controller) {
	this.controller = controller;
	this.termGenVisitor = new TermGenerationVisitor();
    }
    //RoutineCommands
   
    
    
    
    //Array Commands
    @Override
    public Command visitArrayDeclarationOneDim(ArrayDeclarationOneDimContext ctx) {
        String identifier = ctx.id.getText();
        Term index = this.termGenVisitor.visit(ctx.index);
        return new ArrayDeclaration(this.controller, ctx.id.getLine(), identifier, index);
    }
    @Override
    public Command visitArrayDeclarationTwoDim(ArrayDeclarationTwoDimContext ctx) {
	String identifier = ctx.id.getText();
        Term firstIndex = this.termGenVisitor.visit(ctx.firstIndex);
        Term secondIndex = this.termGenVisitor.visit(ctx.secondIndex);
        return new ArrayDeclaration(this.controller, ctx.id.getLine(), identifier, firstIndex, secondIndex);  
    }
    @Override
    public Command visitArrayDeclarationThreeDim(ArrayDeclarationThreeDimContext ctx) {
	String identifier = ctx.id.getText();
        Term firstIndex = this.termGenVisitor.visit(ctx.firstIndex);
        Term secondIndex = this.termGenVisitor.visit(ctx.secondIndex);
        Term thirdIndex = this.termGenVisitor.visit(ctx.thirdIndex);
        return new ArrayDeclaration(this.controller, ctx.id.getLine(), identifier, firstIndex, secondIndex, thirdIndex);  
    }
    @Override
    public Command visitArrayElementAssignOneDim(ArrayElementAssignOneDimContext ctx) {
	String identifier = ctx.id.getText();
	Term index = this.termGenVisitor.visit(ctx.index);
	Term value = this.termGenVisitor.visit(ctx.value);
	return new ArrayElementAssignment(this.controller, ctx.id.getLine(), identifier, index, value);
    }
    @Override
    public Command visitArrayElementAssignTwoDim(ArrayElementAssignTwoDimContext ctx) {
	String identifier = ctx.id.getText();
	Term firstIndex = this.termGenVisitor.visit(ctx.firstIndex);
        Term secondIndex = this.termGenVisitor.visit(ctx.secondIndex);
	Term value = this.termGenVisitor.visit(ctx.value);
	return new ArrayElementAssignment(this.controller, ctx.id.getLine(), identifier, firstIndex, secondIndex, value);
    }
    @Override
    public Command visitArrayElementAssignThreeDim(ArrayElementAssignThreeDimContext ctx) {
	String identifier = ctx.id.getText();
	Term firstIndex = this.termGenVisitor.visit(ctx.firstIndex);
        Term secondIndex = this.termGenVisitor.visit(ctx.secondIndex);
        Term thirdIndex = this.termGenVisitor.visit(ctx.thirdIndex);
	Term value = this.termGenVisitor.visit(ctx.value);
	return new ArrayElementAssignment(this.controller, ctx.id.getLine(),  identifier, firstIndex, secondIndex, thirdIndex, value);
    }
    //Assignments and Declaration
    @Override
    public Command visitPureAssign(PureAssignContext ctx) {
	Term value = this.termGenVisitor.visit(ctx.value);
        return new Assignment(this.controller, ctx.id.getLine(), ctx.id.getText(), value);
    }
  /*  @Override
    public Command visitDeclaration(DeclarationContext ctx) {
        return new Declaration(this.controller, ctx.type. irgendwiedenenumwert ,ctx.id.getText());
    }
    @Override
    public Command visitDeclareAssign(DeclareAssignContext ctx) {
	Term value = this.termGenVisitor.visit(ctx.value);
        return new DeclarationAssignment(controller, ctx.type. irgendwiedenenumwert ,ctx.id.getText(), value )
    }*/ //TODO
    //Function Call
    @Override
    public Command visitFuncCall(FuncCallContext ctx) {
        // TODO Auto-generated method stub
        return super.visitFuncCall(ctx);
    }
    //Composite Commands
    @Override
    public Command visitWhileWithBlock(WhileWithBlockContext ctx) {
	// TODO Auto-generated method stub
        return super.visitWhileWithBlock(ctx);
    }
    @Override
    public Command visitWhileWithSingle(WhileWithSingleContext ctx) {
        // TODO Auto-generated method stub
        return super.visitWhileWithSingle(ctx);
    }
    @Override
    public Command visitIfWithBlock(IfWithBlockContext ctx) {
        // TODO Auto-generated method stub
        return super.visitIfWithBlock(ctx);
    }
    @Override
    public Command visitIfWithSingle(IfWithSingleContext ctx) {
        // TODO Auto-generated method stub
        return super.visitIfWithSingle(ctx);
    }
    @Override
    public Command visitIfElseWithBlock(IfElseWithBlockContext ctx) {
        // TODO Auto-generated method stub
        return super.visitIfElseWithBlock(ctx);
    }
    @Override
    public Command visitIfElseWithSingle(IfElseWithSingleContext ctx) {
        // TODO Auto-generated method stub
        return super.visitIfElseWithSingle(ctx);
    }
}
