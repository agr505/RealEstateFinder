package RealEstateFinder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;
import javax.swing.border.Border;

/**
 * Shows the interested customers and extends JFrame
 *
 * @author User
 */
public class InterestedCustomersPage extends JFrame {

    private InterestedCustomers interestedcustomers;
    private ArrayList<Customer> interestedCustomersList;
    JPanel panel = new JPanel();
    //create jscroll pane
    JScrollPane Sb = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    /**
     * Constructor iterating through all of the InterestedCustomers adding their
     * information to SellerPanels
     *
     * @param ic is an instance of InterestedCustomers applicable to logged in
     * Seller
     * @param app is an instance of Application
     * @param slp is an instance of SellerListingPage
     */
    InterestedCustomersPage(InterestedCustomers ic, Application app, SellerPropertyListingsPage slp) {

        SellerNavigationBar bar = new SellerNavigationBar(app, this, slp);
        interestedcustomers = ic;
        interestedCustomersList = interestedcustomers.getInterestedCustomers();
        Iterator iter = interestedCustomersList.iterator();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        JLabel title = new JLabel("These customers are interested in your properties:");
        panel.add(title);
        //create a border object
        Border blackline;
        // set border object to make a black line around inputs
        blackline = BorderFactory.createLineBorder(Color.black);

        if (interestedcustomers.getInterestedCustomers() != null) {
            System.out.println("getting the interested customers");

            while (iter.hasNext()) {

                Customer c = (Customer) iter.next();
                String x = c.getusername();
                System.out.println("tttttttttttttttttttttttt" + x);
                String y = c.returnphonenumber();
                String z = c.returnlatestpropertyinterestedin();
                CustomerPanel p = new CustomerPanel(x, y, z);
                // give the panel a border passing the param blackline giving a black border around it
                p.setBorder(blackline);
                panel.add(p);

            }

            //add the scroll bar
            this.add(Sb);
            this.add(bar, BorderLayout.NORTH);
            this.setTitle("Interested Customers Page");
            this.pack();
            this.setSize(500, 400);
            this.setVisible(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }

    /**
     * Routing method used to go to this page
     */
    public void routetopage() {
        this.setVisible(true);
    }

    /**
     * Routing method used to leave this page
     */
    public void leavepage() {
        this.setVisible(false);
    }
}

/**
 * Class for displaying a Customer's information
 *
 */
class CustomerPanel extends JPanel {

    /**
     * Constructor adding Customer's information to JLabels and adding them to
     * itself
     *
     * @param x username
     * @param y phone number
     * @param z property
     */
    CustomerPanel(String x, String y, String z) {

        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        JLabel latestProp = new JLabel("Property: " + z);
        JLabel userName = new JLabel("Username: " + x);
        JLabel phoneNum = new JLabel("Phone Number: " + y);

        this.add(userName);
        this.add(phoneNum);
        this.add(latestProp);

        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(250, 150));

    }
}
