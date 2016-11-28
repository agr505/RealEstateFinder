/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

/**
 *
 * @author Aaron
 */
public class AvailablePropertiesStateChangeListener {
    
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
    
}
