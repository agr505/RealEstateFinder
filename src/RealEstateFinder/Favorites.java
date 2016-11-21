/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.util.Iterator;

/**
 *
 * @author Aaron
 */
public class Favorites extends PropertyContainer{

    Favorites()
    {
        super();
    }
    
   public boolean containsproperty(String propertyname)
   {
       Iterator<Property> iter = getProperties();
         while (iter.hasNext()) {
                if (iter.next().getName().equals(propertyname)) {
                   return true;
                }
                
            }
         return false;
   }
   public void add(Property property)
   {
       addProperty(property);
       FavoritesStateEvent event = new FavoritesStateEvent(this);
      // FavoritesStateChangeListener listener = schangelistener();
         // FavoritesStateChangeListener listener = schangelistener2();//these should reference the two views to be notified
          //which include the FavoritesPage, but before notifying the PropertyDescriptionPage view the ViewPropertyListener
          //needs to be notified of the event change so it can then change the PropertyDescriptionPage view as not needed
          
          
       // listener.stateChanged(event);
   }
    
}
