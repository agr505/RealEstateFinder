/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import javax.swing.JMenu;
import javax.swing.*;

/**
 *
 * @author Aaron
 */
public class CustomerNavigationBar extends JMenuBar{


    CustomerNavigationBar(Application application){
        
      
        
        JMenuItem availablproperties, logout, favorites;
        
        availablproperties = new JMenu("Home/Available Properties");
        this.add(availablproperties);
       // availablproperties.addSeparator();
        
        favorites = new JMenu("Favorites");
        this.add(favorites);
       // favorites.addSeparator();
        
        logout =new  JMenu("Log Out");
         logout.addActionListener(new LogOutButtonListener(application));        
        this.add(logout);
      //  logout.addSeparator();
        
       // this.setSize(20, 10);
        //this.setVisible(true);
    }
    
}
