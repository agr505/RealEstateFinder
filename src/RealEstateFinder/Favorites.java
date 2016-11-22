/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Aaron
 */
public class Favorites extends PropertyContainer {

     public ArrayList<FavoritesStateChangeListener> listeners;

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
        FavoritesStateEvent event = new FavoritesStateEvent(this,property.getName());
      
System.out.println(listeners.size());




listeners.get(0).stateChanged(event);

for (int i=1;i<listeners.size();i++)
{
    if(listeners.get(i).property.equals(property.getName()))
            {
                listeners.get(i).stateChanged(event);
            }
}

//listeners.get(1).stateChanged(event);

//listeners.get(2).stateChanged(event);

//listeners.get(3).stateChanged(event);
    //  for (ChangeListener listener : listeners) {
     //     listener.stateChanged(event);
     // }
    }

}
