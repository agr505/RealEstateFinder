/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import javax.swing.*;

/**
 *
 * @author User
 */
public class SellerPropertyListingsPage extends JFrame{
    
    
    
    SellerPropertyListingsPage(){
        
        
        
        //this.add();
        this.setTitle("Seller Property Page");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
       public void routetopage() {
        this.setVisible(true);
    }

    public void leavepage() {
        this.setVisible(false);
    }
}