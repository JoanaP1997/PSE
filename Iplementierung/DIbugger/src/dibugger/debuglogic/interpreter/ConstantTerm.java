package dibugger.debuglogic.interpreter;

import java.util.List;

/**
 * 
 * @author wagner
 *
 */
public final class ConstantTerm extends Term {
    private final TermValue value;

    public ConstantTerm(TermValue value) {
        this.value = value;
    }

    @Override
    public TermValue evaluate(List<TraceState> states) {
        return this.value;
    }

    @Override
    public TermValue evaluate(Scope currentScope) {
        return this.value;
    }

}
