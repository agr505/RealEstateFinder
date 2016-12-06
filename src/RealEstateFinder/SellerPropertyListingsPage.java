
package RealEstateFinder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Iterator;
import javax.swing.*;

/**
 * Shows the seller property listings and extends JFrame
 * @author User
 */
public class SellerPropertyListingsPage extends JFrame {

    Application application;
    AvailableProperties avprop;

    /**
     * 
     * @param app is the reference to Application
     * @param ap  is the reference to Available Properties
     * calls the matchownedproperties and gets the properties that the seller owns
     */
    SellerPropertyListingsPage(Application app, AvailableProperties ap) {
        application = app;
        avprop = ap;

        avprop.matchownedProperties(this);
 
        this.setTitle("Seller Property Page");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * 
     * @param bar is the seller navigation bar that is attached to this page
     */
public void addbar(SellerNavigationBar bar)
{
    this.add(bar, BorderLayout.NORTH);
}

    /**
     * 
     * @param properties that are owned by the seller are passed in
     * creates the property iterator
     * iterates through properties and gets the name,image and property information
     * adds the property to the panel one by one
     * adds the button and the bar
     */
    public void UpdateView(PropertyContainer properties) {
        PropertyContainer pc = properties;

        Iterator<Property> iter = pc.getProperties();

        System.out.println("In the sellerpage updateview ");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        while (iter.hasNext()) {
            
            Property p = iter.next();
            String name = p.getName();
            String pic = p.getPicture();
            String text = p.getText();

            JLabel name1 = new JLabel(name);
            panel.add(name1, BorderLayout.NORTH);

            JLabel pic2 = new JLabel();
            pic2.setIcon(new ImageIcon(pic));
            panel.add(pic2,BorderLayout.CENTER );
            
            JLabel name2 = new JLabel(text);
            panel.add(name2, BorderLayout.SOUTH);
   
            validate();
  
            JButton b = new JButton("View Property Description");
            panel.add(b, BorderLayout.SOUTH);

            PropertyDescriptionPage propertydescriptionpage = new PropertyDescriptionPage(p.getName(), p.getPicture(), p.getText());
            b.addActionListener(new ViewPropertyButtonListener(p.getName(), propertydescriptionpage, application, avprop));
        }
        this.add(panel);
        System.out.println("While loop ended");

    }
/**
 * Routing method used to leave this page
 */
    public void leavepage() {
        this.setVisible(false);
    }
/**
 * Routing method used to go to this page
 */
    public void routetopage() {
        this.setVisible(true);

    }
}
