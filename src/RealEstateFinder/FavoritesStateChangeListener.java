/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

/**
 *
 * @author Aaron
 */
public class FavoritesStateChangeListener  {
    FavoritesPage favoritespage;
    PropertyDescriptionPage propertydescriptionpage;
    PropertyDescriptionPageStrategyProvider strategyprovider;
    FavoritesStateChangeListener(FavoritesPage favpage)
    {
        favoritespage=favpage;
        propertydescriptionpage=null;
    }
    FavoritesStateChangeListener(PropertyDescriptionPage propertydespage,PropertyDescriptionPageStrategyProvider strategyprov)
    {
        propertydescriptionpage=propertydespage;
       strategyprovider=strategyprov;
         favoritespage=null;
    }
     void stateChanged(FavoritesStateEvent event) {
        Favorites favorites = event.getSource();
      if(favoritespage!=null)
      {
          System.out.println("!!!!!!!!!!!!!");
          favoritespage.createview(favorites);
      }
      else if(propertydescriptionpage!=null)
      {
          
          strategyprovider.createview(favorites);
      }
     
    }
}
