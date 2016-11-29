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
public class PropertyDescriptionPageStrategyProvider implements Serializable{
private static final long serialVersionUID = 6L;
    public String propertyname;
    public Favorites favorites;
    public Application application;
    public PropertyDescriptionPage propertydescriptionpage;
    public AvailableProperties availableProperties;

    PropertyDescriptionPageStrategyProvider(String pname, PropertyDescriptionPage propertydescriptionp, Favorites fav, Application app, AvailableProperties availableprops) {
        this.propertyname = pname;
        propertydescriptionpage = propertydescriptionp;
        favorites = fav;
        application = app;
        availableProperties = availableprops;
    }
    PropertyDescriptionPageStrategyProvider(String pname, PropertyDescriptionPage propertydescriptionp, Application app) {
        this.propertyname = pname;
        propertydescriptionpage = propertydescriptionp;
        favorites = null;
        application = app;
        availableProperties = null;
    }
    public void createview() {

        System.out.println("You selected " + propertyname);

        if (application.provideLoggedinAccount() instanceof Customer) {

            PropertyDescriptionPageStrategy customerstrategy = new PropertyDescriptionPageStrategy() {
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
                        fddtoFavorites.addActionListener(new PropertyDescriptionPageListener(propertyn, application, availableProperties));
                        jpanel.add(fddtoFavorites);

                        return jpanel;//attach addtofavorites button

                    } else if (fav.containsproperty(propertyn)) {//&& application.hascontactedcustomer(propertyname) == false

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
                        fddtoFavorites.addActionListener(new PropertyDescriptionPageListener(propertyn, application, availableProperties));
                        jpanel.add(fddtoFavorites);

                        return jpanel;//attach addtofavorites button

                    } else if (favorites.containsproperty(propertyn)) {//&& application.hascontactedcustomer(propertyname) == false

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
