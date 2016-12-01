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


    CustomerNavigationBar(Application application,CustomerPropertiesPage custpp,FavoritesPage fp){
        
      
        
        JMenuItem home, logout, favorites;
        
        home = new JMenuItem("Home/Available Properties");
        this.add(home);
       // availablproperties.addSeparator();
        
        favorites = new JMenuItem("Favorites");
        favorites.addActionListener(new FavoritesNavigationBarButtonListener(fp,custpp));
        this.add(favorites);
       // favorites.addSeparator();
        
        logout =new  JMenuItem("Log Out");
         logout.addActionListener(new LogOutButtonListener(application));        
        this.add(logout);
      //  logout.addSeparator();
        
       // this.setSize(20, 10);
        //this.setVisible(true);
    }
    
}
