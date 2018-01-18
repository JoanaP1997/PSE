package dibugger.debuglogic.interpreter;

import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
/**
 * Represents a the modulo Operation of two Terms. This is a special Binary Term.
 * @author wagner
 *
 */
public final class ModuloTerm extends BinaryArithmeticTerm {
	public ModuloTerm(Term left, Term right) {
		this.left = left;
		this.right = right;
	}
	@Override
	public TermValue evaluate(List<TraceState> states) throws DIbuggerLogicException {
		return left.evaluate(states).mod(right.evaluate(states));
	}
	@Override
	public TermValue evaluate(Scope currentScope) throws DIbuggerLogicException {
		return left.evaluate(currentScope).mod(right.evaluate(currentScope));
	}
}
