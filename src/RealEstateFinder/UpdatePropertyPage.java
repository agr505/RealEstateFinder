/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import javax.swing.JFrame;

/**
 *
 * @author Aaron
 */
public class UpdatePropertyPage extends JFrame {

    String updatedpropertyname;

    UpdatePropertyPage() {
        updatedpropertyname = null;
    }

    public void routetopage(String propertyname) {
        updatedpropertyname = propertyname;
        //call method to update the Property object *********8
        this.setVisible(true);
    }

    public void leavepage() {
        this.setVisible(false);
    }
}
