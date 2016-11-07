package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ButtonListener implements ActionListener{
  Application application;
  LoginSignupPage loginsignuppage;
    ButtonListener (Application app,LoginSignupPage loginsignup){
        application=app;
       loginsignuppage=loginsignup;
    }
    
   
    @Override
     public void actionPerformed(ActionEvent e){
       
        if(e.getActionCommand().equals("Login")){
            
           application.authenticate(loginsignuppage.getName(), loginsignuppage.getPass());
        }
}
}