package dibugger.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dibugger.debuglogic.debugger.ProgramInput;

public class TextInputBuffer {
    private List<String> inputVariables;
    private List<String> programTexts;
    
    public TextInputBuffer() {
        /* */
    }
    
    public List<ProgramInput> getPrograms() {
        assert(inputVariables.size() == programTexts.size());
        
        List<ProgramInput> programs = new ArrayList<>();
        for (int i = 0; i < inputVariables.size(); i++) {
            String inputValuesString = inputVariables.get(i);
            List<String> inputValues = Arrays.asList(inputValuesString.split(";"));
            ProgramInput input = new ProgramInput(programTexts.get(i), inputValues, 0);
            programs.add(input);
        }
        return programs;
    }
    
    public void storeTextInput(List<String> inputVariables, List<String> programTexts) {
        if (inputVariables.size() != programTexts.size()) {
            /*
             * Assume that inputVariables has entry for each program, even if user
             * did not specify any for one specific program (using UI)
             */
            throw new IllegalArgumentException();
        }
        this.inputVariables = new ArrayList<>(inputVariables);
        this.programTexts = new ArrayList<>(programTexts);
    }
}
