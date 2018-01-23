package dibugger.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dibugger.debuglogic.debugger.ProgramInput;

public class TextInputBuffer {
    private List<String> inputTexts;
    private List<String> programTexts;

    public TextInputBuffer() {
        /* */
    }

    public int getNumberOfPrograms() {
        return programTexts.size();
    }

    public List<ProgramInput> getProgramInput() {
        assert (inputTexts.size() == programTexts.size());

        List<ProgramInput> programs = new ArrayList<>();
        for (int i = 0; i < inputTexts.size(); i++) {
            String inputValuesString = inputTexts.get(i);
            List<String> variablesAndValues = Arrays.asList(inputValuesString.split(";"));
            ProgramInput input = new ProgramInput(programTexts.get(i), variablesAndValues, 0);
            programs.add(input);
        }
        return programs;
    }

    // TODO
    public void storeTextInput(List<String> inputTexts, List<String> programTexts, List<String> programIdentifiers) {
        if (inputTexts.size() != programTexts.size()) {
            /*
             * Assume that inputVariables has entry for each program, even if
             * user did not specify any for one specific program (using UI)
             */
            throw new IllegalArgumentException();
        }
        this.inputTexts = new ArrayList<>(inputTexts);
        this.programTexts = new ArrayList<>(programTexts);
    }
}
