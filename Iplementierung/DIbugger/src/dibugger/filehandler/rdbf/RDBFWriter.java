package dibugger.filehandler.rdbf;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * Contains methods for saving an RDBFFile
 * 
 * @author Pascal
 *
 */
public class RDBFWriter {

    /**
     * Saves a given RDBFFile to the filesystem
     * 
     * @param f
     *            the file to save
     * @throws IOException
     *             if an error during file writing occurred
     *             {@linkplain BufferedWriter#write(String)},
     *             {@linkplain BufferedWriter#close()}
     */
    public void saveRDBFFile(RDBFFile f) throws IOException {
        if (f.getSysFile() == null) {
            throw new FileNotFoundException();
        }
        f.getSysFile().mkdirs();
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(f.getSysFile()), StandardCharsets.UTF_8));
        saveBlock(writer, f, "");
        writer.close();
    }

    /**
     * Helper method for saving an RBDFFile
     * 
     * @param writer
     *            a BufferedWriter
     * @param ad
     *            the addition to write (file or block)
     * @param tab
     *            only for user editor reading purposes
     * @throws IOException
     *             same as {@linkplain #saveRDBFFile(RDBFFile)}
     */
    private void saveBlock(BufferedWriter writer, RDBFAdditions ad, String tab) throws IOException {
        for (RDBFData data : ad.getList_data()) {
            if (data.getDataType() != RDBFData.DATA_TEXT) {
                writer.write(tab + data.getName() + "=" + data.getValue() + "\n");
            } else {
                writer.write(tab + "def_blockLen=" + data.getValue().split("\n").length + "\n");
                writer.write(data.getValue() + "\n");
            }
        }
        for (RDBFBlock block : ad.getList_blocks()) {
            writer.write(tab + block.getName() + "{\n");
            saveBlock(writer, block, tab + "\t");
            writer.write(tab + "}\n");
        }
    }
}
