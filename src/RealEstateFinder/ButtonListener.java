package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ButtonListener implements ActionListener {

    Application application;
    LoginSignupPage loginsignuppage;
    SignUpPage signuppage;

    ButtonListener(Application app, LoginSignupPage loginsignup) {
        application = app;
        loginsignuppage = loginsignup;
        signuppage = null;
       
    }

    ButtonListener(Application app, SignUpPage signup) {
        application = app;
       this.signuppage = signup;
        loginsignuppage = null;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Login")) {

            application.authenticate(loginsignuppage.getusernameinput(), loginsignuppage.getpasswordinput());
        } else if (e.getActionCommand().equals("Sign Up")) {
          
            signuppage  = new SignUpPage(application,loginsignuppage);
           
        }
    }
}
