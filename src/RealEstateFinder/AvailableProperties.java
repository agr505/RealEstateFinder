/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aaron
 */
public class AvailableProperties extends PropertyContainer {

    private Application application;
    private Favorites favorites;
    private ArrayList<AvailablePropertiesStateChangeListener> listeners;

    /**
     * Initializing the listeners array calls load properties
     *
     * @param app
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public AvailableProperties(Application app) throws ClassNotFoundException, IOException {
        super();
        listeners = new ArrayList<AvailablePropertiesStateChangeListener>();
        application = app;
        favorites = null;
        loadProperties();
    }

    public void addListener(AvailablePropertiesStateChangeListener listener) {
        listeners.add(listener);
    }

    /**
     * Assigns a reference to favorites
     * @param fav
     */
    public void assignFavorites(Favorites fav) {
        favorites = fav;
    }

    /**
     * Loads properties from property text file calls add property function is
     * propertContainer
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void loadProperties() throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("property.txt"));

        for (int i = 0; i < 16; i++) {
            Property p = (Property) in.readObject();
            System.out.println(p.getName());
            addProperty(p);
        }
        in.close();
    }
/**
 * gets the seller thats currently logged in
 * gets the sellers owned properties
 * creates an iterator for available properties
 * Matches the properties that are owned by the seller from all the available properties
 * put all the matched properties in matchedproperties container
 * calls update view function for the sellers listings page
 * @param p 
 */
    public void matchownedProperties(SellerPropertyListingsPage p) {
        SellerPropertyListingsPage pg;
        pg = p;

        Seller seller = (Seller) application.provideLoggedinAccount();

        int size = seller.getOwnedproperties().size();

        ArrayList<String> ownedproperties = seller.getOwnedproperties();

        Iterator<Property> iter = getProperties();

        PropertyContainer matchedproperties = new PropertyContainer();

        while (iter.hasNext()) {
            Property prop = iter.next();
            for (int i = 0; i < ownedproperties.size(); i++) {

                if (prop.getName().equals(ownedproperties.get(i))) {

                    matchedproperties.addProperty(prop);
                }
            }
        }
        pg.UpdateView(matchedproperties);
    }
/**
 * creates an iterator for available properties
 * goes through all the properties and matches the property that was selected to add to favorites
 * sends the property to Favorites add function
 * @param propertyname 
 */
    public void addtoFav(String propertyname) {
        Iterator<Property> iter = getProperties();

        while (iter.hasNext()) {
            //   System.out.println("this name is "+iter.next().getName()+"and parap="+propertyname);
            Property p = iter.next();
            if (p.getName().equals(propertyname)) {
                favorites.add(p);
            }
        }
    }

    /**
     * Available properties iterator is returned and property is matched with
     * the selected property by seller gets the new property name and text
     * removes the old property and adds the new property in
     *
     * @param text is the field that will be updated
     * @param propertyname is the name of the property
     */
    public void updateProperty(String text, String propertyname) {
        int r = 0;
        Boolean done = false;
        Iterator<Property> iter = getProperties();
        while (iter.hasNext() && done == false) {
            Property prop = iter.next();

            if (prop.getName().equals(propertyname)) {
                r++;
                Property p = new Property(prop.getName(), prop.getPicture(), text);
                done = true;
                iter.remove();
                addProperty(p);
                System.out.println("UPDATED");
            }
        }

        AvailablePropertiesStateEvent event = new AvailablePropertiesStateEvent(this, text);
        for (int i = 0; i < listeners.size(); i++) {
            if (listeners.get(i).property.equals(propertyname)) {
                listeners.get(i).stateChanged(event);
            }
        }
    }
}
