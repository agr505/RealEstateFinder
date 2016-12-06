
package RealEstateFinder;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
/**
 * Subclass of Account for a Customer
 * 
 */
public class Customer extends Account implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    private String latestpropertyinterestedin;
    private Favorites favorites;
    public int numofpropertiesinterestedin;
    private String phonenumber;
/**
 * Constructor initializing all of its fiels
 * @param username String holding value of username
 * @param password String holding value of password
 * @param fav reference to Favorites instance
 * @param phonenum String holding value of phone number
 * @throws ClassNotFoundException 
 */
    Customer(String username, String password, Favorites fav, String phonenum) throws ClassNotFoundException {
        super(username, password);
        favorites = fav;
        latestpropertyinterestedin = null;
        System.out.println("Customer account created");
        phonenumber = phonenum;
        numofpropertiesinterestedin = 0;

    }
    /**
     * Accessor to for favorites
     * @return the favorites arraylist
     */
    public Favorites getFavorites() {
        return favorites;
    }
    /**
     * Accessor to return the latestpropertyinterestedin
     * @return latest property customer selected and clicked contact seller
     */
    public String returnlatestpropertyinterestedin() {
        return latestpropertyinterestedin;
    }
    /**
     * Update the latest property interested in
     * @param latestproperty is set to the latest property customer clicked contact seller
     */
    public void updatepropertyinterestedin(String latestproperty) {
        latestpropertyinterestedin = latestproperty;
    }
    /**
     * Accessor for Customer's phone number
     * @return the phone number of the customer 
     */
    public String returnphonenumber() {
        return phonenumber;
    }
    /**
     * clone function for Customer
     * @return a copy of the customer who clicked contact seller and adds to interested--
     * --customers list in the sellers account
     */
    public Customer clone() {
        String latestproperty = new String(this.latestpropertyinterestedin);
        try {
            Customer c = new Customer(super.getpassword(), super.getpassword(), this.favorites, this.phonenumber);
            c.latestpropertyinterestedin = latestproperty;
            c.numofpropertiesinterestedin = this.numofpropertiesinterestedin;
            return c;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
}
