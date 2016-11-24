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
public class InterestedCustomersStateChangeListener implements ChangeListener{
    PropertyDescriptionPage propertydescriptionpage;
    PropertyDescriptionPageStrategyProvider strategyprovider;
     public String property;
    
    InterestedCustomersStateChangeListener (PropertyDescriptionPage propertydespage,PropertyDescriptionPageStrategyProvider strategyprovider,String prop)
    {
        propertydescriptionpage=propertydespage;
        property=prop;
    }
    public void stateChanged(ChangeEvent e) {
        
          InterestedCustomersStateEvent event= (InterestedCustomersStateEvent)e;
     
 //save all accounts
       if(propertydescriptionpage!=null)
      {
        
           propertydescriptionpage.setVisible(false);
           
          strategyprovider.createview();
      }
    }
}

