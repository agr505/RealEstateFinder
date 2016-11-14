/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.BoxLayout;


/**
 *
 * @author User
 */
public class CustomerPropertiesPage extends JFrame{
    
    AvailableProperties ap;
    JPanel panel = new JPanel();
    JButton viewDescButton = new JButton("View Description");
    JLabel label = new JLabel();
      
    CustomerPropertiesPage(AvailableProperties ref){
        ap = ref;
        
         Iterator <Property> iter = ap.getProperties();
         while(iter.hasNext())
         {
             String x = iter.next().getName();
            PropertyPanel p = new PropertyPanel(x); 
             panel.add(p);
             
        }
     

        this.add(panel);
        this.setTitle("Customer Property Page");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
    
}

class PropertyPanel extends JPanel{
    
    PropertyPanel(String x){
        
        this.setLayout(new BorderLayout());
        JButton b = new JButton("Property Description");
        JButton xx = new JButton("button");
        
        JLabel n = new JLabel(x);
        this.add(n, BorderLayout.NORTH);
        
        this.add(b, BorderLayout.SOUTH);
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(200,100));
        
      
    }
}
