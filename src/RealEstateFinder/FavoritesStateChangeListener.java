
package RealEstateFinder;

import java.io.Serializable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Aaron
 */
/**
 * StateChangeListener for the Model Favorites
 * 
 */
public class FavoritesStateChangeListener implements ChangeListener, Serializable{
    //assign property corresponding to property description page property
    private static final long serialVersionUID = 14L;
    public String property;
    public FavoritesPage favoritespage;
    PropertyDescriptionPage propertydescriptionpage;
    PropertyDescriptionPageStrategyProvider strategyprovider;
    
    /**
     * Constructor which initializes the reference to the FavoritesPage instance and sets the PropertyDescriptionPage
     * and Property name fields to null since this listener is only for updating the FavoritesPage
     * @param favpage reference to FavoritesPage instance
     */
    FavoritesStateChangeListener(FavoritesPage favpage)
    {
    
        favoritespage=favpage;
        propertydescriptionpage=null;
        property=null;
        
    }
    /**
     * Constructor which initializes the reference to the PropertyDescriptionPage
     * and Property name fields and sets the FavoritesPage instance to null since this listener is only for updating
     * the PropertyDescriptionPage associated with the  relevant Property
     * 
     * @param propertydespage reference to PropertyDescriptionPage instance
     * @param strategyprov reference to PropertyDescriptionPageStrategyProvider instance
     * @param prop reference to Property name 
     */
    FavoritesStateChangeListener(PropertyDescriptionPage propertydespage,PropertyDescriptionPageStrategyProvider strategyprov,String prop)
    {
     
        propertydescriptionpage=propertydespage;
       strategyprovider=strategyprov;
         favoritespage=null;
         property=prop;
         
         
    }

/**
 * Method to be called upon a Favorites state change
 * @param e ChangeEvent that hold information about the event 
 */
    @Override
    public void stateChanged(ChangeEvent e) {
        
          FavoritesStateEvent event= (FavoritesStateEvent)e;
         Favorites favorites =         event.getSource();
       
      if(favoritespage!=null)
      {
          
          favoritespage.createview(favorites);
      }
      else if(propertydescriptionpage!=null)
      {
        
           propertydescriptionpage.setVisible(false);
           
          strategyprovider.createview(favorites,event,propertydescriptionpage);
      }
    }
}
