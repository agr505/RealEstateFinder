/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Aaron
 */
public class FavoritesStateChangeListener implements ChangeListener {
    //assign property corresponding to property description page property
    public String property;
    public FavoritesPage favoritespage;
    PropertyDescriptionPage propertydescriptionpage;
    PropertyDescriptionPageStrategyProvider strategyprovider;
    
    FavoritesStateChangeListener(FavoritesPage favpage)
    {
        System.out.println(this.hashCode()+"main listener was created");
        favoritespage=favpage;
        propertydescriptionpage=null;
        property=null;
        
    }
    FavoritesStateChangeListener(PropertyDescriptionPage propertydespage,PropertyDescriptionPageStrategyProvider strategyprov,String prop)
    {
        System.out.println(this.hashCode()+"listener was created for"+propertydespage.hashCode());
        propertydescriptionpage=propertydespage;
       strategyprovider=strategyprov;
         favoritespage=null;
         property=prop;
         
         
    }
  /*   void stateChanged(FavoritesStateEvent event) {
        Favorites favorites = event.getSource();
      if(favoritespage!=null)
      {
          System.out.println("!!!!!!!!!!!!!");
          favoritespage.createview(favorites);
      }
      else if(propertydescriptionpage!=null)
      {
           System.out.println("other");
          strategyprovider.createview(favorites);
      }
     
    }*/

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
          System.out.println( propertydescriptionpage.hashCode()+"state change for other!!!!!!");
           propertydescriptionpage.setVisible(false);
           
          strategyprovider.createview(favorites,event,propertydescriptionpage);
      }
    }
}
