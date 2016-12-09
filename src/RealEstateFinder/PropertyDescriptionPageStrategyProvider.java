/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.BorderLayout;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Aaron
 */
/**
 * Provides the PropertyDescriptionPage strategy to build the PropertyDescriptionPage based on circumstances
 */
public class PropertyDescriptionPageStrategyProvider implements Serializable{
private static final long serialVersionUID = 6L;
    public String propertyname;
    public Favorites favorites;
    
    
    public Application application;
    public PropertyDescriptionPage propertydescriptionpage;
    public AvailableProperties availableProperties;
/**
 * Constructor for this class which is used when a Customer is logged in 
 * @param pname String that holds the value of the Property being associated with
 * @param propertydescriptionp reference to the PropertyDescriptionPage instance associated with the Property
 * @param fav reference to the Favorites instance associated with the Customer
 * @param app reference to the Application instance
 * @param availableprops reference to the AvailableProperties instance
 */
    PropertyDescriptionPageStrategyProvider(String pname, PropertyDescriptionPage propertydescriptionp, Favorites fav, Application app, AvailableProperties availableprops) {
        this.propertyname = pname;
        propertydescriptionpage = propertydescriptionp;
        favorites = fav;
        application = app;
        availableProperties = availableprops;
    }
    /**
     * Constructor for this class which is used when a Seller is logged in 
    *@param pname String that holds the value of the Property being associated with
 * @param propertydescriptionp reference to the PropertyDescriptionPage instance associated with the Property
     * @param app reference to the Application instance
     */
    PropertyDescriptionPageStrategyProvider(String pname, PropertyDescriptionPage propertydescriptionp, Application app) {
        this.propertyname = pname;
        propertydescriptionpage = propertydescriptionp;
        favorites = null;
        application = app;
        availableProperties = null;
    }
    
    /**
     * Method for creating the anonymous class that implements the PropertyDescriptionPageStrategy interface
     * and then invokes the PropertyDescriptionPage to use the strategy to help build itself
     */
    public void createview() {

        System.out.println("You selected " + propertyname);

        if (application.provideLoggedinAccount() instanceof Customer) {

            PropertyDescriptionPageStrategy customerstrategy = new PropertyDescriptionPageStrategy() {
              /**
               * Method that implements the buildview method declared in the PropertyDescriptionPageStrategy interface
               * and returns a JPanel based on if the Property is in the Customer's Favorites, is in the Customer's Favorites
               * but has not contacted the Seller, and is in the Customer's Favorites and has contacted the Seller
               * @param jpanel
               * @return 
               */
                @Override               
                public JPanel buildview(JPanel jpanel) {

                    if (!favorites.containsproperty(propertyname)) {
                        //if (jpanel.)
                        JButton fddtoFavorites = new JButton("Add to Favorites");
                        fddtoFavorites.addActionListener(new AddtoFavoritesButtonListener(propertyname,availableProperties));
                        jpanel.add(fddtoFavorites);
                        return jpanel;//attach addtofavorites button

                    } else if (favorites.containsproperty(propertyname)&& application.hascontactedcustomer(propertyname) == false) {
                        System.out.println("already");
                             JButton contactSeller = new JButton("Contact Seller");
                        contactSeller.addActionListener(new ContactSellerButtonListener(propertyname,application));
                        jpanel.add(contactSeller);
                        return jpanel;//attach contactseller button

                    } else if (favorites.containsproperty(propertyname) && application.hascontactedcustomer(propertyname)) {

                        return jpanel;//no buttons on panel, just description
                    }
                    return null;
                }
            ;

            };
                propertydescriptionpage.usestrategy(customerstrategy);
        } else if (application.provideLoggedinAccount() instanceof Seller) {
            PropertyDescriptionPageStrategy sellerstrategy = new PropertyDescriptionPageStrategy() {
                @Override
                     /**
               * Method that implements the buildview method declared in the PropertyDescriptionPageStrategy interface
               * and returns a JPanel with an Update button
               * @param jpanel JPanel which is to be returned 
               * @return 
               */
                public JPanel buildview(JPanel jpanel) {
                    //always attach update button
                    JButton updateProperty = new JButton("Update Property");
                       JTextField tf = new JTextField(50);
                    UpdateButtonListener listener=new UpdateButtonListener(availableProperties,tf,propertyname);
                    updateProperty.addActionListener(listener);
                    jpanel.add(tf, BorderLayout.NORTH);
                    jpanel.add(updateProperty, BorderLayout.SOUTH);
                    
     
                    return jpanel;
                } //textfield added as well with Avpropstatechange listener getting reference to this tex
            ;

            };
               propertydescriptionpage.usestrategy(sellerstrategy);
            ;

        }
    }

    public void createview(Favorites fav, FavoritesStateEvent e, PropertyDescriptionPage propdescriptionpage) {
        String propertyn = e.currentproperty;

     
        propdescriptionpage.setVisible(false);
        if (application.provideLoggedinAccount() instanceof Customer) {

            PropertyDescriptionPageStrategy customerstrategy = new PropertyDescriptionPageStrategy() {
               /**
                * 
                * @param jpanel
                * @return 
                */
                @Override
                public JPanel buildview(JPanel jpanel) {

                    if (!fav.containsproperty(propertyn)) {
                        //if (jpanel.)
                        JButton fddtoFavorites = new JButton("Add to Favorites");
                        fddtoFavorites.addActionListener(new AddtoFavoritesButtonListener(propertyn, availableProperties));
                        jpanel.add(fddtoFavorites);

                        return jpanel;//attach addtofavorites button

                    } else if (fav.containsproperty(propertyn)&& application.hascontactedcustomer(propertyname) == false) {

                        JButton contactSeller = new JButton("Contact Seller");
                        contactSeller.addActionListener(new ContactSellerButtonListener(propertyn,application));
                        jpanel.add(contactSeller);
                        return jpanel;//attach contactseller button

                    } else if (fav.containsproperty(propertyn) && application.hascontactedcustomer(propertyn)) {

                        return jpanel;//no buttons on panel, just description
                    }
                    return null;
                }
            ;

            };
                propdescriptionpage.usestrategy(customerstrategy);
        } else if (application.provideLoggedinAccount() instanceof Seller) {
            PropertyDescriptionPageStrategy sellerstrategy = new PropertyDescriptionPageStrategy() {
                @Override
                public JPanel buildview(JPanel jpanel) {
                    //always attach update button
                    JButton updateProperty = new JButton("Update Property");
                    jpanel.add(updateProperty);
                    return jpanel;
                }
            ;

            };
               propertydescriptionpage.usestrategy(sellerstrategy);
            ;

        }
    }
     public void createview( InterestedCustomersStateEvent e, PropertyDescriptionPage propdescriptionpage) {
        String propertyn = e.currentproperty;

     
        propdescriptionpage.setVisible(false);
        if (application.provideLoggedinAccount() instanceof Customer) {

            PropertyDescriptionPageStrategy customerstrategy = new PropertyDescriptionPageStrategy() {
                @Override
                public JPanel buildview(JPanel jpanel) {

                    if (!favorites.containsproperty(propertyn)) {
                        //if (jpanel.)
                        JButton fddtoFavorites = new JButton("Add to Favorites");
                        fddtoFavorites.addActionListener(new AddtoFavoritesButtonListener(propertyn, availableProperties));
                        jpanel.add(fddtoFavorites);

                        return jpanel;//attach addtofavorites button

                    } else if (favorites.containsproperty(propertyn)&& application.hascontactedcustomer(propertyname) == false) 
                    {
                        JButton contactSeller = new JButton("Contact Seller");
                        contactSeller.addActionListener(new ContactSellerButtonListener(propertyn,application));
                        jpanel.add(contactSeller);
                        return jpanel;//attach contactseller button

                    } else if (favorites.containsproperty(propertyn) && application.hascontactedcustomer(propertyn)) {

                        return jpanel;//no buttons on panel, just description
                    }
                    return null;
                }
            ;

            };
                propdescriptionpage.usestrategy(customerstrategy);
        } else if (application.provideLoggedinAccount() instanceof Seller) {
            PropertyDescriptionPageStrategy sellerstrategy = new PropertyDescriptionPageStrategy() {
                @Override
                public JPanel buildview(JPanel jpanel) {
                    //always attach update button
                    JButton updateProperty = new JButton("Update Property");
                 
                    jpanel.add(updateProperty);
                    return jpanel;
                   
                }
            ;

            };
               propertydescriptionpage.usestrategy(sellerstrategy);
            ;

        }
    }
}
