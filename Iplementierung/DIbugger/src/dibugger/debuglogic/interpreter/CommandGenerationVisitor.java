package dibugger.debuglogic.interpreter;

import org.antlr.v4.runtime.tree.ParseTree;

import dibugger.debuglogic.antlrparser.WlangBaseVisitor;
import dibugger.debuglogic.antlrparser.WlangParser.ArrayDeclarationOneDimContext;
import dibugger.debuglogic.antlrparser.WlangParser.ArrayDeclarationThreeDimContext;
import dibugger.debuglogic.antlrparser.WlangParser.ArrayDeclarationTwoDimContext;
import dibugger.debuglogic.antlrparser.WlangParser.ArrayElementAssignOneDimContext;
import dibugger.debuglogic.antlrparser.WlangParser.ArrayElementAssignThreeDimContext;
import dibugger.debuglogic.antlrparser.WlangParser.ArrayElementAssignTwoDimContext;
import dibugger.debuglogic.antlrparser.WlangParser.DeclarationContext;
import dibugger.debuglogic.antlrparser.WlangParser.DeclareAssignContext;
import dibugger.debuglogic.antlrparser.WlangParser.FuncCallContext;
import dibugger.debuglogic.antlrparser.WlangParser.FunctionHeadContext;
import dibugger.debuglogic.antlrparser.WlangParser.IfElseWithBlockContext;
import dibugger.debuglogic.antlrparser.WlangParser.IfElseWithSingleContext;
import dibugger.debuglogic.antlrparser.WlangParser.IfWithBlockContext;
import dibugger.debuglogic.antlrparser.WlangParser.IfWithSingleContext;
import dibugger.debuglogic.antlrparser.WlangParser.MainFunctionHeadContext;
import dibugger.debuglogic.antlrparser.WlangParser.PureAssignContext;
import dibugger.debuglogic.antlrparser.WlangParser.WhileWithBlockContext;
import dibugger.debuglogic.antlrparser.WlangParser.WhileWithSingleContext;

public class CommandGenerationVisitor extends WlangBaseVisitor<Command> {
  private GenerationController controller;
  private TermGenerationVisitor termGenVisitor;

  public CommandGenerationVisitor(GenerationController controller) {
    this.controller = controller;
    this.termGenVisitor = new TermGenerationVisitor();
  }
  // RoutineCommands
  
  // Array Commands
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
    return new ArrayElementAssignment(this.controller, ctx.id.getLine(), identifier, firstIndex, secondIndex,
        thirdIndex, value);
  }

  // Assignments and Declaration
  @Override
  public Command visitPureAssign(PureAssignContext ctx) {
    Term value = this.termGenVisitor.visit(ctx.value);
    return new Assignment(this.controller, ctx.id.getLine(), ctx.id.getText(), value);
  }
  @Override
  public Command visitDeclaration(DeclarationContext ctx) {
    //TODO TYPE
    return new Declaration(this.controller, ctx.getStart().getLine(), ctx.id.getText(), Type.NULL);
  }
  @Override
  public Command visitDeclareAssign(DeclareAssignContext ctx) {
    Term value = this.termGenVisitor.visit(ctx.value);
    return new DeclarationAssignment(this.controller, ctx.getStart().getLine(), ctx.id.getText(), Type.NULL, value);
  }
  // Function Call
  @Override
  public Command visitFuncCall(FuncCallContext ctx) {
    // TODO Auto-generated method stub
    return super.visitFuncCall(ctx);
  }

  // Composite Commands
  @Override
  public Command visitWhileWithBlock(WhileWithBlockContext ctx) {
    Term condition = this.termGenVisitor.visit(ctx.condition());
    WhileCommand whileCommand = new WhileCommand(this.controller, ctx.getStart().getLine(), condition);
    // add child commands
    for (ParseTree childCtx : ctx.content.children) {
      whileCommand.addChild(visit(childCtx));
    }
    return whileCommand;
  }

  @Override
  public Command visitWhileWithSingle(WhileWithSingleContext ctx) {
    Term condition = this.termGenVisitor.visit(ctx.condition());
    WhileCommand whileCommand = new WhileCommand(this.controller, ctx.getStart().getLine(), condition);
    // add child command
    whileCommand.addChild(visit(ctx.content));
    return whileCommand;
  }

  @Override
  public Command visitIfWithBlock(IfWithBlockContext ctx) {
    Term condition = this.termGenVisitor.visit(ctx.condition());
    IfCommand ifCommand = new IfCommand(this.controller, ctx.getStart().getLine(), condition);
    // add child commands
    for (ParseTree childCtx : ctx.content.children) {
      ifCommand.addChild(visit(childCtx));
    }
    return ifCommand;
  }

  @Override
  public Command visitIfWithSingle(IfWithSingleContext ctx) {
    Term condition = this.termGenVisitor.visit(ctx.condition());
    IfCommand ifCommand = new IfCommand(this.controller, ctx.getStart().getLine(), condition);
    // add child command
    ifCommand.addChild(visit(ctx.content));
    return ifCommand;
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
