package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ButtonListener implements ActionListener{
    
    ButtonListener (){
        
        LoginSignupPage lvc = new LoginSignupPage();
         name = lvc.getName();
         pass = lvc.getPass();
    }
    
    private String name;
    private String pass;
    @Override
     public void actionPerformed(ActionEvent e){
        System.out.println("gtrtrgtgessed");
        if(e.getActionCommand().equals("Login")){
            System.out.println("button pressed");
        }
}
}