package dibugger.debuglogic.interpreter;

import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;

public final class NegativeTerm extends Term {
    private Term child;

    public NegativeTerm(Term child) {
        this.child = child;
    }

    @Override
    public TermValue evaluate(List<TraceState> states) throws DIbuggerLogicException {
        return this.child.evaluate(states).mul(new IntValue(-1));
    }

    @Override
    public TermValue evaluate(Scope currentScope) throws DIbuggerLogicException {
    	return this.child.evaluate(currentScope).mul(new IntValue(-1));
    }

}
