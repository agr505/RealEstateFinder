package RealEstateFinder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aaron
 */
/**
 * Model for holding Customers that are interested in the Seller's Properties
 * and has methods to add a new Customer and see if a Customer is held in its
 * ArrayList<Customer> field
 *
 */
public class InterestedCustomers implements Serializable {

    private ArrayList<Customer> customers;
    public ArrayList<InterestedCustomersStateChangeListener> listeners;
    private static final long serialVersionUID = 4L;

    public InterestedCustomers() {
        this.customers = new ArrayList<Customer>();
        listeners = new ArrayList<InterestedCustomersStateChangeListener>();
    }

    /**
     * Returns an Iterator to iterated through the Customers in the
     * ArrayList<Customer> field
     *
     * @return
     */
    public Iterator<Customer> getCustomers() {
        return new Iterator<Customer>() {
            /**
             *
             * @return checks the next available Customer if the size is within
             * the bounds
             */
            public boolean hasNext() {
                return current < customers.size();
            }

            /**
             *
             * @return the next available Customer and updates the current count
             */
            public Customer next() {
                return customers.get(current++);
            }

            /**
             * Unsupported operation if Customer is attemped to be removed from
             * list
             */
            public void remove() {
                throw new UnsupportedOperationException();
            }

            private int current = 0;
        };
    }

    /**
     * Adds a Customer to the ArrayList<Customer> field and creates a
     * InterestedCustomersStateEvent because of the change in the Model
     *
     * @param customer Customer that is logged in
     */
    public void addCustomer(Customer customer) {
        System.out.println(customer.getusername() + "has contacted seller");
        customer.numofpropertiesinterestedin++;
        customers.add(customer.clone());

        InterestedCustomersStateEvent event = new InterestedCustomersStateEvent(this, customer.returnlatestpropertyinterestedin());

        for (int i = 0; i < listeners.size(); i++) {
            if (listeners.get(i).property.equals(customer.returnlatestpropertyinterestedin())) {
                listeners.get(i).stateChanged(event);
            }
        }

    }

    /**
     * Iterates through the ArrayList<Customer> to see if the Customer have
     * already contacted the owner of the Property an if so have the Customer
     * contacted about this specific Property
     *
     * @param customer the Customer that is logged in
     * @return boolean representing if the Customer has contacted the Seller or
     * not
     */
    public boolean containsCustomer(Customer customer) {
        Customer c;
        int i = 0;
        Iterator<Customer> iter = getCustomers();
        while (iter.hasNext() && i < customer.numofpropertiesinterestedin) {
            c = iter.next();
            if (c.getusername().equals(customer.getusername())) {

                if (customer.returnlatestpropertyinterestedin().equals(c.returnlatestpropertyinterestedin())) {
                    return true;
                } else {
                    i++;
                }

            }

        }
        return false;
    }

    /**
     * Gets the size of the ArrayList<Customer>
     *
     * @return int holding the value of the size of ArrayList<Customer>
     */
    public int sizeget() {
        return customers.size();
    }

    /**
     * Adds a View listener to the
     * ArrayList<InterestedCustomersStateChangeListener> that will listen to
     * Model state change event
     *
     * @param listener
     */
    public void addListener(InterestedCustomersStateChangeListener listener) {
        listeners.add(listener);
        System.out.println("THE SIZE IS " + listeners.size());
    }

    /**
     * Accessor for getting the ArrayList<Customer> field
     *
     * @return ArrayList<Customer> containing all the Customers that have tried
     * to contact the Seller that owns the Property
     */
    public ArrayList<Customer> getInterestedCustomers() {
        return customers;

    }
}
