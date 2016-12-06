
package RealEstateFinder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Aaron
 */
/**
 * Model for holding Properties that the Customer has favorited and methods to add a Property and
 * see if a Property is in its PropertyContainer
 * 
 */
public class Favorites extends PropertyContainer implements Serializable {

    private static final long serialVersionUID = 3L;

    AvailableProperties availableproperties;
    Application application;
    InterestedCustomers interestedcustomers;
    public ArrayList<FavoritesStateChangeListener> listeners;

/**
 * Constructor that initializes the super class PropertyContainer along with other needed references
 * @param avproperties reference to AvailableProperties instance
 * @param app reference to Application instance
 * @param interestedcust reference to InterestedCustomers instance
 */
    Favorites(AvailableProperties avproperties, Application app, InterestedCustomers interestedcust) {

        super();
        listeners = new ArrayList<FavoritesStateChangeListener>();
        avproperties.assignFavorites(this);
        availableproperties = avproperties;
        application = app;
        interestedcustomers = interestedcust;
     

    }
/**
 * Initializes the FavoritesPage and adds a FavoritesStateChangeListener to its ArrayList<FavoritesStateChangeListener> field
 * @return 
 */
    public FavoritesPage initializeFavoritesPage() {
        FavoritesPage fp = new FavoritesPage(this, availableproperties, application, interestedcustomers);

        listeners.add(new FavoritesStateChangeListener(fp));
        return fp;

    }
/**
 * Adds a View listener to the ArrayList<FavoritesStateChangeListener> that will listen to Model state change event 
 * @param listener 
 */
    public void addListener(FavoritesStateChangeListener listener) {
        listeners.add(listener);

    }
    /**
     * 
     * @param propertyname holds value of the Property's name
     * @return true if the selected property matches the available property
     */
    public boolean containsproperty(String propertyname) {
        Iterator<Property> iter = getProperties();
        while (iter.hasNext()) {
            if (iter.next().getName().equals(propertyname)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method that will invoke the superclass PropertyContainer's
     * addProperty(property) method and then throw a FavoritesStateEvent
     *
     * @param property Property to be added
     */
    public void add(Property property) {

        addProperty(property);
        FavoritesStateEvent event = new FavoritesStateEvent(this, property.getName());

        listeners.get(0).stateChanged(event);
       
        for (int i = 1; i < listeners.size(); i++) {

            if (listeners.get(i).property.equals(property.getName())) {
                listeners.get(i).stateChanged(event);
            }
        }


    }

}
