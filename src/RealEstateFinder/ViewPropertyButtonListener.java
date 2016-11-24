/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
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
    public AvailableProperties availableProperties;
    public PropertyDescriptionPageStrategyProvider strategyprovider;
    

    ViewPropertyButtonListener(String pname, PropertyDescriptionPage propertydescriptionp, Favorites fav, Application app, AvailableProperties availableprops, InterestedCustomers interestedcustomers) {
        this.propertyname = pname;
        propertydescriptionpage = propertydescriptionp;
        favorites = fav;
        application = app;
        availableProperties = availableprops;
        strategyprovider=new  PropertyDescriptionPageStrategyProvider(propertyname,propertydescriptionpage,favorites ,application, availableProperties);
        System.out.println("in view button listener"+propertydescriptionpage.hashCode());
        favorites.addListener(new FavoritesStateChangeListener(propertydescriptionpage,strategyprovider,propertyname));
       interestedcustomers.addListener(new InterestedCustomersStateChangeListener(propertydescriptionpage,strategyprovider,propertyname));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("View Property Description")) {
strategyprovider.createview();
         
    }
    }
}
