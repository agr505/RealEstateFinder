package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */

/**
 *Button Listener for handling click events to log in
 *
 */
public class LoginButtonListener implements ActionListener {

    Application application;
    LoginSignupPage loginsignuppage;
  
 /**
  * Constructor for Button Listener for handling click events to log in
  * @param app references the Application instance
  * @param loginsignup references the LoginSignupPage instance
  */
    LoginButtonListener(Application app, LoginSignupPage loginsignup) {
        application = app;
        loginsignuppage = loginsignup;
      
       
    }

   

    @Override
    /** Event handler which will handle a button click to log in by calling Application's authenticate method
     *
     * 
     */
    public void actionPerformed(ActionEvent e) {

            application.authenticate(loginsignuppage.getusernameinput(), loginsignuppage.getpasswordinput());
                             
       
    }
}
