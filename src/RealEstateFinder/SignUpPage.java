/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

//import java.awt.Checkbox;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

/**
 *
 * @author Sam
 */
public class SignUpPage extends JFrame{
    Application app;
    LoginSignupPage page;
    
    JLabel title = new JLabel("Sign Up:");
    JLabel un = new JLabel("Enter Username:");
    JLabel pw = new JLabel("Enter Password:");
    JLabel phoneNum = new JLabel("Enter Phone Number:");
    JLabel propertyNames = new JLabel("Enter all the owned Properties(Sellers only)");
    
    JTextField username = new JTextField(12);
    JTextField password = new JTextField(12);
    JTextField phoneNumber = new JTextField(12);
    JTextField tf3 = new JTextField(20);
    JCheckBox check = new JCheckBox("Check if you are a seller");
    JButton signUp = new JButton("Sign Up");
    JPanel panel = new JPanel();
    
    
        SignUpPage(Application app, LoginSignupPage p){
           this.app = app;
           page = p;
           
        panel.add(title);
        panel.add(un);
        panel.add(username);
        panel.add(pw);
        panel.add(password);
        panel.add(phoneNum);
        panel.add(phoneNumber);
         panel.add(propertyNames);
        panel.add(tf3);
        panel.add(check);
       
        
        signUp.addActionListener(new SignupButtonListener(app,this, page));
        panel.add(signUp);
        this.add(panel);

        this.setTitle("SignUp");
        //this.pack();
        this.setSize(250,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public String getusernameinput(){
        return username.getText();
    }
    
    public String getpasswordinput(){
        return password.getText();
    }
    
    public String getPhone(){
        return phoneNumber.getText();
    }
    
    public String getProperties(){
        return tf3.getText();
    }
    public Boolean getCheck(){
        
        if (check.isSelected()){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void setToVisible(){
        this.setVisible(false);
    }
}
