
package RealEstateFinder;

import javax.swing.event.ChangeEvent;

/**
 *
 * @author Aaron
 */
/**
 * Event for a InterestedCustomers state change
 * 
 */
public class InterestedCustomersStateEvent extends ChangeEvent{
   
      public String currentproperty;

    /**
     * Overrided constructor allowing for an object of type InterestedCustomers to be a
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
