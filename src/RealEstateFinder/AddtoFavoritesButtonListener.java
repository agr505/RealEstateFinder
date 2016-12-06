
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *Button Listener for handling click events to add a Property to Favorites
 * 
 */
public class AddtoFavoritesButtonListener implements ActionListener {

    private String name;
 
  
    AvailableProperties availableproperties;
  
/**
 * Constructor initializing the Property's name and AvailableProperties reference
 * @param name String holding Property's name
 * @param availableProps AvailableProperties reference
 */
    AddtoFavoritesButtonListener(String name, AvailableProperties availableProps) {
        this.name = name;
      
        availableproperties = availableProps;
      
    }
/**
 * Event handler for the user clicking the AddtoFavorites button
 * @param e ActionEvent containing information about the event
 */
    @Override
    public void actionPerformed(ActionEvent e) {
   
            
            availableproperties.addtoFav(name);
           
       
}}
