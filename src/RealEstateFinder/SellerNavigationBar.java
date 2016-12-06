
package RealEstateFinder;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author User
 */
/**
 * Seller's navigation bar
 * 
 */
public class SellerNavigationBar extends JMenuBar{
    
    /**
     * 
     * @param application is the reference to Application
     * @param icp is the reference to InterestedCustomersPage
     * @param slp is the reference to sellerPropertyListingsPage
     * Creates a navigation bar for seller
     * adds the home interested customers and logout buttons to the bar
     * adds actionlistener to the buttons
     * adds the buttons to the JMenuBar 
     */
    SellerNavigationBar(Application application,InterestedCustomersPage icp,SellerPropertyListingsPage slp){
        
        JMenuBar bar =new  JMenuBar();
        
   
        JMenuItem home, interestedCustomers,logout;
        home = new JMenuItem("Home");
        home.addActionListener(new SellerPropertyListingsPageNavigationBarButtonListener(icp,slp));
        this.add(home);

        
        interestedCustomers = new JMenuItem("Interested Customers");
        interestedCustomers.addActionListener(new InterestedCustomerNavigationBarButtonListener(icp,slp));
        this.add(interestedCustomers);
      
        
        logout =new  JMenuItem("Log Out");
        logout.addActionListener(new LogOutButtonListener(application));
        this.add(logout);
      
        
        
    }
}
