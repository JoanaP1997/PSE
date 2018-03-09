package dibugger.userinterface;

import dibugger.control.ControlFacade;
import dibugger.userinterface.dibuggerpopups.DecisionPopUp;
import dibugger.userinterface.dibuggerpopups.ErrorPopUp;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Facade of the Dibuggers user interface.
 */
public class GUIFacade implements Observer {
    private MainInterface mainInterface;
    private ControlFacade controlFacade;

    /**
     * Constructs a new GUIFacade using the mainInterface.
     *
     * @param mainInterface
     *            main interface
     */
    public GUIFacade(MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        controlFacade = new ControlFacade(this);
    }

    /**
     * Lets a certain programPanel show a program text.
     * 
     * @param programText
     *            programText
     * @param programId
     *            programId
     */
    public void showProgramText(String programText, String programId) {
        mainInterface.showProgramText(programText, programId);
    }

    /**
     * Resets the MainInterface.
     */
    public void reset() {
        mainInterface.reset();
    }

    /**
     * Makes a certain ProgramPanel show an input string.
     * 
     * @param programId
     *            programId
     * @param vars
     *            variables
     */
    public void showInput(String programId, List<String> vars) {
        mainInterface.showInput(programId, vars);
    }

    /**
     * Returns Variables of variable inspector of a certain ProgramPanel.
     * 
     * @param programId
     *            programId
     * @return list of variables
     */
    public List<String> getVariablesOfInspector(String programId) {
        return mainInterface.getVariablesOfInspector(programId);
    }

    /**
     * Lets a certain ProgramPanel show new variables.
     * 
     * @param idOfProgram
     *            ProgramPanel id
     * @param variables
     *            variables
     */
    public void setHiddenVariables(String idOfProgram, List<String> variables) {
        mainInterface.setHiddenVariables(idOfProgram, variables);
    }

    /**
     * Update-method as part of the observer pattern.
     */
    @Override
    public void update(Observable observable, Object o) {
        mainInterface.update(observable, o);
    }

    /**
     * Shows an ErrorPopUp
     * 
     * @param s
     *            error message
     */
    public void showError(String s) {
        new ErrorPopUp(s, mainInterface);
    }

    /**
     * Shows a warning as a DecisionPopUp.
     * 
     * @param s
     *            Warning message
     */
    public void showWarning(String s) {
        new DecisionPopUp(s, mainInterface);
    }

    /**
     * Changes the language of the main Interface.
     */
    public void changeLanguage() {
        mainInterface.changeLanguage();
    }

    /**
     * Returns the control facade.
     * 
     * @return control facade
     */
    public ControlFacade getControlFacade() {
        return controlFacade;
    }
}
