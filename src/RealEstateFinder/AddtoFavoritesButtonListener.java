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
public class AddtoFavoritesButtonListener implements ActionListener {

    private String name;
 
  
    AvailableProperties availableproperties;
  

    AddtoFavoritesButtonListener(String name, AvailableProperties availableProps) {
        this.name = name;
      
        availableproperties = availableProps;
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   
            
            availableproperties.addtoFav(name);
           
       
}}
