/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aaron
 */
public class AvailableProperties extends PropertyContainer{

    private Application application;
    public AvailableProperties(Application app) 
    {
        application=app;
        
    }
    
    public void loadProperties() throws IOException, ClassNotFoundException{
        
          ObjectInputStream in = new ObjectInputStream(
            new FileInputStream("property.txt"));
          
        while (in.readObject()!= null){
            super.addProperty((Property) in.readObject());
            
        }
        in.close();
        
    }
    
    public void matchownedProperties()
    {
        Seller seller=(Seller)application.provideLoggedinAccount();
        
        ArrayList<String> ownedproperties=seller.getOwnedproperties();
        
       Iterator<Property> iter= getProperties();
       
       PropertyContainer propertycontainer=new PropertyContainer();
       
       
        for(int i=0;i<ownedproperties.size();i++)
        {
          while(iter.hasNext())
          {
             if( iter.next().getName().equals(ownedproperties.get(i)))
             {
                 
             }
          }
        }
    }
}
