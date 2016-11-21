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

    AvailableProperties availableproperties;
    Favorites favorites;
    JPanel panel = new JPanel();

    FavoritesPage(Favorites fav, AvailableProperties availabelProps) {

        availableproperties = availabelProps;
        this.favorites = fav;
        //if (favorites.getProperties())
        
        Iterator<Property> iter = favorites.getProperties();
        
        
        

        while (iter.hasNext()) {
            Property property = iter.next();
            String name = property.getName();
            String pic = property.getPicture();
            String text = property.getText();

            FavoritePropertyPanel p = new FavoritePropertyPanel(name, pic, text);
            panel.add(p);
        }
        this.add(panel);
        this.setTitle("Favorites Page");
        //this.pack();

        this.setSize(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class FavoritePropertyPanel extends JPanel {

        JButton b;

        FavoritePropertyPanel(String name, String pic, String text) {

            this.setLayout(new BorderLayout());

            b = new JButton("View Property Description");
            //JButton xx = new JButton("button");
            JLabel jl = new JLabel();
            jl.setIcon(new ImageIcon(pic));

            JLabel description = new JLabel(text);
            JLabel n = new JLabel(name);
            this.add(n, BorderLayout.NORTH);
            this.add(jl, BorderLayout.WEST);
            this.add(description, BorderLayout.CENTER);
            validate();

            this.add(b, BorderLayout.SOUTH);
            this.setBackground(Color.white);
            this.setPreferredSize(new Dimension(250, 150));

        }
    }

}
