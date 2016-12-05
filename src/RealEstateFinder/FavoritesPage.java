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
public class FavoritesPage extends JFrame {

    private static final long serialVersionUID = 38L;
    Favorites favorites;
    JPanel panel = new JPanel();
    Application application;
    AvailableProperties availableproperties;
    InterestedCustomers interestedcustomers;

    /**
     * Gets the name, picture and description of the property and sends it to
     * create a panel panel is returned and added to the frame
     *
     * @param fav an instance of Favorites
     * @param avproperties an instance of AvaliableProperties
     * @param app an instance of Application
     * @param interestedcust an instance of InterestedCustomers
     *
     */
    FavoritesPage(Favorites fav, AvailableProperties avproperties, Application app, InterestedCustomers interestedcust) {
        //!! CustomerNavigationBar bar = new CustomerNavigationBar(app);
        availableproperties = avproperties;
        application = app;
        favorites = fav;
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        interestedcustomers = interestedcust;
        Iterator<Property> iter = favorites.getProperties();

        while (iter.hasNext()) {
            //  PropertyDescriptionPage  propertydescriptionpage = new PropertyDescriptionPage();
            Property property = iter.next();
            String x = property.getName();
            String y = property.getPicture();
            String z = property.getText();
            PropertyPanel p = new PropertyPanel(x, y, z, app, favorites, favorites.listeners.get(1).propertydescriptionpage, avproperties, interestedcustomers);
            //   PropertyDescriptionPageStrategyProvider strategyprovider= new PropertyDescriptionPageStrategyProvider(property.getName(),propertydescriptionpage,favorites,app,avproperties);
            //  FavoritesStateChangeListener statechangelistener = new FavoritesStateChangeListener(propertydescriptionpage ,strategyprovider);
            panel.add(p);
        }
        //!!      this.add(bar, BorderLayout.NORTH);
        this.add(panel);
        this.setTitle("Favorites Page");
        this.pack();
        this.setVisible(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     *
     * Adds a customer navigation bar to the page
     *
     * @param bar an instance of CustomerNavigationBar
     */
    public void addbar(CustomerNavigationBar bar) {
        this.add(bar, BorderLayout.NORTH);
    }

    public void routetopage() {
        this.setVisible(true);
    }

    public void leavepage() {
        this.setVisible(false);
    }

    /**
     *
     * @param favorites container is passed Using the strategy pattern the
     * favorites button is added on the panel for all the properties
     */
    void createview(Favorites favorites) {
        if (panel != null) {
            panel.removeAll();
        }
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        Iterator<Property> iter = favorites.getProperties();

        while (iter.hasNext()) {

            while (iter.hasNext()) {
                //  PropertyDescriptionPage  propertydescriptionpage = new PropertyDescriptionPage();

                Property property = iter.next();
                String x = property.getName();
                String y = property.getPicture();
                String z = property.getText();

                PropertyDescriptionPage page = null;
                for (int i = 1; i < favorites.listeners.size(); i++) {
                    if (favorites.listeners.get(i).property.equals(property.getName())) {
                        page = favorites.listeners.get(i).propertydescriptionpage;
                    }
                }
                PropertyPanel p = new PropertyPanel(x, y, z, application, favorites, page, availableproperties, interestedcustomers);
                PropertyDescriptionPageStrategyProvider strategyprovider = new PropertyDescriptionPageStrategyProvider(property.getName(), page, favorites, application, availableproperties);
                FavoritesStateChangeListener statechangelistener = new FavoritesStateChangeListener(page, strategyprovider, property.getName());

                //   PropertyDescriptionPageStrategyProvider strategyprovider= new PropertyDescriptionPageStrategyProvider(property.getName(),propertydescriptionpage,favorites,application,availableproperties);
                // FavoritesStateChangeListener statechangelistener = new FavoritesStateChangeListener(propertydescriptionpage ,strategyprovider, property.getName())
                panel.add(p);
            }

            this.add(panel);
            this.setTitle("Favorites Page");
            this.pack();
            // this.setVisible(false);
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
                //  b.addActionListener(new ViewPropertyButtonListener(x,propertydescriptionpage, fav, app, availableProps));
            }
        }
    }
}
