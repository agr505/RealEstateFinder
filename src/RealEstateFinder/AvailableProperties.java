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

    public AvailableProperties(Application app, Favorites fav) throws ClassNotFoundException, IOException {
        super();
        application = app;
        favorites = fav;
        loadProperties();
    }

    public void loadProperties() throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("property.txt"));

        for (int i = 0; i < 2; i++) {
            Property p = (Property) in.readObject();
            System.out.println(p.getName());
            addProperty(p);
        }

        in.close();

    }

    public void matchownedProperties() {
        Seller seller = (Seller) application.provideLoggedinAccount();

        ArrayList<String> ownedproperties = seller.getOwnedproperties();

        Iterator<Property> iter = getProperties();

        PropertyContainer matchedproperties = new PropertyContainer();

        for (int i = 0; i < ownedproperties.size(); i++) {
            while (iter.hasNext()) {
                if (iter.next().getName().equals(ownedproperties.get(i))) {
                    matchedproperties.addProperty(iter.next());

                    //SellerPropertyListingsPage.UpdateView(matchedproperties);
                }
            }
        }
    }

    public void addtoFav(String propertyname){
        Iterator<Property> iter = getProperties();
        while (iter.hasNext()) {
            if (iter.next().getName().equals(propertyname)) {
                favorites.addProperty(iter.next());

            }

        }
    }
}
