/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
/**
 *Button Listener for handling click events to go to SignUpPage
 *
 */
public class SignUpLoginPageButtonListener implements ActionListener {

    Application application;
    LoginSignupPage loginsignuppage;
    SignUpPage signuppage;

/**
 *  Constructor for Button Listener for handling click events to go to SignUpPag
 * @param app reference to Application instance 
 * @param signup reference to SignUpPage instance
 */
    SignUpLoginPageButtonListener(Application app, SignUpPage signup) {
        application = app;
       this.signuppage = signup;
        loginsignuppage = null;

    }

    @Override
    /**
         * Event handler which will handle a button click to go to SignUpPage by 
     *calling the SignUpPage's constructor
     */
    public void actionPerformed(ActionEvent e) {

         signuppage  = new SignUpPage(application,loginsignuppage);
                             
       
    }
}
