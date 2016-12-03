/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.BoxLayout;

/**
     * Extends JFrame and shows the properties of the customer
     */
public class CustomerPropertiesPage extends JFrame {
private static final long serialVersionUID = 14L;
    Favorites favorites;
    AvailableProperties availableproperties;

    JPanel panel = new JPanel();
    //create Scroll pane passing it panel
JScrollPane Sb = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    JButton viewDescButton = new JButton("View Description");
    JLabel label = new JLabel();
    Application application;

    CustomerPropertiesPage(AvailableProperties avproperties, Application app, Favorites fav,InterestedCustomers interestedcustomers) {
        availableproperties = avproperties;
        application = app;
        favorites = fav;
       // CustomerNavigationBar bar = new CustomerNavigationBar(app);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
       
        Iterator<Property> iter = availableproperties.getProperties();
        
        while (iter.hasNext()) {
         //get all the input fields for the property
            Property property = iter.next();
            String x = property.getName();
            String y = property.getPicture();
            String z = property.getText();
            PropertyDescriptionPage  propertydescriptionpage = new PropertyDescriptionPage(x, y, z);
            //create a new property panel
            PropertyPanel p = new PropertyPanel(x, y, z, app, favorites, propertydescriptionpage, availableproperties, interestedcustomers);
            // add the new propertypanel to the panel
            panel.add(p);
        }
        //add the scrollpane
this.add(Sb);
        //this.add(bar, BorderLayout.NORTH);
      // this.add(panel);
        this.setTitle("Customer Property Page");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
public void addbar(CustomerNavigationBar bar)
{
    this.add(bar, BorderLayout.NORTH);
}
    public void routetopage() {
        this.setVisible(true);
    }

    public void leavepage() {
        this.setVisible(false);
    }

}

class PropertyPanel extends JPanel {

    JButton b;
    /**
     * creates a seller panel
     * @param x property 
     * @param y image location
     * @param z description
     */
    PropertyPanel(String x, String y, String z, Application app, Favorites fav, PropertyDescriptionPage propertydescriptionpage, AvailableProperties availableProps,InterestedCustomers interestedcustomers) {

        this.setLayout(new BorderLayout());

        b = new JButton("View Property Description");
        //JButton xx = new JButton("button");
        //create jlabel for picture
        JLabel jl = new JLabel();
        //call set icon on the jlabel passing it a image icon param with the param being the location of the image
        jl.setIcon(new ImageIcon(y));
        // Create jlabel for description of property
        JLabel description = new JLabel(z);
        JLabel n = new JLabel(x);
        //add and validate
        this.add(n, BorderLayout.NORTH);
        this.add(jl, BorderLayout.WEST);
        this.add(description, BorderLayout.CENTER);
        validate();

        this.add(b, BorderLayout.SOUTH);
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(250, 150));

        b.addActionListener(new ViewPropertyButtonListener(x, propertydescriptionpage, fav, app, availableProps, interestedcustomers));

    }
}
