/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

/**
 *
 * @author User
 */
public class InterestedCustomersPage extends JFrame{
    
    private InterestedCustomers interestedcustomers;
    private ArrayList<Customer> interestedCustomersList;
    
    InterestedCustomersPage(InterestedCustomers ic,Application app){
        
        SellerNavigationBar bar = new SellerNavigationBar(app);
        interestedcustomers = ic;
        interestedCustomersList = interestedcustomers.getInterestedCustomers();
        Iterator iter=interestedCustomersList.iterator();
        
        if (interestedcustomers.getInterestedCustomers()!= null){
            System.out.println("getting the interested customers");
            
              while (iter.hasNext()) {
         
          Customer  c = (Customer)iter.next();
            String x =c.getusername();
            String y =c.returnphonenumber();
            String z = c.returnlatestpropertyinterestedin();
           
            // PropertyPanel panel = new PropertyPanel();
           // panel.add(p);
        }
        

      //  this.add(panel);
        
        
        this.add(bar, BorderLayout.NORTH);
        this.setTitle("Interested Customers Page");
        //this.pack();
        this.setSize(500, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}}
