/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aaron
 */
public class Favorites extends PropertyContainer {

     private ArrayList<FavoritesStateChangeListener> listeners;

    Favorites(AvailableProperties avproperties, Application app) {

        super();
      listeners=new  ArrayList<FavoritesStateChangeListener>();
          avproperties.assignFavorites(this);
         FavoritesPage fp = new FavoritesPage(this, avproperties,app);
       
          listeners.add(new FavoritesStateChangeListener(fp)); 
           
           
        
  
    }

    public void addListener( FavoritesStateChangeListener listener)
    {
        listeners.add(listener);
    }
    public boolean containsproperty(String propertyname) {
        Iterator<Property> iter = getProperties();
        while (iter.hasNext()) {
            if (iter.next().getName().equals(propertyname)) {
                return true;
            }

        }
        return false;
    }

    public void add(Property property) {
         System.out.println("In favorites add function, property will be added ==="+property.getName());
        addProperty(property);
        FavoritesStateEvent event = new FavoritesStateEvent(this);

        for (FavoritesStateChangeListener listener : listeners) {
            listener.stateChanged(event);
        }
    }

}
