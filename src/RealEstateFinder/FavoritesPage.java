/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Iterator;
import javax.swing.*;

/**
 *
 * @author User
 */
public class FavoritesPage extends JFrame {

  
    Favorites favorites;
    JPanel panel = new JPanel();
   Application application;
AvailableProperties availableproperties;
   
    FavoritesPage(Favorites fav,AvailableProperties avproperties, Application app) {

      availableproperties=avproperties;
      application=app;
        favorites = fav;
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
      

        Iterator<Property> iter = favorites.getProperties();
        
        
        

   while (iter.hasNext()) {
         //  PropertyDescriptionPage  propertydescriptionpage = new PropertyDescriptionPage();
            Property property = iter.next();
            String x = property.getName();
            String y = property.getPicture();
            String z = property.getText();
            PropertyPanel p = new PropertyPanel(x, y, z, app, favorites, favorites.listeners.get(1).propertydescriptionpage, avproperties);
         //   PropertyDescriptionPageStrategyProvider strategyprovider= new PropertyDescriptionPageStrategyProvider(property.getName(),propertydescriptionpage,favorites,app,avproperties);
          //  FavoritesStateChangeListener statechangelistener = new FavoritesStateChangeListener(propertydescriptionpage ,strategyprovider);
            panel.add(p);
        }

        this.add(panel);
        this.setTitle("Favorites Page");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
   
   
    void createview(Favorites favorites) {
                panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
      

        Iterator<Property> iter = favorites.getProperties();
        
        
        

   while (iter.hasNext()) {
         //  PropertyDescriptionPage  propertydescriptionpage = new PropertyDescriptionPage();
            Property property = iter.next();
            String x = property.getName();
            String y = property.getPicture();
            String z = property.getText();
            PropertyPanel p = new PropertyPanel(x, y, z, application, favorites, favorites.listeners.get(1).propertydescriptionpage, availableproperties);
           /* PropertyDescriptionPageStrategyProvider strategyprovider= new PropertyDescriptionPageStrategyProvider(property.getName(),propertydescriptionpage,favorites,application,availableproperties);
            FavoritesStateChangeListener statechangelistener = new FavoritesStateChangeListener(propertydescriptionpage ,strategyprovider);*/
            panel.add(p);
        }

        this.add(panel);
        this.setTitle("Favorites Page");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    class FavoritePropertyPanel extends JPanel {

        JButton b;

        FavoritePropertyPanel(String x, String y, String z, Application app, Favorites fav, PropertyDescriptionPage propertydescriptionpage, AvailableProperties availableProps) {

                  this.setLayout(new BorderLayout());

        b = new JButton("View Property Description");
      
        JLabel jl = new JLabel();
      //  jl.setIcon(new ImageIcon(y));

        JLabel description = new JLabel();
        JLabel n = new JLabel();
        this.add(n, BorderLayout.NORTH);
        this.add(jl, BorderLayout.WEST);
        this.add(description, BorderLayout.CENTER);
        validate();

        this.add(b, BorderLayout.SOUTH);
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(250, 150));

        b.addActionListener(new ViewPropertyButtonListener(x,propertydescriptionpage, fav, app, availableProps));

        }
    }
    

}
