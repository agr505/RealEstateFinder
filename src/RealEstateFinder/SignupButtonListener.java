package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
/**
 * Button Listener for handling click events to sign up
 *
 */
public class SignupButtonListener implements ActionListener {

    Application application;
    SignUpPage p;
    LoginSignupPage log;

    /**
     * Button Listener for handling click events to sign up
     *
     * @param app reference to Application instance
     * @param page reference to SignUpPage instance
     * @param lp reference to LoginSignupPage instance
     */
    SignupButtonListener(Application app, SignUpPage page, LoginSignupPage lp) {
        application = app;
        p = page;
        log = lp;
    }

    @Override
    /**
     * event handler which will handle events to sign up
     */
    public void actionPerformed(ActionEvent e) {
        try {

            application.createaccount(p.getCheck(), p.getusernameinput(), p.getpasswordinput(), p.getProperties(), p.getPhone());
            p.setToVisible();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignupButtonListener.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Not working");
        }
    }
}
