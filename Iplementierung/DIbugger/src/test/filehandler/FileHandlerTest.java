package test.filehandler;

import java.io.File;
import static test.filehandler.FileHandlerTestUtilities.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SplittableRandom;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.facade.ConfigurationFile;
import dibugger.filehandler.facade.FileHandlerFacade;
import dibugger.filehandler.facade.LanguageFile;
import dibugger.filehandler.facade.PropertiesFile;
import dibugger.filehandler.rdbf.RDBFAdditions;
import dibugger.filehandler.rdbf.RDBFBlock;
import dibugger.filehandler.rdbf.RDBFDBReader;
import dibugger.filehandler.rdbf.RDBFDBWriter;
import dibugger.filehandler.rdbf.RDBFData;
import dibugger.filehandler.rdbf.RDBFFile;
import dibugger.filehandler.rdbf.RDBFPropReader;
import dibugger.filehandler.rdbf.RDBFPropWriter;
import dibugger.filehandler.rdbf.RDBFReader;
import dibugger.filehandler.rdbf.RDBFWriter;

public class FileHandlerTest {
    @Test
    @Ignore
    public void testWrite() throws IOException {
        RDBFWriter writer = new RDBFWriter();
        RDBFFile f = new RDBFFile(new File("res/testing/test_out.txt"));
        SplittableRandom rand = new SplittableRandom();
        addRandomData(f, rand, 5);

        writer.saveRDBFFile(f);
    }

    @Test
    @Ignore
    public void testRead() throws IOException, FileHandlerException {
        RDBFReader reader = new RDBFReader();

        RDBFFile f = reader.loadRDBFFile(new File("res/testing/config_test_out.rdbf"));
        System.out.println("-----File-----");
        for (RDBFData d : f.getList_data()) {
            System.out.println(d.getName() + " " + d.getValue());
        }
        for (RDBFBlock b : f.getList_blocks()) {
            sysoutBlock(b, "\t");
        }

    }

    @Test
    @Ignore
    public void testProperties() {
        RDBFPropReader reader = new RDBFPropReader();
        PropertiesFile f = reader.loadProperties(PropertiesFile.DEFAULT_LOCATION);
        RDBFPropWriter writer = new RDBFPropWriter();
        writer.saveProperties(f);
    }

    @Test
    @Ignore
    public void testRDBFConfig() throws FileHandlerException {
        RDBFDBWriter writer = new RDBFDBWriter();
        ConfigurationFile f = generateConfig(new File("res/testing/config_test_out.rdbf"));
        writer.saveConfigFile(f);
        RDBFDBReader reader = new RDBFDBReader();
        f = reader.loadConfigFile(f.getSystemFile());
    }

    @Test
    @Ignore
    public void testRDBFLanguage() throws FileHandlerException {
        RDBFDBReader reader = new RDBFDBReader();
//        LanguageFile f = reader.loadLanguageFile(new File("res/testing/lang_test_in.txt"));
    }
    
    @Test
    public void test_facade() throws FileHandlerException{
    	FileHandlerFacade fac = new FileHandlerFacade();
    	assertNotEquals(null, fac.getLanguageFile("english"));
    	List<String> l = Arrays.asList("german", "english", "palatinate", "swabian", "testLang");
    	for(String id : fac.getLanguages()){
    		assertEquals(true, l.contains(id));
    	}
    	
    	String text = "int main(){\n"
    			+ "int i = 1;\n"
    			+ "int n = 5;\n"
    			+ "int sum = 1;\n"
    			+ "while(i<n){\n"
    			+ "sum = sum * i;\n"
    			+ "i = i + 1;\n"
    			+ "}\n"
    			+ "return sum;\n"
    			+ "}";
    	assertEquals(text, fac.loadProgramText(new File("res/testing/uselessAlgo.txt")));
    }

}
