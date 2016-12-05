/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
public class FavoritesNavigationBarButtonListener implements ActionListener {

    FavoritesPage favoritespage;
    CustomerPropertiesPage customerpropertiespage;

    FavoritesNavigationBarButtonListener(FavoritesPage fp, CustomerPropertiesPage custpp) {
        favoritespage = fp;
        customerpropertiespage = custpp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        customerpropertiespage.leavepage();
        favoritespage.routetopage();

    }
}
