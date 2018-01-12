package dibugger.DebugLogic.Interpreter;

import java.util.List;

import dibugger.DebugLogic.AntlrParser.WlangBaseVisitor;
import dibugger.DebugLogic.AntlrParser.WlangParser.AndConditionContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayDeclarationContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayDeclarationOneDimContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayDeclarationThreeDimContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayDeclarationTwoDimContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayDeclareAssignContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayElementAssignContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayElementAssignOneDimContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayElementAssignThreeDimContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayElementAssignTwoDimContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.AssignmentContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.DeclarationContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.DeclareAssignContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.FuncCallContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IfElseWithBlockContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IfElseWithSingleContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IfStateContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IfWithBlockContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IfWithSingleContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IfelseStateContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.MainRoutineContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.PureAssignContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.WhileStateContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.WhileWithBlockContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.WhileWithSingleContext;

public class CommandGenerationVisitor extends WlangBaseVisitor<Command> {
    private GenerationController controller;
    public CommandGenerationVisitor(GenerationController controller) {
	this.controller = controller;
    }
    //RoutineCommands
   
    
    
    
    //Array Commands
    @Override
    public Command visitArrayDeclarationOneDim(ArrayDeclarationOneDimContext ctx) {
        String identifier = ctx.id.getText();
        Term index = null;
        // TODO : visit(ctx.index.) 

        return new ArrayDeclaration(this.controller, identifier, index);
    }
    @Override
    public Command visitArrayDeclarationTwoDim(ArrayDeclarationTwoDimContext ctx) {
	String identifier = ctx.id.getText();
        Term firstIndex = null;
        Term secondIndex = null;
        // TODO : visit(ctx.index.) 

        return new ArrayDeclaration(this.controller, identifier, firstIndex, secondIndex);  
    }
    @Override
    public Command visitArrayDeclarationThreeDim(ArrayDeclarationThreeDimContext ctx) {
	String identifier = ctx.id.getText();
        Term firstIndex = null;
        Term secondIndex = null;
        Term thirdIndex = null;
        // TODO : visit(ctx.index.) 

        return new ArrayDeclaration(this.controller, identifier, firstIndex, secondIndex, thirdIndex);  
    }
    @Override
    public Command visitArrayElementAssignOneDim(ArrayElementAssignOneDimContext ctx) {
	return null;
	//TODO
    }
    @Override
    public Command visitArrayElementAssignTwoDim(ArrayElementAssignTwoDimContext ctx) {
        // TODO Auto-generated method stub
        return super.visitArrayElementAssignTwoDim(ctx);
    }
    @Override
    public Command visitArrayElementAssignThreeDim(ArrayElementAssignThreeDimContext ctx) {
        // TODO Auto-generated method stub
        return super.visitArrayElementAssignThreeDim(ctx);
    }
    //Assignments and Declaration
    @Override
    public Command visitPureAssign(PureAssignContext ctx) {
	Term term = new TermGenerationVisitor().visit(ctx.value);//TODO hae wieso geht das?
        return new Assignment(this.controller, ctx.id.getText(), term);
    }
    @Override
    public Command visitDeclaration(DeclarationContext ctx) {
        return new Declaration(this.controller, ctx.id.getText());
    }
    @Override
    public Command visitDeclareAssign(DeclareAssignContext ctx) {
        // TODO Auto-generated method stub
        return super.visitDeclareAssign(ctx);
    }
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
