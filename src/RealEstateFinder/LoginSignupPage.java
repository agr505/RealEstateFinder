/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

/**
 * Lets the user login or create an account extends JFrame
 * @author Sam
 */
public class LoginSignupPage extends JFrame {

    JTextField tf1 = new JTextField(12);
    JTextField tf2 = new JTextField(12);

    JButton logButton = new JButton("Login");
    JButton signUp = new JButton("Sign Up");

    JLabel logLable = new JLabel("Log-In");
    JPanel panel = new JPanel();
    SignUpPage p;

    LoginSignupPage(Application app, SignUpPage signup) {

        p = signup;

        panel.add(tf1);
        panel.add(tf2);
        logButton.addActionListener(new LoginButtonListener(app, this));
        signUp.addActionListener(new SignUpLoginPageButtonListener(app, p));
        panel.add(logButton);
        panel.add(signUp);
        this.add(panel);
        this.setTitle("LogIn");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * accessor for  username
     * @return string holding the value of  username
     */
    public String getusernameinput() {
        return tf1.getText();
    }
    /**
     * accessor for Accounts password
     * @return string holding the value of accounts password
     */
    public String getpasswordinput() {
        return tf2.getText();
    }
/**
 * Routing method used to go to this page
 */
    public void routetopage() {
        this.setVisible(true);
    }
/**
 *  Routing method used to leave this page
 */
    public void leavepage() {
        this.setVisible(false);
    }
}
