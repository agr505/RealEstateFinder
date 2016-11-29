/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Aaron
 */
public class UpdateButtonListener implements ActionListener {
    AvailableProperties availableproperties;
    JTextField textfield;
    String propertyname;
    UpdateButtonListener(AvailableProperties availableprops,JTextField tf,String property)
    {
      availableproperties=availableprops;
      textfield=tf;
      propertyname=property;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
  System.out.println("HELLOOOOOOOOOOTHIS");
           availableproperties.updateProperty( textfield.getText(), propertyname);
    }
    
}
