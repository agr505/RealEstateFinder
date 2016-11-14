/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.Color;
import java.awt.Dimension;
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
        
         //Iterator <Property> iter = ap.getProperties();
         //while(iter.hasNext())
         //{
            // String x = iter.next().getName();
            PropertyPanel p = new PropertyPanel("FD"); 
             //panel.add(p);
        // }
        //PropertyPanel pp= new PropertyPanel();
       // PropertyPanel p2= new PropertyPanel();

        this.add(panel);
        //panel.add(p);
         panel.add(p);
        this.setTitle("Customer View Description");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
}

class PropertyPanel extends JPanel{
    
    PropertyPanel(String x){
        //this.setLayout(new BoxLayout(b,BoxLayout.LINE_AXIS));
        JButton b = new JButton(x);
        this.add(b);
        this.setBackground(Color.gray);
        this.setPreferredSize(new Dimension(200,100));
    }
}
