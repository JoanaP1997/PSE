package test.dibugger.control;

import static org.junit.Assert.*;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.argThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.*;

import dibugger.control.DebugLogicController;
import dibugger.control.FileHandlerInteractor;
import dibugger.debuglogic.debugger.DebugLogicFacade;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.facade.ConfigurationFile;
import dibugger.userinterface.GUIFacade;

public class FileHandlerInteractorTest {
    public static List<String> programTexts = Arrays.asList(
            "void main() {\n" 
            + "int i = 2;\n" 
            + "int x = 3 + i;\n" 
            + "while (x < 80) {\n" 
            + "   i = i+2;\n"
            + "   x = x + 1;\n" 
            + " }\n" 
            + "}",
            "void main(int k, int m) {\n" 
            + "int i = k\n;" 
            + "int x = 3 + i;\n" 
            + "while (x < m) {\n"
            + " i = i + 2;\n" 
            + " x = x + 1;\n" 
            + " }\n" 
            + "}",
            "int main(int k) {\n" 
            + "if(k<=1) {" 
            + " return 1;\n" 
            + "}\n" 
            + "int res;\n"
            + "res = main(k-1);\n" 
            + "res = res*k;\n" 
            + "return res;\n" 
            + "}");
    
    private File configurationFile;
    private List<String> inputTexts;
    private List<String> programIdentifiers;
    
    @BeforeClass
    public static void setConfigurationFile() throws IOException {
        File configFile = File.createTempFile("configurationFile", "");
        configFile.deleteOnExit();
        
    }

    @Before
    public void setUp() {
        inputTexts = Arrays.asList("", "k = 54; m = 80", "k = 34");
        programIdentifiers = Arrays.asList("A", "B", "C");
    }
    private static boolean areDepthOneEqual(List<?> one, List<?> other) {
        if (one == other) {
            return true;
        }
        
        int size = one.size();
        boolean areEqual = (one.size() == other.size());
        
        for (int i = 0; (i < size) && areEqual; i++) {
            Object elementInOne = one.get(i);
            Object elementInOther = other.get(i);
            areEqual = elementInOne.equals(elementInOther);
        }
        
        return areEqual;
    }
    
    @Test
    public void testApplyConfiguration_valid() throws IOException, FileHandlerException, DIbuggerLogicException {
        /*
         *  Komponententest (Paket als Komponente) 
         */
        
        DebugLogicFacade logicFacade = mock(DebugLogicFacade.class);
        DebugLogicController logicController = new DebugLogicController(logicFacade);
        GUIFacade guiFacade = mock(GUIFacade.class);
        
        FileHandlerInteractor interactor= new FileHandlerInteractor(logicController, guiFacade);
        ConfigurationFile configuration = new ConfigurationFile(configurationFile);
        
        configuration.setNumPrograms(2);
        
        configuration.setProgramText(0, "text sample");
        configuration.setProgramText(1, "another sample");
        
        configuration.setProgramNameID(0, "A");
        configuration.setProgramNameID(1, "B");
        
        configuration.setStepSize(0, 2);
        configuration.setStepSize(1, 4);
        
        configuration.setInputValue(0, "inputVariable", "0");
        configuration.setInputValue(1, "firstInputVariable", "2");
        configuration.setInputValue(1, "secondInputVariable", "4");
        
        configuration.setLastExecutionLine(0, 0);
        configuration.setLastExecutionLine(1, 2);
        
        configuration.setVariablesOfInspector(0, Arrays.asList("inputVariable"));
        configuration.setVariablesOfInspector(1, Arrays.asList("firstInputVariable", "secondInputVariable"));
            
        configuration.addWatchExpressions("A.inputVariable == B.firstInputVariable + 8", Arrays.asList(16, 32), Arrays.asList(32, 64));
        
        configuration.addConditionalBreakpoint("A.inputVariable < B.secondInputVariable", Arrays.asList(16), Arrays.asList(64));
        
        configuration.setBreakpoints(0, Arrays.asList(8));
        configuration.setBreakpoints(1, Arrays.asList(4));
     
        /*_________________________________________________________________*/

        interactor.applyConfiguration(configuration);
        /*_________________________________________________________________*/
        
        verify(guiFacade).showProgramText(eq("text sample"), eq("A"));
        verify(guiFacade).showProgramText(eq("another sample"), eq("B"));
        
        verify(guiFacade).showInput(eq("A"), argThat(list -> areDepthOneEqual(
                list, 
                Arrays.asList("inputVariable = 0"))));
        verify(guiFacade).showInput(eq("B"), argThat(list -> areDepthOneEqual(
                list, 
                Arrays.asList("firstInputVariable = 2", "secondInputVariable = 4"))));
        
        verify(guiFacade).setHiddenVariables(eq("A"), argThat(list -> areDepthOneEqual(
                list,
                Arrays.asList("inputVariable"))));
        verify(guiFacade).setHiddenVariables(eq("B"), argThat(list -> areDepthOneEqual(
                list,
                Arrays.asList("firstInputVariable", "secondInputVariable"))));
        
        // latestExecutionline...
        
        verify(logicFacade).setStepSize(eq(0), eq(2));
        verify(logicFacade).setStepSize(eq(1), eq(4));
        
        verify(logicFacade).createBreakpoint(anyInt(), eq(8));
        verify(logicFacade).createBreakpoint(anyInt(), eq(4));
        
        verify(logicFacade).createCondBreakpoint(anyInt(), eq("A.inputVariable < B.secondInputVariable"));
        
        verify(logicFacade).createWatchExpression(anyInt(), eq("A.inputVariable == B.firstInputVariable + 8"));
    }
    
    @SuppressWarnings("unchecked")
    @Test
    public void testSaveConfig() throws FileHandlerException, DIbuggerLogicException {
        /*
         * Integrationstest.
         */
        
        ConfigurationFile configuration = mock(ConfigurationFile.class);
        DebugLogicController controller = new DebugLogicController();
        GUIFacade guiFacade = mock(GUIFacade.class);
        
        List<String> variablesOfA = Arrays.asList("i", "x");
        when(guiFacade.getVariablesOfInspector(eq("A"))).thenReturn(variablesOfA);
        
        List<String> variablesOfB = Arrays.asList("m");
        when(guiFacade.getVariablesOfInspector(eq("B"))).thenReturn(variablesOfB);
        
        List<String> variablesOfC = Arrays.asList();    // no variables to show
        when(guiFacade.getVariablesOfInspector(eq("C"))).thenReturn(variablesOfC);
        
        FileHandlerInteractor interactor = new FileHandlerInteractor(controller, guiFacade);
        
        controller.saveText(inputTexts, programTexts, programIdentifiers);
        
        controller.createBreakpoint("B", 2);
        controller.createBreakpoint("B", 4);

        controller.createConditionalBreakpoint(0, "A.x == B.x");
        controller.createConditionalBreakpoint(1, "B.x > C.res");
        
        controller.createWatchExpression(0, "C.res - B.x");
        
        
        controller.startDebug();
        controller.singleStep("C");
        controller.singleStep("C");
        controller.stopDebug();
        
        controller.setStepSize("A", 2);
        controller.setStepSize("B", 3);

        /*_________________________________________________________________*/
        
        interactor.gatherConfiguration(configuration);
        /*_________________________________________________________________*/
        
        verify(configuration).setProgramNameID(eq(0), eq("A"));
        verify(configuration).setProgramNameID(eq(2), eq("C"));
        
        verify(configuration).setProgramText(eq(0), eq(programTexts.get(0)));
        verify(configuration).setProgramText(eq(1), eq(programTexts.get(1)));
        verify(configuration).setProgramText(eq(2), eq(programTexts.get(2)));
        
        verify(configuration, times(0)).setInputValue(eq(0), any(String.class), any(String.class));
        verify(configuration, times(2)).setInputValue(eq(1), any(String.class), any(String.class));
        verify(configuration).setInputValue(eq(2), eq("k"), eq("34"));
        
        verify(configuration).setVariablesOfInspector(eq(0), argThat(list -> areDepthOneEqual(
                list,
                variablesOfA)));
        verify(configuration).setVariablesOfInspector(eq(1), any(List.class));
        verify(configuration).setVariablesOfInspector(eq(2), any(List.class));
        
        verify(configuration).setStepSize(eq(0), eq(2));
        verify(configuration).setStepSize(eq(1), eq(3));
        verify(configuration).setStepSize(eq(2), eq(1));
        
        verify(configuration).setBreakpoints(eq(0), argThat(list -> areDepthOneEqual(
                list,
                Arrays.asList())));
        verify(configuration).setBreakpoints(eq(1), argThat(list -> areDepthOneEqual(
                list, 
                Arrays.asList(2, 4))));
        verify(configuration).setBreakpoints(eq(2), any(List.class));
        
        //  Notiz: Ggfalls. noch resltiche 2 Arg. prüfen
        verify(configuration).addConditionalBreakpoint(eq("A.x == B.x"), any(List.class), any(List.class));
        verify(configuration).addConditionalBreakpoint(eq("B.x > C.res"), any(List.class), any(List.class));
        
        verify(configuration).addWatchExpressions(eq("C.res - B.x"), any(List.class), any(List.class));
        
        verify(configuration).setNumPrograms(eq(3));
    }
}
