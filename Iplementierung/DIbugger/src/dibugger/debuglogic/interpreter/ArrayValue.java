package dibugger.debuglogic.interpreter;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.IncompatibleTypeException;

public class ArrayValue extends TermValue {

    private TermValue[][][] value;

    public ArrayValue(TermValue[][][] value) {
        super(Type.ARRAY);
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
        throw new IncompatibleTypeException("db_it_exc_eq");
    }

    @Override
    public boolean or(TermValue operand) throws DIbuggerLogicException {
        throw new IncompatibleTypeException("db_it_exc_or");
    }

    @Override
    public boolean and(TermValue operand) throws DIbuggerLogicException {
        throw new IncompatibleTypeException("db_it_exc_and");
    }

    @Override
    public boolean not() throws DIbuggerLogicException {
        throw new IncompatibleTypeException("db_it_exc_not");
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("{");
        for (int i = 0; i < value.length; ++i) {
            if (value.length != 1) {
                s.append("{");
            }
            for (int j = 0; j < value[i].length; ++j) {
                if (value[i].length != 1) {
                    s.append("{");
                }
                for (int k = 0; k < value[i][j].length; ++k) {
                    s.append(value[i][j][k]);
                    if (k < value[i][j].length - 1) {
                        s.append(",");
                    }
                }
                if (value[i].length != 1) {
                    s.append("}");
                }
                if (j < value[i].length - 1) {
                    s.append(",");
                }
            }
            if (value.length != 1) {
                s.append("}");
            }
            if (i < value.length - 1) {
                s.append(",");
            }
        }
        s.append("}");
        return s.toString();
    }

    /**
     * Returns the values of an array.
     * 
     * @return the values
     */
    public TermValue[][][] getValue() {
        return value;
    }

    @Override
    public TermValue clone() {
        int iSize = this.value.length;
        int jSize = this.value[0].length;
        int kSize = this.value[0][0].length;
        TermValue cpy[][][] = new TermValue[iSize][jSize][kSize];
        for (int i = 0; i < iSize; ++i)
            for (int j = 0; j < jSize; ++j)
                for (int k = 0; k < kSize; ++k)
                    if (this.value[i][j][k] != null)
                        cpy[i][j][k] = this.value[i][j][k].clone();
        return new ArrayValue(cpy);
    }
}
