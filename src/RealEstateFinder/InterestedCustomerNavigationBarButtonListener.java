package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
/**
 * Button Listener for handling click events to go to InterestedCustomersPage
 */
public class InterestedCustomerNavigationBarButtonListener implements ActionListener {

    InterestedCustomersPage interestedcustomerspage;
    SellerPropertyListingsPage sellerpropertyistingspage;

    /**
     * Constructor initializing InterestedCustomersPage reference and
     * SellerPropertyListingsPage reference
     *
     * @param icp InterestedCustomersPage reference
     * @param slp SellerPropertyListingsPage reference
     */
    InterestedCustomerNavigationBarButtonListener(InterestedCustomersPage icp, SellerPropertyListingsPage slp) {
        interestedcustomerspage = icp;
        sellerpropertyistingspage = slp;
    }

    @Override
    /**
     * Event handler for the user clicking to go to the InterestedCustomersPage
     *
     * @param e ActionEvent containing information about the event
     */
    public void actionPerformed(ActionEvent e) {
        sellerpropertyistingspage.leavepage();
        interestedcustomerspage.routetopage();

    }
}
