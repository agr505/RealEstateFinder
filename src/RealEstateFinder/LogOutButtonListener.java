/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
public class LogOutButtonListener implements ActionListener {

 
 
  
 Application application;
  

LogOutButtonListener(Application app) {
       application= app;
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   
            
     try {
         System.out.println("Saved!!!!!!!!!!!!!!!!!!!!11");
         application.saveAccounts();
     } catch (IOException ex) {
         Logger.getLogger(LogOutButtonListener.class.getName()).log(Level.SEVERE, null, ex);
     }
           
       
}}
