package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ButtonListener implements ActionListener{
  
    ButtonListener (){
        
       
    }
    
   
    @Override
     public void actionPerformed(ActionEvent e){
        System.out.println("gtrtrgtgessed");
        if(e.getActionCommand().equals("Login")){
            System.out.println("button pressed");
        }
}
}