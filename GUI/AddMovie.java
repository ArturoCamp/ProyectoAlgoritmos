/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author arturo
 */
public class AddMovie extends JInternalFrame implements ActionListener {
    
      
  
    JLabel jlblName;
    
    JLabel jlblTotal;
    JTextField txtName;
    
    JTextField txtTotal;
    JButton jbtnaddMovie;

    AddMovie () {
        super();
       
        this.setClosable(true);
        this.setLayout(null);
        this.setSize(500, 400);

        init();
        this.setVisible(true);
    }

    private void init() {
        this.jlblName = new JLabel("Cedula");
        this.txtName = new JTextField();
        this.jlblName.setBounds(10, 10, 150, 30);
        this.txtName.setBounds(100, 15, 110, 20);
       
        this.jlblTotal = new JLabel("Apellido");
        this.txtTotal = new JTextField();
        this.jlblTotal.setBounds(10, 50, 150, 30);
        this.txtTotal.setBounds(100, 55, 110, 20);
        this.jbtnaddMovie = new JButton("Registrar");
        this.jbtnaddMovie.addActionListener(this);
        this.jbtnaddMovie.setBounds(10, 300, 100, 30);
        this.add(this.jlblName);
        this.add(this.txtName);
        this.add(this.jlblTotal);
        this.add(this.txtTotal);
       
        this.add(this.jbtnaddMovie);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
    }
}
