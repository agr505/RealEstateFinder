package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
/**
 * Button Listener for handling click events to go to FavoritesPage
 */
public class FavoritesNavigationBarButtonListener implements ActionListener {

    FavoritesPage favoritespage;
    CustomerPropertiesPage customerpropertiespage;

    /**
     * Constructor initializing FavoritesPage reference and
     * CustomerPropertiesPage reference
     *
     * @param fp FavoritesPage reference
     * @param custpp CustomerPropertiesPage reference
     */
    FavoritesNavigationBarButtonListener(FavoritesPage fp, CustomerPropertiesPage custpp) {
        favoritespage = fp;
        customerpropertiespage = custpp;
    }

    @Override
    /**
     * Event handler for the user clicking to go to the FavoritesPage
     *
     * @param e ActionEvent containing information about the event
     */

    public void actionPerformed(ActionEvent e) {
        customerpropertiespage.leavepage();
        favoritespage.routetopage();

    }
}
