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
public class PropertyDescriptionPageListener implements ActionListener {

    private String name;
    private Application app;
    private String propertyname;
    AvailableProperties availableproperties;
    UpdatePropertyPage updatepropertyppage;

    PropertyDescriptionPageListener(String name, Application apRef, AvailableProperties availableProps) {
        this.name = name;
        app = apRef;
        availableproperties = availableProps;
        //need to initialize the availabe properties reference
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Contact Seller")) {
            System.out.println(name);
            app.contactSeller(name);
        } else if (e.getActionCommand().equals("Add to Favorites")) {
            System.out.println(name);
            availableproperties.addtoFav((propertyname));
            System.out.println(name + " is being added to favorites");
        } else if (e.getActionCommand().equals("Update Property")) {
            updatepropertyppage.routetopage((propertyname));
        }
    }
}
