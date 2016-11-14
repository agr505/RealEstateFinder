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
public class ViewPropertyButtonListener  implements ActionListener{

    public String propertyname;
   ViewPropertyButtonListener (String pname){
       this.propertyname=pname;
    }
  
   
   
    @Override
     public void actionPerformed(ActionEvent e){
       
        if(e.getActionCommand().equals("View Property Description")){
           
           System.out.println("You selected "+propertyname);
        }
        
}
}