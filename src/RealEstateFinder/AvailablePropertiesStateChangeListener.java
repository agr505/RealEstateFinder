/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Aaron
 */
public class AvailablePropertiesStateChangeListener implements ChangeListener{
    
      public PropertyDescriptionPage propertydescriptionpage;
    public PropertyDescriptionPageStrategyProvider strategyprovider;
     public String property;
    Application application;
    AvailablePropertiesStateChangeListener(PropertyDescriptionPage propertydespage,PropertyDescriptionPageStrategyProvider stratprovider,String prop,Application app)
    {
          propertydescriptionpage=propertydespage;
        property=prop;
        application=app;
       strategyprovider= stratprovider;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        AvailablePropertiesStateEvent event= (AvailablePropertiesStateEvent)e;
       propertydescriptionpage.Ptext.setText(event.text);
       System.out.println("HELLLLLOOOOO"+propertydescriptionpage.Ptext+" "+event.text);
          strategyprovider.createview();
    }
    
}
