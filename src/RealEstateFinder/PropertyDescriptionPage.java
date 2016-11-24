/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author User
 */
public class PropertyDescriptionPage extends JFrame {
JPanel currentpanel;
CustomerNavigationBar bar = new CustomerNavigationBar();
    //JButton contactSellerButton;
    PropertyDescriptionPage() {
    JPanel currentpanel=null;
        //contactSellerButton = new JButton("Contact Seller");
        //this.add(contactSellerButton);
        // String name = "First property";
        // contactSellerButton.addActionListener(new contactSellerButtonListener(name, apRef));
        
        this.add(bar, BorderLayout.NORTH);
        this.setTitle("Property Description Page");
        //this.pack();
        this.setSize(250, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void usestrategy(PropertyDescriptionPageStrategy strategy) {
        if(currentpanel!=null)
        {
        this.remove(currentpanel);
        }
        JPanel jpanel = new JPanel();

        JPanel j = strategy.buildview(jpanel);
        currentpanel=j;
        
        this.add(j);
        
        this.setVisible(true);
        System.out.println("in property description page"+this.hashCode());
    }

}
