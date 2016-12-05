/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Button Listener for handling click events to sign up 
 *
 */
public class SignupButtonListener implements ActionListener {
    Application application;
    SignUpPage p;
    LoginSignupPage log;
    /**
     *  Constructor for Button Listener for handling click events to  sign up 
     * @param app reference to Application instance
     * @param page reference to the SignUpPage instance
     * @param lp reference to LoginSignupPage instance
     */
    SignupButtonListener(Application app, SignUpPage page, LoginSignupPage lp){
        application = app;
        p = page;
        log = lp;
    }

    @Override/**
     * Event handler which will handle a button click after entering the information to create 
     * an Account
     * 
     */
    public void actionPerformed(ActionEvent e) {
        try {
            //createaccount(boolean isseller, String username, String password, String propertyInput)
            application.createaccount(p.getCheck(), p.getusernameinput(),p.getpasswordinput(), p.getProperties(),p.getPhone());
            p.setToVisible();
            // log.routetopage();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignupButtonListener.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Not working");
        }
    }
}
