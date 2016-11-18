/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Aaron
 */
public class ViewPropertyButtonListener implements ActionListener {

    public String propertyname;
    public Favorites favorites;
    public Application app;

    ViewPropertyButtonListener(String pname) {
        this.propertyname = pname;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("View Property Description")) {

            System.out.println("You selected " + propertyname);

            if (app.provideLoggedinAccount() instanceof Customer) {
                PropertyDescriptionPageStrategy customerstrategy = new PropertyDescriptionPageStrategy() {
                    @Override
                    public JPanel buildview(JPanel jpanel) {

                        if (!favorites.containsproperty(propertyname)) {
                            return null;//attach addtofavorites button

                        } else if (favorites.containsproperty(propertyname)&&app.hascontactedcustomer(propertyname)==false) {
                            return null;//attach contactseller button
                        } else if (favorites.containsproperty(propertyname)&&app.hascontactedcustomer(propertyname)) {
                            return null;//no buttons on panel
                        }
                        return null;
                    }
                ;

            }  ;
            }
            else if (app.provideLoggedinAccount() instanceof Seller) {
                PropertyDescriptionPageStrategy sellerstrategy = new PropertyDescriptionPageStrategy() {
                    @Override
                    public JPanel buildview(JPanel jpanel) {
                        //always attach update button
                        return null;
                    }
                ;
            }
        
    
;

}
            

    }
}
    
}
