/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Aaron
 */
public class PropertyDescriptionPageStrategyProvider {

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

    public void createview() {

        System.out.println("You selected " + propertyname);

        if (application.provideLoggedinAccount() instanceof Customer) {

            PropertyDescriptionPageStrategy customerstrategy = new PropertyDescriptionPageStrategy() {
                @Override
                public JPanel buildview(JPanel jpanel) {

                    if (!favorites.containsproperty(propertyname)) {
                        //if (jpanel.)
                        JButton fddtoFavorites = new JButton("Add to Favorites");
                        fddtoFavorites.addActionListener(new PropertyDescriptionPageListener(propertyname, application, availableProperties));
                        jpanel.add(fddtoFavorites);
                        return jpanel;//attach addtofavorites button

                    } else if (favorites.containsproperty(propertyname)) {//&& application.hascontactedcustomer(propertyname) == false
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
                    jpanel.add(updateProperty);
                    return jpanel;
                }
            ;

            };
               propertydescriptionpage.usestrategy(sellerstrategy);
            ;

        }
    }

    public void createview(Favorites fav, FavoritesStateEvent e, PropertyDescriptionPage propdescriptionpage) {
        String propertyn = e.currentproperty;
System.out.println("in provider"+propdescriptionpage.hashCode());
        System.out.println("You selected " + propertyn);
        propdescriptionpage.setVisible(false);
        if (application.provideLoggedinAccount() instanceof Customer) {

            PropertyDescriptionPageStrategy customerstrategy = new PropertyDescriptionPageStrategy() {
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
}
