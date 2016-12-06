
package RealEstateFinder;

import javax.swing.JMenu;
import javax.swing.*;

/**
 *
 * @author Aaron
 */
/**
 * Customer's navigation bar
 * 
 */
public class CustomerNavigationBar extends JMenuBar {

    /**
     * Creates a Navigation bar for the customers adds the Home button,
     * favorites button and log-out button
     * @param application
     * @param custpp
     * @param fp
     */
    CustomerNavigationBar(Application application, CustomerPropertiesPage custpp, FavoritesPage fp) {

        JMenuItem home, logout, favorites;

        home = new JMenuItem("Home/Available Properties");
        home.addActionListener(new CustomerPropertiesPageNavigationBarButtonListener(fp, custpp));
        this.add(home);
      

        favorites = new JMenuItem("Favorites");
        favorites.addActionListener(new FavoritesNavigationBarButtonListener(fp, custpp));
        this.add(favorites);
       

        logout = new JMenuItem("Log Out");
        logout.addActionListener(new LogOutButtonListener(application));
        this.add(logout);
     

       
    }

}
