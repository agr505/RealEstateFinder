/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Aaron
 */
public class ViewPropertyButtonListener implements ActionListener {

    public String propertyname;
    public Favorites favorites;
    public Application application;
    public PropertyDescriptionPage propertydescriptionpage;
  

    ViewPropertyButtonListener(String pname,PropertyDescriptionPage propertydescriptionp,Favorites fav,Application app) {
        this.propertyname = pname;
        propertydescriptionpage=propertydescriptionp;
        favorites=fav;
        application=app;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("View Property Description")) {

            System.out.println("You selected " + propertyname);
          

           if (application.provideLoggedinAccount() instanceof Customer){
       
                PropertyDescriptionPageStrategy customerstrategy = new PropertyDescriptionPageStrategy() {
                    @Override
                    public JPanel buildview(JPanel jpanel) {
                   

                        if (!favorites.containsproperty(propertyname)) {
                            
                            JButton fddtoFavorites = new JButton("Add to Favorites");
                            jpanel.add(fddtoFavorites);
                            
                            return jpanel;//attach addtofavorites button

                        } else if (favorites.containsproperty(propertyname)&&application.hascontactedcustomer(propertyname)==false) {
                            return null;//attach contactseller button
                        } else if (favorites.containsproperty(propertyname)&&application.hascontactedcustomer(propertyname)) {
                            return null;//no buttons on panel
                        }
                        return null;
                    }
                ;

            }  ;
                propertydescriptionpage.usestrategy(customerstrategy);
            }
            else if (application.provideLoggedinAccount() instanceof Seller) {
                PropertyDescriptionPageStrategy sellerstrategy = new PropertyDescriptionPageStrategy() {
                    @Override
                    public JPanel buildview(JPanel jpanel) {
                        //always attach update button
                        return null;
                    };
                    
            };
               propertydescriptionpage.usestrategy(sellerstrategy);         
        
    
;
                

}
            

    }
}
    
    
    
    
}
