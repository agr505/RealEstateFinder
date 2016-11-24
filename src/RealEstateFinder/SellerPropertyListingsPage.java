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
        
<<<<<<< HEAD
        this.setLayout(new FlowLayout());
        JLabel x = new JLabel("FF");
        JLabel xx = new JLabel("FfF");
        System.out.println("L");
        System.out.println("before In the sellerpage ");
        application = app;
        avprop = ap;
        avprop.matchownedProperties(this);
=======
>>>>>>> origin/master
        
        
<<<<<<< HEAD
        //this.add();
=======
       // for(int i = 0; i <sellerOwnedProperties.getOwnedproperties().size(); i++){
            System.out.println("In the sellerpage ");
       // }
        //FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 20, 10);
        
       // this.setLayout(new FlowLayout());
       this.add(x);
       this.add(xx);
>>>>>>> origin/master
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
    
    public void routetopage() {
        this.setVisible(true);
    }

    public void leavepage() {
        this.setVisible(false);
    }
}
