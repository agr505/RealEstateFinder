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
   
    
}
