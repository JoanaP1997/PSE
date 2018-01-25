package dibugger.filehandler.facade;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Pascal Holds Data representing a stored Configuration of the DIbugger
 *         UI and Logic.
 */
public class ConfigurationFile {

    private File systemFile;

    private List<String> list_programText;
    private List<String> list_programNamespace;
    private List<Integer> list_programStepSize;
    private List<Map<String, String>> list_inputValues;
    private List<Integer> list_lastExecLine;

    private List<List<String>> list_varInspector;

    private List<WCBExpression> list_watchExpressions;
    private List<WCBExpression> list_condBreakpoints;
    private List<List<Integer>> list_breakpoints;

    private int numPrograms;

    public ConfigurationFile(File file) {
        systemFile = file;
        // TODO create Lists
        list_programText = new ArrayList<String>();
        list_programNamespace = new ArrayList<String>();
        list_programStepSize = new ArrayList<Integer>();
        list_inputValues = new ArrayList<Map<String, String>>();
        list_lastExecLine = new ArrayList<Integer>();

        list_varInspector = new ArrayList<List<String>>();

        list_watchExpressions = new ArrayList<WCBExpression>();
        list_condBreakpoints = new ArrayList<WCBExpression>();
        list_breakpoints = new ArrayList<List<Integer>>();
    }

    // Complex Getter
    /**
     * Getter for the program text of program programID
     * 
     * @param programID
     *            the ID of the program
     * @return program text corresponding to the given programID
     */
    public String getProgramText(int programID) {
        return list_programText.get(programID);
    }

    /**
     * Getter for the program name id of program programID
     * 
     * @param programID
     *            the ID of the program
     * @return program name id corresponding to the given programID
     */
    public String getProgramNameID(int programID) {
        return list_programNamespace.get(programID);
    }

    /**
     * Getter for the StepSize of program programID
     * 
     * @param programID
     *            the ID of the program
     * @return stepSize of the program programID
     */
    public int getStepSize(int programID) {
        return list_programStepSize.get(programID);
    }

    /**
     * Getter for the inputValue defined by the variable identifier of program
     * programID
     * 
     * @param programID
     *            the id of the program
     * @param identifier
     *            the variable to read the input value
     * @return the input value of the variable identifier in program programID
     */
    public String getInputValue(int programID, String identifier) {
        return list_inputValues.get(programID).get(identifier);
    }

    /**
     * Getter for all input identifiers of a given program
     * 
     * @param programID
     *            the programID
     * @return a list containing all identifiers for the input values
     */
    public List<String> getInputValueIdentifiers(int programID) {
        return new ArrayList<String>(list_inputValues.get(programID).keySet());
    }

    /**
     * Getter for the last Execution Line of a given program
     * 
     * @param programID
     *            the ID of the program
     * @return the last execution line, if the configuration was saved within
     *         the Debug-Mode, else 0
     */
    public int getLatestExecutionLine(int programID) {
        return list_lastExecLine.get(programID);
    }

    /**
     * Getter for all viewed variables of the variable inspector of the given
     * program
     * 
     * @param programID
     *            the id of the program
     * @return a list, that contains all viewed variables as a String.
     */
    public List<String> getVariablesOfInspector(int programID) {
        return list_varInspector.get(programID);
    }

    /**
     * 
     * @return the amount of Watch Expressions
     */
    public int getWatchExpressionSize() {
        return list_watchExpressions.size();
    }

    /**
     * 
     * @return a list containing all expression of the watch expressions
     */
    public List<String> getWatchExpressions() {
        List<String> l = new ArrayList<String>();
        for (int i = 0; i < list_watchExpressions.size(); ++i) {
            l.add(list_watchExpressions.get(i).expression);
        }
        return l;
    }

    /**
     * Getter for the Scope Begin of a given Watch Expression
     * 
     * @param expressionID
     *            the id of the expression
     * @return a List containing all Scope begins for the given watch
     *         expression.
     */
    public List<Integer> getWEScopeBegin(int expressionID) {
        List<Integer> l = new ArrayList<Integer>();
        for (IntTuple it : list_watchExpressions.get(expressionID).list_scopes) {
            l.add(it.a);
        }
        return l;
    }

    /**
     * Getter for the Scope End of a given Watch Expression
     * 
     * @param expressionID
     *            the id of the expression
     * @return a List containing all Scope ends for the given watch expression.
     */
    public List<Integer> getWEScopeEnd(int expressionID) {
        List<Integer> l = new ArrayList<Integer>();
        for (IntTuple it : list_watchExpressions.get(expressionID).list_scopes) {
            l.add(it.b);
        }
        return l;
    }

    /**
     * 
     * @return the amount of conditional breakpoints
     */
    public int getConditionalBreakpointSize() {
        return list_condBreakpoints.size();
    }

    /**
     * 
     * @return a list containing all conditions of the conditional breakpoints
     */
    public List<String> getConditionalBreakpoints() {
        List<String> l = new ArrayList<String>();
        for (int i = 0; i < list_condBreakpoints.size(); ++i) {
            l.add(list_condBreakpoints.get(i).expression);
        }
        return l;
    }

    /**
     * Getter for the Scope Begin of a given Conditional Breakpoint
     * 
     * @param expressionID
     *            the id of the expression
     * @return a List containing all Scope begins for the given conditional
     *         breakpoint.
     */
    public List<Integer> getCBScopeBegin(int expressionID) {
        List<Integer> l = new ArrayList<Integer>();
        for (IntTuple it : list_condBreakpoints.get(expressionID).list_scopes) {
            l.add(it.a);
        }
        return l;
    }

    /**
     * Getter for the Scope end of a given Conditional Breakpoint
     * 
     * @param expressionID
     *            the id of the expression
     * @return a List containing all Scope ends for the given conditional
     *         breakpoint.
     */
    public List<Integer> getCBScopeEnd(int expressionID) {
        List<Integer> l = new ArrayList<Integer>();
        for (IntTuple it : list_condBreakpoints.get(expressionID).list_scopes) {
            l.add(it.b);
        }
        return l;
    }

    /**
     * Getter for all breakpoint lines of a given program
     * 
     * @param programID
     *            the id of the program
     * @return a list containing all breakpoint lines of the given program as
     *         integers.
     */
    public List<Integer> getBreakpoints(int programID) {
        return list_breakpoints.get(programID);
    }

    // Simple Getter
    /**
     * @see java.io.File
     * @return the system file object of the Configuration
     */
    public File getSystemFile() {
        return systemFile;
    }

    /**
     * 
     * @return the list object containing all program texts
     */
    public List<String> getList_programText() {
        return list_programText;
    }

    /**
     * 
     * @return the list object containing all program nameIDs
     */
    public List<String> getList_programNamespace() {
        return list_programNamespace;
    }

    /**
     * 
     * @return the list object containing all program step sizes.
     */
    public List<Integer> getList_programStepSize() {
        return list_programStepSize;
    }

    /**
     * 
     * @return the list object containing all input values.
     */
    public List<Map<String, String>> getList_inputValues() {
        return list_inputValues;
    }

    /**
     * 
     * @return the list object containing all last program execution lines.
     */
    public List<Integer> getList_lastExecLine() {
        return list_lastExecLine;
    }

    /**
     * 
     * @return the list obejct containing all focused variables of the programs.
     */
    public List<List<String>> getList_varInspector() {
        return list_varInspector;
    }

    /**
     * 
     * @return the list obejct containing all breakpoints.
     */
    public List<List<Integer>> getList_breakpoints() {
        return list_breakpoints;
    }

    /**
     * Getter for the amount of programs
     * 
     * @return the amount of programs
     */
    public int getNumPrograms() {
        return numPrograms;
    }

    /**
     * Setter for the amount of programs
     * 
     * @param numPrograms
     *            new amount of programs
     */
    public void setNumPrograms(int numPrograms) {
        this.numPrograms = numPrograms;
    }

    /**
     * Setter for the program text of program programID
     * 
     * @param programID
     *            the ID of the program
     * @param text
     *            new program text of the given programID
     */
    public void setProgramText(int programID, String text) {
        while (list_programText.size() - 1 < programID) {
            list_programText.add("");
        }
        list_programText.set(programID, text);
    }

    /**
     * Setter for the programNameID of a given program
     * 
     * @param programID
     *            the id of te program
     * @param name
     *            the new name of the given programID
     */
    public void setProgramNameID(int programID, String name) {
        while (list_programNamespace.size() - 1 < programID) {
            list_programNamespace.add("");// TODO Check if empty string is valid
        }
        list_programNamespace.set(programID, name);
    }

    /**
     * Setter for the stepsize of a given program
     * 
     * @param programID
     *            the id of the program
     * @param stepsize
     *            the new stepsize of the given programID
     */
    public void setStepSize(int programID, int stepsize) {
        while (list_programStepSize.size() - 1 < programID) {
            list_programStepSize.add(0);
        }
        list_programStepSize.set(programID, stepsize);
    }

    /**
     * Setter for the input value of a given program
     * 
     * @param programID
     *            the id of the program
     * @param identifier
     *            the identifier of the new input
     * @param value
     *            the new value for the input with the given identifier
     */
    public void setInputValue(int programID, String identifier, String value) {
        while (list_inputValues.size() - 1 < programID) {
            list_inputValues.add(new HashMap<String, String>());
        }
        list_inputValues.get(programID).put(identifier, value);
    }

    /**
     * Setter for the last execution line of a given program
     * 
     * @param programID
     *            the id of the program
     * @param execLine
     *            the last execution line of the given program
     */
    public void setLastExecutionLine(int programID, int execLine) {
        while (list_lastExecLine.size() - 1 < programID) {
            list_lastExecLine.add(0);
        }
        list_lastExecLine.set(programID, execLine);
    }

    /**
     * Setter for the variables of a given program
     * 
     * @param programID
     *            the id of the program
     * @param variables
     *            a list containing all variable identifiers used by the
     *            variable inspector
     */
    public void setVariablesOfInspector(int programID, List<String> variables) {
        while (list_varInspector.size() - 1 < programID) {
            list_varInspector.add(new ArrayList<String>());
        }
        list_varInspector.set(programID, variables);
    }

    /**
     * Used to add a watch expression
     * 
     * @param expression
     *            the expression
     * @param scopeBegin
     *            a list containing all scope begins
     * @param scopeEnd
     *            a list containing all scope ends
     */
    public void addWatchExpressions(String expression, List<Integer> scopeBegin, List<Integer> scopeEnd) {
        WCBExpression e = new WCBExpression(expression);
        for (int i = 0; i < Math.min(scopeBegin.size(), scopeEnd.size()); ++i) {
            e.list_scopes.add(new IntTuple(scopeBegin.get(i), scopeEnd.get(i)));
        }
        list_watchExpressions.add(e);
    }

    /**
     * Used to add a conditional breakpoint
     * 
     * @param condition
     *            the condition
     * @param scopeBegin
     *            a list containing all scope begins
     * @param scopeEnd
     *            a list containing all scope ends
     */
    public void addConditionalBreakpoint(String condition, List<Integer> scopeBegin, List<Integer> scopeEnd) {
        WCBExpression e = new WCBExpression(condition);
        for (int i = 0; i < Math.min(scopeBegin.size(), scopeEnd.size()); ++i) {
            e.list_scopes.add(new IntTuple(scopeBegin.get(i), scopeEnd.get(i)));
        }
        list_condBreakpoints.add(e);
    }

    /**
     * Setter for the breakpoints of a given program
     * 
     * @param programID
     *            the id of the program
     * @param lines
     *            a list containing all linenumbers of the active breakpoints
     */
    public void setBreakpoints(int programID, List<Integer> lines) {
        while (list_breakpoints.size() < programID) {
            list_breakpoints.add(new ArrayList<Integer>());
        }
        list_breakpoints.set(programID, lines);
    }

    // Private helper structs
    private class WCBExpression {
        private String expression;
        private List<IntTuple> list_scopes;

        public WCBExpression(String expression) {
            this.expression = expression;
            list_scopes = new ArrayList<IntTuple>();
        }
    }

    private class IntTuple {
        private int a;
        private int b;

        public IntTuple(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

}
