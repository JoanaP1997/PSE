package dibugger.debuglogic.interpreter;

import java.util.List;

public final class NegativeTerm extends Term {
    private Term child;

    public NegativeTerm(Term child) {
        this.child = child;
    }

    @Override
    public TermValue evaluate(List<TraceState> states) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TermValue evaluate(Scope currentScope) {
        // TODO Auto-generated method stub
        return null;
    }

}
