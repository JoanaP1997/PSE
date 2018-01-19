package dibugger.debuglogic.interpreter;

import java.util.List;

public class ArrayDeclarationAssignment extends Command {

  private final int DIM;
  private String identifier;
  private Term sizeA; //length of the first dimension
  private Term sizeB;
  private Term sizeC;
  
  public ArrayDeclarationAssignment(GenerationController controller, int linenumber, String identifier, Term size, List<Term> values) {
    super(controller, linenumber);
    DIM = 1;
    this.sizeA = size;
    //Dummy indices
    this.sizeB = new ConstantTerm(new IntValue(1));
    this.sizeC = this.sizeB; //maybe you could make this more efficient by using one global 0 Term
    this.identifier = identifier;
  }

  public ArrayDeclarationAssignment(GenerationController controller, int linenumber, String identifier, Term firstsize, Term secondsize, List<List<Term>> value) {
    super(controller, linenumber);
    DIM = 2;
    this.sizeA = firstsize;
    this.sizeB = secondsize;
    // Dummy index
    this.sizeC = new ConstantTerm(new IntValue(1));
    this.identifier = identifier;
  }

  public ArrayDeclarationAssignment(GenerationController controller, int linenumber, String identifier, Term firstsize,
      Term secondsize, Term thirdsize, List<List<List<Term>>> values) {
    super(controller, linenumber);
    DIM = 3;
    this.sizeA = firstsize;
    this.sizeB = secondsize;
    this.sizeC = thirdsize;
    this.identifier = identifier;
  }



  @Override
  public List<TraceState> run() {
    // TODO Auto-generated method stub
    return null;
  }

}
