package dibugger.DebugLogic.Interpreter;

import java.util.List;

import dibugger.DebugLogic.AntlrParser.WlangBaseVisitor;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayDeclarationContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayDeclareAssignContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayElementAssignContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.AssignmentContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.DeclarationContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.DeclareAssignContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.FuncCallContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IfStateContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IfelseStateContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.PureAssignContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.WhileStateContext;

public class CommandGenerationVisitor extends WlangBaseVisitor<Command> {
    private GenerationController controller;
    public CommandGenerationVisitor(GenerationController controller) {
	this.controller = controller;
    }
    //Array Commands
    @Override
    public Command visitArrayDeclaration(ArrayDeclarationContext ctx) {
        // TODO Auto-generated method stub
        return super.visitArrayDeclaration(ctx);
    }
    @Override
    public Command visitArrayDeclareAssign(ArrayDeclareAssignContext ctx) {
        // TODO Auto-generated method stub
        return super.visitArrayDeclareAssign(ctx);
    }
    @Override
    public Command visitArrayElementAssign(ArrayElementAssignContext ctx) {
        // TODO Auto-generated method stub
        return super.visitArrayElementAssign(ctx);
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
    public Command visitWhileState(WhileStateContext ctx) {
        // TODO Auto-generated method stub
        return super.visitWhileState(ctx);
    }
    @Override
    public Command visitIfState(IfStateContext ctx) {
        // TODO Auto-generated method stub
        return super.visitIfState(ctx);
    }
    @Override
    public Command visitIfelseState(IfelseStateContext ctx) {
        // TODO Auto-generated method stub
        return super.visitIfelseState(ctx);
    }
}
