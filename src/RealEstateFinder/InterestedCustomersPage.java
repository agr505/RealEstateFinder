/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author User
 */
public class InterestedCustomersPage extends JFrame{
    
    private InterestedCustomers interestedcustomers;
    private ArrayList<Customer> interestedCustomersList;
    
    InterestedCustomersPage(InterestedCustomers ic){
        SellerNavigationBar bar = new SellerNavigationBar();
        interestedcustomers = ic;
        interestedCustomersList = interestedcustomers.getInterestedCustomers();
        if (interestedcustomers.getInterestedCustomers()!= null){
            System.out.println("getting the interested customers");
        }
        String line = "\n";
        
        JPanel panel = new JPanel();
        JTextArea tf = new JTextArea(5, 20);
        
        
        
        
        
        panel.add(tf);
        this.add(panel);
        this.add(bar, BorderLayout.NORTH);
        this.setTitle("Interested Customers Page");
        //this.pack();
        this.setSize(500, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
