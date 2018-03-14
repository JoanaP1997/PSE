package test.filehandler;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.facade.LanguageFile;
import dibugger.filehandler.rdbf.RDBFDBReader;
import dibugger.filehandler.rdbf.RDBFDBWriter;

public class LanguageEditor {

    public static void main(String[] args) throws FileHandlerException {
        LanguageFile f0 = new LanguageFile("", "");

        JFileChooser chooser = new JFileChooser("./");
        chooser.showOpenDialog(null);
        if (chooser.getSelectedFile() != null) {
//            f0 = new RDBFDBReader().loadLanguageFile(chooser.getSelectedFile());
        }

        final LanguageFile f = f0;

        JFrame frame = new JFrame("Lang edit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 360);

        GridLayout lay = new GridLayout(6, 1);
        lay.setHgap(5);
        lay.setVgap(5);
        frame.setLayout(lay);

        JTextArea translation = new JTextArea();
        JTextArea identifier = new JTextArea();

        JList<String> list_translations = new JList<String>();
        list_translations.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                String key = list_translations.getSelectedValue();
                translation.setText(key);
                identifier.setText(f.getTranslation(key));
            }
        });
        if (chooser.getSelectedFile() != null) {
            DefaultListModel<String> m = new DefaultListModel<String>();
            for (String key : f.getMap_translations().keySet()) {
                m.addElement(key);
            }
            list_translations.setModel(m);
        }

        JButton put = new JButton("Add Translation");
        put.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.getMap_translations().put(translation.getText(), identifier.getText());

                DefaultListModel<String> m = new DefaultListModel<String>();
                for (String key : f.getMap_translations().keySet()) {
                    m.addElement(key);
                }
                list_translations.setModel(m);
            }
        });

        JButton save = new JButton("Save");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setLangID(translation.getText());
                f.setName(identifier.getText());
                RDBFDBWriter w = new RDBFDBWriter();
                w.saveLanguageFile(f);

            }
        });

        JButton clear = new JButton("Clear Translations");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.getMap_translations().clear();
            }
        });

        JScrollPane scroll = new JScrollPane(list_translations);

        frame.add(translation);
        frame.add(identifier);
        frame.add(put);
        frame.add(save);
        frame.add(clear);
        frame.add(scroll);

        frame.setVisible(true);
    }

}
