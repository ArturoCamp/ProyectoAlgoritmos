/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arturo
 */
public class MovieList extends JInternalFrame implements ActionListener{
    JButton jbtnaddMovie;
    String[] gene = {"Drama ",
        "Comedy", "Childish", "Action ",
        "Romance", "Fiction"};
     JComboBox cmbGene = new JComboBox(gene);
      JTable jtbPrueba;
    DefaultTableModel dtmModeloPrueba;
     MovieList() {
        super();

        this.setClosable(true);
        this.setLayout(null);
        this.setSize(500, 400);

        init();
        this.setVisible(true);
    }
     private void init() {
         this.cmbGene.setBounds(10, 30, 150, 30);
         this.cmbGene.addActionListener(this);
          this.jbtnaddMovie = new JButton("Lista");
        this.jbtnaddMovie.addActionListener(this);
        this.jbtnaddMovie.setBounds(10, 300, 100, 30);
         this.add(this.cmbGene);
         this.add(this.jbtnaddMovie);
          
           this.dtmModeloPrueba = new DefaultTableModel();
        this.dtmModeloPrueba.addColumn("Codigo");
        this.dtmModeloPrueba.addColumn("Titulo");
        this.dtmModeloPrueba.addColumn("Genero");
        this.dtmModeloPrueba.addColumn("Total");
        this.dtmModeloPrueba.addColumn("Subtitulo");
        this.dtmModeloPrueba.addColumn("Premier");
     }


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
