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

    public AvailableProperties(Application app) throws ClassNotFoundException, IOException {
        super();
        application = app;
        favorites = null;
        loadProperties();
    }
public void assignFavorites(Favorites fav)
{
    favorites=fav;
}
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

    public void matchownedProperties(SellerPropertyListingsPage p) {
        SellerPropertyListingsPage pg;
        pg = p;
        
        Seller seller = (Seller) application.provideLoggedinAccount();
        
        System.out.println("seller is"+ seller.getusername());
        
        System.out.println("In match owner before getting ownedproperties");
        
        int size = seller.getOwnedproperties().size();
         System.out.println("Size is "+ size);
         
        ArrayList<String> ownedproperties = seller.getOwnedproperties();
        
        //for(int i = 0; i <seller.getOwnedproperties().size())
        System.out.println("Size is "+ size);
        
        System.out.println("after the owned properties");
        
        Iterator<Property> iter = getProperties();

        PropertyContainer matchedproperties = new PropertyContainer();

      
            while (iter.hasNext()) {
                Property prop = iter.next();
                  for (int i = 0; i < ownedproperties.size(); i++) {
                
                if (prop.getName().equals(ownedproperties.get(i))) {
                  
                    matchedproperties.addProperty(prop);
                       System.out.println("MY PROPERTY IS "+ prop.getName());
                 //   pg.UpdateView(matchedproperties);
                   // return matchedproperties;
                }
            }
        }
               pg.UpdateView(matchedproperties);
        //return matchedproperties;
    }

    public void addtoFav(String propertyname){
        Iterator<Property> iter = getProperties();
       
        while (iter.hasNext()) {
         //   System.out.println("this name is "+iter.next().getName()+"and parap="+propertyname);
      Property p=iter.next();
            if (p.getName().equals(propertyname)) {
                   

                favorites.add(p);

            }

        }
    }
}
