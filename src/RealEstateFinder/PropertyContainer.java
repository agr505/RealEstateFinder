package RealEstateFinder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aaron
 */
/**
 * Super class of AvailableProperties and Favorites that provides implementation
 * for storing and retrieving Properties
 */
public class PropertyContainer implements Serializable {

    private static final long serialVersionUID = 12L;

    /**
     * Constructor that initializes the ArrayList<Property>
     */
    public PropertyContainer() {
        this.properties = new ArrayList<Property>();
    }
    private ArrayList<Property> properties;

    /**
     *
     * @return the new iterator for properties sets the current count to zero
     */
    public Iterator<Property> getProperties() {
        return new Iterator<Property>() {
            private int current = 0;

            /**
             *
             * @return checks the next available Property if the size is within
             * the bounds
             */
            public boolean hasNext() {
                return current < properties.size();
            }

            /**
             *
             * @return the next available Property and updates the current count
             */
            public Property next() {
                return properties.get(current++);
            }

            /**
             *
             * @return the Property at the current index
             */
            public Property returncurrent() {
                return properties.get(current);
            }

            /**
             * removes the Property at the current index
             */
            public void remove() {
                properties.remove(current);
            }

        };
    }

    /**
     * Takes property and adds to property arraylist
     *
     * @param property
     */
    public void addProperty(Property property) {
        properties.add(property);

    }
}
