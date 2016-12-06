
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
/**
 *Button Listener for handling click events to log out
 *
 */
public class LogOutButtonListener implements ActionListener {

 
 
  
 Application application;
  
/**
 * Constructor for Button Listener for handling click events to log out
 * @param app references the Application instance
 */
LogOutButtonListener(Application app) {
       application= app;
      
    }

    @Override
     /** Event handler which will handle a button click to log out
     *
     * 
     */
    public void actionPerformed(ActionEvent e) {
   
            
     try {
         System.out.println("Saved!");
         application.saveAccounts();
     } catch (IOException ex) {
         Logger.getLogger(LogOutButtonListener.class.getName()).log(Level.SEVERE, null, ex);
     }
           
       
}}
