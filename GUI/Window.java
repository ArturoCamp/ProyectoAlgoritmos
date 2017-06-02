/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
        

/**
 *
 * @author arturo
 */
public class Window extends JFrame implements ActionListener {

    private JDesktopPane jDesktopPane;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem itemRegistro1, itemRegistro2, itemRegistro3;

    public Window() {

        this.setSize(1366, 768);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.jDesktopPane = new JDesktopPane();
        this.jDesktopPane.setLayout(null);
        this.init();
        this.add(this.jDesktopPane);
        this.setVisible(true);
    }

    public void init() {

        this.menuBar = new JMenuBar();
        this.setJMenuBar(this.menuBar);

        this.menu = new JMenu("Menu");
        this.menuBar.add(this.menu);

        this.itemRegistro1 = new JMenuItem("File");
        this.itemRegistro1.addActionListener(this);
        this.menu.add(this.itemRegistro1);

        this.itemRegistro2 = new JMenuItem("Add Movie");
        this.itemRegistro2.addActionListener(this);
        this.menu.add(this.itemRegistro2);

        this.itemRegistro3 = new JMenuItem("Movie list");
        this.itemRegistro3.addActionListener(this);
        this.menu.add(this.itemRegistro3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.itemRegistro1) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("csv");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(chooser);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to open this file: "
                        + chooser.getSelectedFile().getName());
            }
        }//item1

        if (e.getSource() == this.itemRegistro2) {
            AddMovie addMovie = new AddMovie();
            addMovie.setFocusable(true);
            addMovie.setVisible(true);
            this.jDesktopPane.add(addMovie);
        }//item2

        if (e.getSource() == this.itemRegistro3) {

        }//item3
    }

}
