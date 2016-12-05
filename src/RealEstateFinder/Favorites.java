/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Favorites extends PropertyContainer implements Serializable {

    private static final long serialVersionUID = 3L;

    AvailableProperties availableproperties;
    Application application;
    InterestedCustomers interestedcustomers;
    public ArrayList<FavoritesStateChangeListener> listeners;
    //public ArrayList <PropertyPanel> panellist;

    Favorites(AvailableProperties avproperties, Application app, InterestedCustomers interestedcust) {

        super();
        listeners = new ArrayList<FavoritesStateChangeListener>();
        avproperties.assignFavorites(this);
        availableproperties = avproperties;
        application = app;
        interestedcustomers = interestedcust;
        // panellist=null;

    }/*
  public void getpanels(ArrayList <PropertyPanel> arrlist)
  {
      panellist=arrlist;
  }*/
    public FavoritesPage initializeFavoritesPage() {
        FavoritesPage fp = new FavoritesPage(this, availableproperties, application, interestedcustomers);

        listeners.add(new FavoritesStateChangeListener(fp));
        return fp;

    }

    public void addListener(FavoritesStateChangeListener listener) {
        listeners.add(listener);

    }
    /**
     * 
     * @param propertyname
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
        System.out.println("SIZE=" + listeners.size());
        for (int i = 1; i < listeners.size(); i++) {

            if (listeners.get(i).property.equals(property.getName())) {
                listeners.get(i).stateChanged(event);
            }
        }

//listeners.get(1).stateChanged(event);
//listeners.get(2).stateChanged(event);
//listeners.get(3).stateChanged(event);
        //  for (ChangeListener listener : listeners) {
        //     listener.stateChanged(event);
        // }
    }

}
