/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import javax.swing.*;

/**
 *
 * @author User
 */
public class PropertyDescriptionPage extends JFrame {

    //JButton contactSellerButton;
    PropertyDescriptionPage() {

        //contactSellerButton = new JButton("Contact Seller");
        //this.add(contactSellerButton);
        // String name = "First property";
        // contactSellerButton.addActionListener(new contactSellerButtonListener(name, apRef));
        this.setTitle("Property Description Page");
        //this.pack();
        this.setSize(250, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void usestrategy(PropertyDescriptionPageStrategy strategy) {
        
        JPanel jpanel = new JPanel();

        JPanel j = strategy.buildview(jpanel);
        this.add(j);
        this.setVisible(true);
    }

}
