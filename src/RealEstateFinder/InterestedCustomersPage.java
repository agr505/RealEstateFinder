/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
    JPanel panel = new JPanel();
    JScrollPane Sb = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    InterestedCustomersPage(InterestedCustomers ic,Application app){
        
        SellerNavigationBar bar = new SellerNavigationBar(app);
        interestedcustomers = ic;
        interestedCustomersList = interestedcustomers.getInterestedCustomers();
        Iterator iter=interestedCustomersList.iterator();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        
        if (interestedcustomers.getInterestedCustomers()!= null){
            System.out.println("getting the interested customers");
            
              while (iter.hasNext()) {
         
          Customer  c = (Customer)iter.next();
            String x =c.getusername();
            System.out.println("tttttttttttttttttttttttt" + x);
            String y =c.returnphonenumber();
            String z = c.returnlatestpropertyinterestedin();
            SellerPanel p = new SellerPanel(x,y,z);
            panel.add(p);
        }
        

      //  this.add(panel);
        
        this.add(Sb);
        this.add(bar, BorderLayout.NORTH);
        this.setTitle("Interested Customers Page");
        this.pack();
        this.setSize(500, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}}

class SellerPanel extends JPanel {


    SellerPanel(String x, String y, String z) {

        this.setLayout(new BorderLayout());

        
        
        

        JLabel latestProp = new JLabel(z);
        JLabel userName = new JLabel(x);
        JLabel phoneNum = new JLabel(y);
        this.add(userName, BorderLayout.NORTH);
        this.add(phoneNum, BorderLayout.WEST);
        this.add(latestProp, BorderLayout.CENTER);
        
        
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(250, 150));

        

    }
}
