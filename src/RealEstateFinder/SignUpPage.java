/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.Checkbox;
import javax.swing.BoxLayout;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sam
 */
public class SignUpPage extends JFrame{
    JLabel title = new JLabel("Sign Up:");
    JLabel un = new JLabel("Enter Username:");
    JLabel pw = new JLabel("Enter Password:");
    JLabel phoneNum = new JLabel("Enter Phone Number:");
    
    JTextField username = new JTextField(12);
    JTextField password = new JTextField(12);
    JTextField phoneNumber = new JTextField(12);
    Checkbox check = new Checkbox("Check if you are a seller");
    JButton signUp = new JButton("Sign Up");
    JPanel panel = new JPanel();
    
    
        SignUpPage(Application app){
        panel.add(title);
        panel.add(un);
        panel.add(username);
        panel.add(pw);
        panel.add(password);
        panel.add(phoneNum);
        panel.add(phoneNumber);
        panel.add(check);
        signUp.addActionListener(new ButtonListener(app,this));
        panel.add(signUp);
        this.add(panel);
        this.setName("Frame");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public String getusernameinput(){
        return username.getText();
    }
    
    public String getpasswordinput(){
        return password.getText();
    }
    
}
