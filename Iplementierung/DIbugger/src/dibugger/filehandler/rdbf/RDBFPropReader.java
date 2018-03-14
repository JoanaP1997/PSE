package dibugger.filehandler.rdbf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import dibugger.filehandler.facade.PropertiesFile;
import dibugger.filehandler.facade.PropertiesFileReader;

/**
 * Specific implementation of {@linkplain PropertiesFileReader} for java defined
 * Properties Files
 * 
 * @author Pascal
 *
 */
public class RDBFPropReader extends PropertiesFileReader {

    @Override
    public PropertiesFile loadProperties(File f) {
        if (!f.exists()) {
            try {
                f.createNewFile();
                return new PropertiesFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Properties prop = new Properties();

        try {
            FileInputStream fis = new FileInputStream(f);

            prop.loadFromXML(fis);

            fis.close();

            // Setting new PropertiesFile
            PropertiesFile file = new PropertiesFile();
            file.setConfigFile(prop.getProperty("configFileLoc"));
            file.setSelectedLanguage(prop.getProperty("language"));
            file.setMaxFunctionCalls(Integer.parseInt(prop.getProperty("maxFuncCalls")));
            file.setMaxWhileIterations(Integer.parseInt(prop.getProperty("maxWhileIterations")));

            return file;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new PropertiesFile();
    }

}
