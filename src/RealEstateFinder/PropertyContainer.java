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
public class PropertyContainer {

    public PropertyContainer() {
        this.properties = new ArrayList<Property>();
    }
    private ArrayList<Property> properties;
    
    
    public Iterator<Property> getProperties()
    {
       return new
         Iterator<Property>()          {
             private int current = 0;
            public boolean hasNext()
            {
               return current < properties.size();
           }
             public Property next()
            {
                return properties.get(current++);
            }
  public Property returncurrent()
            {
                return properties.get(current);
            }
            public void remove()
             {
               throw new UnsupportedOperationException();
        }
 
            
         };
   }
    public void addProperty(Property property)
    {
        properties.add(property);
        
        
    }
}
