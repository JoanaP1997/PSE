package dibugger.filehandler.rdbf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dibugger.filehandler.exceptions.FileHandlerException;

/**
 * Contains Methods for loading an RDBFFile
 * 
 * @author Pascal
 *
 */
public class RDBFReader {

    /**
     * load an RDBFFile from a given filesystem location
     * 
     * @param file
     *            the file location to load from
     * @return a new RDBFFile Structure representing the given File in Memory
     * @throws IOException
     *             if an error during file reading occurred
     *             {@linkplain BufferedReader#readLine()},
     *             {@linkplain BufferedReader#close()}
     * @throws FileHandlerException
     *             if an error occurred during parsing {@linkplain RDBFParser}
     */
    public RDBFFile loadRDBFFile(File file) throws IOException, FileHandlerException {
        if (!file.exists()) {
            throw new IOException();
        }
        RDBFFile f = new RDBFFile(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));

        readBlock(reader, f);

        reader.close();
        return f;
    }

    /**
     * Helper method for reading block data
     * 
     * @param reader
     *            file reader
     * @param ad
     *            current block or file
     * @throws FileHandlerException
     *             same as {@linkplain #loadRDBFFile(File)}
     * @throws IOException
     *             same as {@linkplain #loadRDBFFile(File)}
     */
    private void readBlock(BufferedReader reader, RDBFAdditions ad) throws FileHandlerException, IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            line = line.replace("\t", "").replace("\uFEFF", "");
            int lineType = RDBFParser.getInstance().evaluateLineType(line);
            if (lineType == RDBFParser.LINE_ASSIGNMENT) {
                String name = RDBFParser.getInstance().getVariableName(line);
                String value = RDBFParser.getInstance().getValue(line);
                ad.addData(new RDBFData(name, value));
            } else if (lineType == RDBFParser.LINE_BLOCK) {
                String name = RDBFParser.getInstance().getBlockName(line);
                RDBFBlock block = new RDBFBlock(name);
                ad.addBlock(block);
                readBlock(reader, block);
            } else if (lineType == RDBFParser.LINE_BLOCK_TEXT_LENGTH) {
                int len = RDBFParser.getInstance().getIValue(RDBFParser.getInstance().getValue(line));
                String text = readTextBlock(reader, ad, len);
                ad.addData(new RDBFData("text", text, true));
            } else if (lineType == RDBFParser.LINE_BLOCK_END) {
                return;
            }
        }
    }

    private String readTextBlock(BufferedReader reader, RDBFAdditions block, int len) throws IOException {
        String line;
        StringBuilder text = new StringBuilder();
        int i = 0;
        while (i < len && (line = reader.readLine()) != null) {
            text.append(line + "\n");
            ++i;
        }
        return text.toString();
    }

}
