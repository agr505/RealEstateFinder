/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aaron
 */
/**
 * Button Listener for handling click events to the view the PropertyDescriptionPage
 * of the property
 */
public class ViewPropertyButtonListener implements ActionListener {

    public String propertyname;
    public Favorites favorites;
    public Application application;
    public PropertyDescriptionPage propertydescriptionpage;
    public AvailableProperties availableProperties;
    public PropertyDescriptionPageStrategyProvider strategyprovider;
    
/**
 * Constructor for a ViewPropertyButtonListener for when a Customer is logged in creating a listeners to respond
 * Favorites and InterestedCustomers 
 * @param pname String containing the name of the Property
 * @param propertydescriptionp reference to the PropertyDescriptionPage associated with this button listener
 * @param fav reference to Favorites
 * @param app reference to Application
 * @param availableprops reference to AvailableProperties
 * @param interestedcustomers reference to InterestedCustomers
 */
    ViewPropertyButtonListener(String pname, PropertyDescriptionPage propertydescriptionp, Favorites fav, Application app, AvailableProperties availableprops,InterestedCustomers interestedcustomers) {
        this.propertyname = pname;
        propertydescriptionpage = propertydescriptionp;
        favorites = fav;
        application = app;
        availableProperties = availableprops;
        strategyprovider=new  PropertyDescriptionPageStrategyProvider(propertyname,propertydescriptionpage,favorites ,application, availableProperties);
        

    favorites.addListener(new FavoritesStateChangeListener(propertydescriptionpage, strategyprovider, pname));

            interestedcustomers.addListener(new InterestedCustomersStateChangeListener(propertydescriptionpage,strategyprovider,pname,application));


}
    
    /**
   * Constructor for a ViewPropertyButtonListener for when a Seller is logged in creating a listeners to respond
 * Favorites and InterestedCustomers 
     * @param pname String containing the name of the Property
 * @param propertydescriptionp reference to the PropertyDescriptionPage associated with this button listener
    * @param app reference to Application
 * @param availableprops reference to AvailableProperties
     */
  ViewPropertyButtonListener(String pname, PropertyDescriptionPage propertydescriptionp, Application app, AvailableProperties availableprops) {

    
        this.propertyname = pname;
        propertydescriptionpage = propertydescriptionp;
        application = app;
        availableProperties = availableprops;
        strategyprovider=new  PropertyDescriptionPageStrategyProvider(propertyname,propertydescriptionpage,favorites ,application, availableProperties);
        
       availableprops.addListener(new AvailablePropertiesStateChangeListener(propertydescriptionpage,strategyprovider,propertyname,application)); 


    }
    @Override
    /**
     * Function to be called to handle an ActionEvent such as a button click to view a PropertyDescriptionPage
     */
    public void actionPerformed(ActionEvent e) {

   
            System.out.println("PRESSED");
strategyprovider.createview();
         
    
    }
}
