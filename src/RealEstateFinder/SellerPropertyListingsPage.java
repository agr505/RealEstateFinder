/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Iterator;
import javax.swing.*;

/**
 *
 * @author User
 */
public class SellerPropertyListingsPage extends JFrame {

    Application application;
    AvailableProperties avprop;

    SellerPropertyListingsPage(Application app, AvailableProperties ap) {
        application = app;
        avprop = ap;

        SellerNavigationBar bar = new SellerNavigationBar(app);
        //this.setLayout(n);
        
     
        System.out.println("before In the sellerpage ");

        avprop.matchownedProperties(this);

        // for(int i = 0; i <sellerOwnedProperties.getOwnedproperties().size(); i++){
        System.out.println("In the sellerpage ");
        // }
        //FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 20, 10);

        // this.setLayout(new FlowLayout());
        
        this.add(bar, BorderLayout.NORTH);
        this.setTitle("Seller Property Page");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void UpdateView(PropertyContainer properties) {
        PropertyContainer pc = properties;

        Iterator<Property> iter = pc.getProperties();

        System.out.println("In the sellerpage updateview ");

        while (iter.hasNext()) {
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            Property p = iter.next();

            String name = p.getName();
            String pic = p.getPicture();
            String text = p.getText();

            JLabel name1 = new JLabel(name);
            panel.add(name1, BorderLayout.NORTH);

            JLabel name2 = new JLabel(text);
            panel.add(name2);

            panel.setBackground(Color.red);
            panel.setPreferredSize(new Dimension(100, 100));
            validate();
            this.add(panel);
            
            
        JButton b = new JButton("View Property Description");
      

        this.add(b, BorderLayout.SOUTH);
 
PropertyDescriptionPage propertydescriptionpage=new PropertyDescriptionPage(p.getName(), p.getPicture(), p.getText());
        b.addActionListener(new ViewPropertyButtonListener(p.getName(), propertydescriptionpage,application,avprop));
        }
        System.out.println("While loop ended");

    }

    public void leavepage() {
        this.setVisible(false);
    }

    public void routetopage() {
        this.setVisible(true);

    }
}
