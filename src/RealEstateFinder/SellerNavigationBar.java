/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author User
public class SellerNavigationBar extends JMenuBar{
    
    SellerNavigationBar(){
        
        JMenuBar bar =new  JMenuBar();
        
        JMenu home, logout, interestedCustomers;
        
        home = new JMenu("Home");
        this.add(home);
        home.addSeparator();
        
        interestedCustomers = new JMenu("Interested Customers");
        this.add(interestedCustomers);
        interestedCustomers.addSeparator();
        
        logout =new  JMenu("Log Out");
        this.add(logout);
        logout.addSeparator();
    }
}
