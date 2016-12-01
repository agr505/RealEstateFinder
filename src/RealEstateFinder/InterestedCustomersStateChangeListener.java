/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Aaron
 */

/**
 *  StateChangeListener for the Model InterestedCustomers
 *  
 */
public class InterestedCustomersStateChangeListener implements ChangeListener,Serializable{
      private static final long serialVersionUID = 30L;
    public PropertyDescriptionPage propertydescriptionpage;
    public PropertyDescriptionPageStrategyProvider strategyprovider;
     public String property;
    Application application;
    
    /**
     * Constructor which initializes the 
     * @param propertydespage
     * @param strategyprovider
     * @param prop
     * @param app 
     */
    InterestedCustomersStateChangeListener (PropertyDescriptionPage propertydespage,PropertyDescriptionPageStrategyProvider stratprovider,String prop,Application app)
    {
        propertydescriptionpage=propertydespage;
        property=prop;
        application=app;
       strategyprovider= stratprovider;
    }
    public void stateChanged(ChangeEvent e) {
        
          InterestedCustomersStateEvent event= (InterestedCustomersStateEvent)e;
     
        try {
            //save all accounts
            application.saveAccounts();
        } catch (IOException ex) {
            Logger.getLogger(InterestedCustomersStateChangeListener.class.getName()).log(Level.SEVERE, null, ex);
        }
       if(propertydescriptionpage!=null)
      {
        
           propertydescriptionpage.setVisible(false);
           System.out.println(strategyprovider.hashCode());
          strategyprovider.createview(event,  propertydescriptionpage);
      }
    }
}

