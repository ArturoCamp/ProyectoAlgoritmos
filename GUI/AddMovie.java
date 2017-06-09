/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Data.Data;
import Domian.Movie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.csvreader.CsvWriter;
import javax.swing.JComboBox;

/**
 *
 * @author arturo
 */
public class AddMovie extends JInternalFrame implements ActionListener {

    JLabel jlblName;
    JLabel jlblSub;
    JLabel jlblPrem;

    JLabel jlblTotal;
    JTextField txtName;

    JTextField txtTotal;
    JButton jbtnaddMovie;
    String[] gene = {"Drama ",
        "Comedy", "Childish", "Action ",
        "Romance", "Fiction"};
    JComboBox cmbGene = new JComboBox(gene);
    String[] subti = {"Yes ",
        "No"};
    JComboBox cmbSub = new JComboBox(subti);
    String[] premier = {"Yes ",
        "No"};
    JComboBox cmbPremier = new JComboBox(premier);

    AddMovie() {
        super();

        this.setClosable(true);
        this.setLayout(null);
        this.setSize(500, 400);

        init();
        this.setVisible(true);
    }

    private void init() {

        this.jlblName = new JLabel("title");
        this.txtName = new JTextField();
        this.jlblName.setBounds(10, 30, 150, 30);
        this.txtName.setBounds(100, 35, 110, 20);
        this.jlblTotal = new JLabel("total");
        this.txtTotal = new JTextField();
        this.jlblTotal.setBounds(10, 60, 150, 30);
        this.txtTotal.setBounds(100, 65, 110, 20);

        this.jlblSub = new JLabel("Subtitled");
        this.jlblPrem = new JLabel("Premier");
         this.jlblSub.setBounds(10, 170, 150, 30);
        this.jlblPrem.setBounds(200, 170, 150, 30);
        this.cmbGene.setBounds(10, 130, 150, 30);
         this.cmbGene.addActionListener(this);
        this.cmbSub.setBounds(10, 200, 150, 30);
         this.cmbSub.addActionListener(this);
        this.cmbPremier.setBounds(200, 200, 150, 30);
         this.cmbPremier.addActionListener(this);

        this.jbtnaddMovie = new JButton("Registrar");
        this.jbtnaddMovie.addActionListener(this);
        this.jbtnaddMovie.setBounds(10, 300, 100, 30);
        this.add(this.jlblName);
        this.add(this.txtName);
        this.add(this.jlblTotal);
        this.add(this.txtTotal);
        this.add(this.cmbGene);
        this.add(this.cmbSub);
        this.add(this.cmbPremier);
         this.add(this.jlblSub);
        this.add(this.jlblPrem);
        

        this.add(this.jbtnaddMovie);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.jbtnaddMovie) {
            Movie movie=new Movie();
           // if(e.getSource()==cmbGene){
//                JComboBox cb=(JComboBox)e.getSource();
                String g=(String)this.cmbGene.getSelectedItem();
                 if("Drama ".equals(g)){ 
                    movie.setGender("1000");
                    }else  if("Comedy ".equals(g)){ 
                    movie.setGender("2000");
                    }else  if("Childish ".equals(g)){ 
                    movie.setGender("3000");
                    }else  if("Action ".equals(g)){ 
                    movie.setGender("4000");
                    }else  if("Romance ".equals(g)){ 
                    movie.setGender("5000");
                    }else  if("Fiction".equals(g)){ 
                    movie.setGender("6000");
                    }
     
                ///}
                
            
             //if(e.getSource()==cmbSub){
               // JComboBox cb=(JComboBox)e.getSource();
                String s=(String)cmbSub.getSelectedItem();
                
                switch(s){
                    case "Yes ": 
                    movie.setSubtitled("1");
                        break;
                    case  "No":
                    movie.setSubtitled("0");
                        break;    
                       
                }
           
                String p=(String)cmbPremier.getSelectedItem();
               
                switch(p){
                     case "Yes ": 
                    movie.setPremier("1");
                        break;
                    case  "No":
                    movie.setPremier("0");
                        break;    
     
                }
            //}
           movie.setTitle(txtName.getText());
           movie.setTotal(txtTotal.getText());
           System.out.println(movie);
           Data data=new Data();
               data.writerArchive(movie);
        }
        
    }
    
}
