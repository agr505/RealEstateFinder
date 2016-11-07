/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

/**
 *
 * @author Sam
 */
public class LoginSignupPage extends JFrame {
    
    JTextField tf1 = new JTextField(12);
    JTextField tf2 = new JTextField(12);
    
    JButton logButton = new JButton("Login");
   
   
    JLabel logLable = new JLabel("Log-In");
    JPanel panel = new JPanel();
    
    
    LoginSignupPage(){
        
        panel.add(tf1);
        panel.add(tf2);
         logButton.addActionListener(new ButtonListener());
        panel.add(logButton);
        this.add(panel);
        this.setName("Frame");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public String gettName(){
        return tf1.getText();
    }
    
    public String getPass(){
        return tf2.getText();
    }
    
   
        
    }

