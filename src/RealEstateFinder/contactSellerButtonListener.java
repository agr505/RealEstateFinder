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
 * @author User
 */
public class contactSellerButtonListener implements ActionListener{
    
    private String name;
    Application app;
    
    contactSellerButtonListener(String name, Application apRef){
        this.name = name;
        app = apRef;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Contact Seller")){
            System.out.println(name);
            app.contactSeller(name);
        }
    }
}
