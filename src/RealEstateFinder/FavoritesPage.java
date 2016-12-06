
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
/**
 * Page that shows the Properties in the Customer's Favorites
 * @author Aaron
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
     
        availableproperties = avproperties;
        application = app;
        favorites = fav;
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        interestedcustomers = interestedcust;
        Iterator<Property> iter = favorites.getProperties();

        while (iter.hasNext()) {
          
            Property property = iter.next();
            String x = property.getName();
            String y = property.getPicture();
            String z = property.getText();
            PropertyPanel p = new PropertyPanel(x, y, z, app, favorites, favorites.listeners.get(1).propertydescriptionpage, avproperties, interestedcustomers);
           panel.add(p);
        }
       
        this.add(panel);
        this.setTitle("Favorites Page");
        this.pack();
        this.setVisible(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     *
     * Adds a CustomerNavigationBar to the page
     *
     * @param bar an instance of CustomerNavigationBar
     */
    public void addbar(CustomerNavigationBar bar) {
        this.add(bar, BorderLayout.NORTH);
    }
 /**
     * sets the page to visible
     */
    public void routetopage() {
        this.setVisible(true);
    }
 /**
     * sets the page visibility to false
     */
    public void leavepage() {
        this.setVisible(false);
    }

    /**
     *
     * @param favorites container is passed using the strategy pattern the
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

              panel.add(p);
            }

            this.add(panel);
            this.setTitle("Favorites Page");
            this.pack();
           
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

  
    }
}
