package dibugger.debuglogic.interpreter;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.IncompatibleTypeException;

/**
 * 
 * @author Pascal
 *
 */
public class BooleanValue extends TermValue {
    private boolean value;

    public BooleanValue(boolean value) {
        super(Type.BOOLEAN);
        this.value = value;
    }

    @Override
    public TermValue add(TermValue operand) throws DIbuggerLogicException {
        throw new IncompatibleTypeException("db_it_exc_add");
    }

    @Override
    public TermValue mul(TermValue operand) throws DIbuggerLogicException {
        throw new IncompatibleTypeException("db_it_exc_mul");
    }

    @Override
    public TermValue div(TermValue operand) throws DIbuggerLogicException {
        throw new IncompatibleTypeException("db_it_exc_div");
    }

    @Override
    public TermValue mod(TermValue operand) throws DIbuggerLogicException {
        throw new IncompatibleTypeException("db_it_exc_mod");
    }

    @Override
    public TermValue sub(TermValue operand) throws DIbuggerLogicException {
        throw new IncompatibleTypeException("db_it_exc_sub");
    }

    @Override
    public boolean greaterEqual(TermValue operand) throws DIbuggerLogicException {
        throw new IncompatibleTypeException("db_it_exc_ge");
    }

    @Override
    public boolean greaterThan(TermValue operand) throws DIbuggerLogicException {
        throw new IncompatibleTypeException("db_it_exc_gt");
    }

    @Override
    public boolean lessEqual(TermValue operand) throws DIbuggerLogicException {
        throw new IncompatibleTypeException("db_it_exc_le");
    }

    @Override
    public boolean lessThan(TermValue operand) throws DIbuggerLogicException {
        throw new IncompatibleTypeException("db_it_exc_lt");
    }

    @Override
    public boolean equal(TermValue operand) throws DIbuggerLogicException {
        if (operand.getType() == Type.BOOLEAN) {
            return value == ((BooleanValue) operand).getValue();
        }
        throw new IncompatibleTypeException("db_it_exc_eq");
    }

    @Override
    public boolean or(TermValue operand) throws DIbuggerLogicException {
        if (operand.getType() == Type.BOOLEAN) {
            return value || ((BooleanValue) operand).getValue();
        }
        throw new IncompatibleTypeException("db_it_exc_or");
    }

    @Override
    public boolean and(TermValue operand) throws DIbuggerLogicException {
        if (operand.getType() == Type.BOOLEAN) {
            return value && ((BooleanValue) operand).getValue();
        }
        throw new IncompatibleTypeException("db_it_exc_and");
    }

    @Override
    public boolean not() {
        return !value;
    }

    @Override
    public String toString() {
        return "" + this.value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public TermValue clone() {
        return new BooleanValue(this.value);
    }

}
