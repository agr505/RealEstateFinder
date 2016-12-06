package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Aaron
 */
/**
 * Button Listener for handling click events to update a Property
 *
 */
public class UpdateButtonListener implements ActionListener {

    AvailableProperties availableproperties;
    JTextField textfield;
    String propertyname;

    /**
     * Button Listener for handling click events to update a property
     *
     * @param availableprops reference to AvailableProperties
     * @param tf textfield the holds the data to update the Property with
     * @param property Property name to be updated
     */
    UpdateButtonListener(AvailableProperties availableprops, JTextField tf, String property) {
        availableproperties = availableprops;
        textfield = tf;
        propertyname = property;
    }

    @Override
    /**
     * event handler which will handle events to update the Seller's Property
     */
    public void actionPerformed(ActionEvent e) {
        availableproperties.updateProperty(textfield.getText(), propertyname);
    }

}
