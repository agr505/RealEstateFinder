/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import javax.swing.event.ChangeEvent;

/**
 *
 * @author Aaron
 */
public class InterestedCustomersStateEvent extends ChangeEvent{
   
      public String currentproperty;

    /**
     * Overrided constructor allowing for an object of type Favorites to be a
     * parameter
     *
     * @param source of type Favorites
     */
    public InterestedCustomersStateEvent(InterestedCustomers source,String property) {
       super(source);
        currentproperty=property;
          
    }

    @Override

    /**
     * Overrided method for obtaining the source of the event and casting the
     * object into a type InterrestedCustomers
     */
    public InterestedCustomers getSource() {
        return (InterestedCustomers) super.source;
    }
}
