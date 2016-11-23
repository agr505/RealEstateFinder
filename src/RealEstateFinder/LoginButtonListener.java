package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class LoginButtonListener implements ActionListener {

    Application application;
    LoginSignupPage loginsignuppage;
  
    LoginButtonListener(Application app, LoginSignupPage loginsignup) {
        application = app;
        loginsignuppage = loginsignup;
      
       
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {

            application.authenticate(loginsignuppage.getusernameinput(), loginsignuppage.getpasswordinput());
                             
       
    }
}
