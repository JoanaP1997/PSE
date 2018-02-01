package dibugger.debuglogic.interpreter;

import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;

/**
 * Represents a list of terms, necessary for Arrays e.g. {1,2,x+3,89}
 * 
 * @author wagner
 *
 */
public final class TermList extends Term {
    private List<Term> content;

    public TermList(List<Term> content) {
        this.content = content;
    }

    @Override
    public TermValue evaluate(List<TraceState> states) throws DIbuggerLogicException {
        return new CharValue('?');
    }

    @Override
    public TermValue evaluate(Scope currentScope) throws DIbuggerLogicException {
        TermValue[][][] evaluatedContent = new TermValue[this.content.size()][1][1];
        for (int i = 0; i < this.content.size(); i++) {
            evaluatedContent[i][0][0] = this.content.get(i).evaluate(currentScope);
        }
        return new ArrayValue(evaluatedContent);
    }

}
