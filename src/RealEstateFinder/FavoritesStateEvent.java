
package RealEstateFinder;

import javax.swing.event.ChangeEvent;

/**
 *
 * @author Aaron
 */
public class FavoritesStateEvent extends ChangeEvent{
      Favorites favorites;
      public String currentproperty;

    /**
     * Overrided constructor allowing for an object of type Favorites to be a
     * parameter
     *
     * @param source of type Favorites
     */
    public FavoritesStateEvent(Favorites source,String property) {
        super(source);
        currentproperty=property;
    }

    @Override

    /**
     * Overrided method for obtaining the source of the event and casting the
     * object into a type Favorites
     */
    public Favorites getSource() {
        return (Favorites) super.source;
    }
}
