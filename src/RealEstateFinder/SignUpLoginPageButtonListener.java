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
public class SignUpLoginPageButtonListener implements ActionListener {

    Application application;
    LoginSignupPage loginsignuppage;
    SignUpPage signuppage;


    SignUpLoginPageButtonListener(Application app, SignUpPage signup) {
        application = app;
       this.signuppage = signup;
        loginsignuppage = null;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

         signuppage  = new SignUpPage(application,loginsignuppage);
                             
       
    }
}
