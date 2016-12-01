/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author User
 */
public class SellerNavigationBar extends JMenuBar{
    
    SellerNavigationBar(Application application,InterestedCustomersPage icp,SellerPropertyListingsPage slp){
        
        JMenuBar bar =new  JMenuBar();
        
        //JMenu home, interestedCustomers;
        JMenuItem home, interestedCustomers,logout;
        home = new JMenuItem("Home");
        home.addActionListener(new SellerPropertyListingsPageNavigationBarButtonListener(icp,slp));
        this.add(home);
      //  home.addSeparator();
        
        interestedCustomers = new JMenuItem("Interested Customers");
        interestedCustomers.addActionListener(new InterestedCustomerNavigationBarButtonListener(icp,slp));
        this.add(interestedCustomers);
       // interestedCustomers.addSeparator();
        
        logout =new  JMenuItem("Log Out");
        logout.addActionListener(new LogOutButtonListener(application));
        this.add(logout);
        //logout.addSeparator();
        
        
    }
}
