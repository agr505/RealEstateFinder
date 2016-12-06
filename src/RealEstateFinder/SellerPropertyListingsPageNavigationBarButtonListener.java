
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
/**
*Button Listener for handling click events to go to SellerPropertyListingsPage  
 */
public class SellerPropertyListingsPageNavigationBarButtonListener implements ActionListener {

 InterestedCustomersPage interestedcustomerspage;
 SellerPropertyListingsPage  sellerpropertyistingspage;
  
 
  
/**
 * Constructor initializing InterestedCustomersPage reference and SellerPropertyListingsPage reference
 * @param icp InterestedCustomersPage reference
 * @param slp SellerPropertyListingsPage reference
 */
SellerPropertyListingsPageNavigationBarButtonListener(InterestedCustomersPage icp,SellerPropertyListingsPage slp) {
      interestedcustomerspage=icp;
     sellerpropertyistingspage= slp;
    }

    @Override
 /**
 * Event handler for the user clicking to go to the SellerPropertyListingsPage
 * @param e ActionEvent containing information about the event
 */
     
    public void actionPerformed(ActionEvent e) {
   interestedcustomerspage.leavepage();
              sellerpropertyistingspage.routetopage();
    
           
       
}}
