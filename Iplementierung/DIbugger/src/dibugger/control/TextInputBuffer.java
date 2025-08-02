package dibugger.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dibugger.debuglogic.debugger.ProgramInput;

/**
 * Used to store user-input of type (input texts, program texts, program
 * identifiers).
 */
public class TextInputBuffer {
    private List<String> inputTexts;
    private List<String> programTexts;
    private List<String> programIdentifiers;

    /**
     * Creates a new instance of {@code TextInputBuffer}
     */
    public TextInputBuffer() {
        /* */
    }

    /**
     * Returns the number of programs stored in this buffer.
     * 
     * @return the number of pragrams stored by this buffer
     */
    public int getNumberOfPrograms() {
        return programTexts.size();
    }

    /**
     * Returns {@code ProgramInput}s corresponding to user-input, which was
     * stored earlier.
     * 
     * @return a list of all {@code ProgramInput}s known to this buffer
     */
    public List<ProgramInput> getProgramInput() {
        assert (inputTexts.size() == programTexts.size() && inputTexts.size() == programIdentifiers.size());

        List<ProgramInput> programs = new ArrayList<>();
        for (int i = 0; i < inputTexts.size(); i++) {
            String inputValuesString = inputTexts.get(i);
            List<String> variablesAndValues = new ArrayList<>(Arrays.asList(inputValuesString.split(";")));
            String programIdentifier = programIdentifiers.get(i);
            ProgramInput input = new ProgramInput(programTexts.get(i), variablesAndValues, 0, programIdentifier);

            programs.add(input);
        }
        return programs;
    }

    /**
     * Stores a single (input texts, program texts, program identifiers) user
     * input-triple.
     * 
     * @param inputTexts
     *            a list containing each program's input variable-assignemts
     * @param programTexts
     *            a list containing each program's text
     * @param programIdentifiers
     *            a list of containing each program's identifier
     */
    public void storeTextInput(List<String> inputTexts, List<String> programTexts, List<String> programIdentifiers) {
        if (inputTexts.size() != programTexts.size() || inputTexts.size() != programIdentifiers.size()) {
            /*
             * Assuming that inputVariables has entry for each program, even if
             * user did not specify any for one specific program (using UI)
             */
            throw new IllegalArgumentException();
        }
        this.inputTexts = new ArrayList<>(inputTexts);
        this.programTexts = new ArrayList<>(programTexts);
        this.programIdentifiers = new ArrayList<>(programIdentifiers);
    }
}
