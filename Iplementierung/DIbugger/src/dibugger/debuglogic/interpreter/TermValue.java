package dibugger.debuglogic.interpreter;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;

/**
 * Represents the Value of a Term (e.g. some Variable)
 * 
 * @author Benedikt, Pascal
 *
 */
public abstract class TermValue {
    private final Type type;

    public TermValue(Type type) {
        this.type = type;
    }

    public abstract TermValue add(TermValue operand) throws DIbuggerLogicException;

    public abstract TermValue mul(TermValue operand) throws DIbuggerLogicException;

    public abstract TermValue div(TermValue operand) throws DIbuggerLogicException;

    public abstract TermValue mod(TermValue operand) throws DIbuggerLogicException;

    public abstract TermValue sub(TermValue operand) throws DIbuggerLogicException;

    // public abstract TermValue or(TermValue operand);
    // public abstract TermValue and(TermValue operand);
    // public abstract TermValue not(TermValue operand);
    public abstract boolean greaterEqual(TermValue operand) throws DIbuggerLogicException;

    public abstract boolean greaterThan(TermValue operand) throws DIbuggerLogicException;

    public abstract boolean lessEqual(TermValue operand) throws DIbuggerLogicException;

    public abstract boolean lessThan(TermValue operand) throws DIbuggerLogicException;

    public abstract boolean equal(TermValue operand) throws DIbuggerLogicException;

    public abstract boolean or(TermValue operand) throws DIbuggerLogicException;

    public abstract boolean and(TermValue operand) throws DIbuggerLogicException;

    public abstract boolean not() throws DIbuggerLogicException;

    public abstract String toString();

    public Type getType() {
        return type;
    }
    public abstract TermValue clone();
}
