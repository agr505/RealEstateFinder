
package RealEstateFinder;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Aaron
 */
/**
 *  StateChangeListener for the Model AvailableProperties
 *  
 */
public class AvailablePropertiesStateChangeListener implements ChangeListener{
    
      public PropertyDescriptionPage propertydescriptionpage;
    public PropertyDescriptionPageStrategyProvider strategyprovider;
     public String property;
    Application application;
   /**
       * Constructor which initializes the reference to the PropertyDescriptionPage and Property name fields, the reference to the PropertyDescriptionPageStrategyProvider instance,  
     *the reference to the Application instance, the PropertyDescriptionPage associated with the relevant Property
     * @param propertydespage PropertyDescriptionPage associated with the relevant Property
     * @param strategyprovider the reference to the PropertyDescriptionPageStrategyProvider instance
     * @param prop Property name
     * @param app reference to the Application instance
     */
    AvailablePropertiesStateChangeListener(PropertyDescriptionPage propertydespage,PropertyDescriptionPageStrategyProvider stratprovider,String prop,Application app)
    {
          propertydescriptionpage=propertydespage;
        property=prop;
        application=app;
       strategyprovider= stratprovider;
    }

    @Override
     /**
 * Method to be called upon a AvailableProperties state change
 * @param e ChangeEvent that hold information about the event 
 */
    public void stateChanged(ChangeEvent e) {
        AvailablePropertiesStateEvent event= (AvailablePropertiesStateEvent)e;
       propertydescriptionpage.Ptext.setText(event.text);
   
          strategyprovider.createview();
    }
    
}
