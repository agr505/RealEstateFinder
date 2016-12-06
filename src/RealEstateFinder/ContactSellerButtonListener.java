package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
/**
 * Button Listener for handling click events to go to contact the Seller that
 * owns the Property
 *
 */
public class ContactSellerButtonListener implements ActionListener {

    private String name;

    Application application;

    /**
     * Constructor for Button Listener for handling click events to contact the
     * Seller that owns the Property
     *
     * @param app references the Application instance
     * @param name Property name
     */
    ContactSellerButtonListener(String name, Application app) {
        this.name = name;

        application = app;

    }

    @Override
    /**
     * Event handler which will handle a button click to call the Application's
     * contactSeller method
     */
    public void actionPerformed(ActionEvent e) {

        application.contactSeller(name);

    }
}
