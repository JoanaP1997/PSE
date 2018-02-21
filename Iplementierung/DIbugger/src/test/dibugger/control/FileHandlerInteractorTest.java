package test.dibugger.control;

import static org.junit.Assert.*;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.argThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;

import java.util.Arrays;

import org.junit.*;

import dibugger.control.DebugLogicController;
import dibugger.control.FileHandlerInteractor;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.facade.ConfigurationFile;
import dibugger.userinterface.GUIFacade;

public class FileHandlerInteractorTest {
    private File configurationFile;
    
    @BeforeClass
    public static void setConfigurationFile() throws IOException {
        File configFile = File.createTempFile("configurationFile", "");
        configFile.deleteOnExit();
    }
    
    @Test
    public void testApplyConfiguration_valid() throws IOException, FileHandlerException, DIbuggerLogicException {
        GUIFacade guiFacade = mock(GUIFacade.class);
        
        FileHandlerInteractor interactor= new FileHandlerInteractor(new DebugLogicController(), guiFacade);
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
     
        interactor.applyConfiguration(configuration);
        
        verify(guiFacade).showProgramText(eq("text sample"), eq("A"));
        verify(guiFacade).showProgramText(eq("another sample"), eq("B"));
        
        verify(guiFacade).showInput(eq("A"), argThat(list -> list.contains("inputVariable = 0")));
        verify(guiFacade).showInput(eq("B"), argThat(list -> list.contains("firstInputVariable = 2")));
        verify(guiFacade).showInput(eq("B"), argThat(list -> list.contains("secondInputVariable = 4")));
        
        //-----------------------------------------------
    }
}
