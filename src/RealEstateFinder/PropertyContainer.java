/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aaron
 */
/**
 * Class containing functionality that AvailableProperties and Favorites will need to inherit, the functionality being the 
 * behavior to hold Properties and iterate through them
 * 
 */
public class PropertyContainer implements Serializable{
private static final long serialVersionUID = 12L;
/**
 * Constructor which initializes the ArrayList of Properties
 */
    public PropertyContainer() {
        this.properties = new ArrayList<Property>();
    }
    private ArrayList<Property> properties;
    
    /**
     * Returns an iterator to iterate through the Properties
     * @return  Iterator<Property> 
     */
    public Iterator<Property> getProperties()
    {
       return new
         Iterator<Property>()          {
             private int current = 0;
             /**
              * Returns true or false depending on if there is a next Property
              * @return boolean representing if there is a next Property
              */
            public boolean hasNext()
            {
               return current < properties.size();
           }
            /**
             * Gets the next Property in the list
             * @return the next Property in the list 
             */
             public Property next()
            {
                return properties.get(current++);
            }
             /**
              * Gets the current Property in the list
              * @return the current Property in the list
              */
  public Property returncurrent()
            {
                return properties.get(current);
            }
  /**
   * Removes the current Property in the list           
   */
            public void remove()
             {
               properties.remove(current);
        }
 
            
         };
   }
    /**
     * Adds a Property to the list
     * @param property the Property to be added to the list
     */
    public void addProperty(Property property)
    {
        properties.add(property);
        
        
    }
}
