/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aaron
 */


//********************** has two constructors
public class Seller extends Account{

    private InterestedCustomers interestedcustomers;
      private ArrayList<String> ownedproperties = new ArrayList<>();
      
       Seller(String uname, String pass, List ownedProperties){ 
     //Seller( String uname, String pass, ArrayList<String> ownedproperties, InterestedCustomers interestedcust) {
     
        super(uname, pass);
        
        for(int i = 0; i <ownedProperties.size(); i++){
            ownedproperties.add(ownedProperties.get(i).toString());
        }
       // this.ownedproperties = ownedproperties;
        System.out.println("Seller Account created");
       // interestedcustomers=interestedcust;
       
       System.out.println("Properties this seller enter are: ");
        for(Object x: ownedProperties){
            System.out.println(x);
       }
       
       for (String x: ownedproperties){
           System.out.println(x + " list");
       }
    }
    
    public ArrayList<String> getOwnedproperties() {
        return ownedproperties;
    }
public InterestedCustomers getInterestedCustomers()
{
    return interestedcustomers;//interestedcustomers needs to be initialized in constructor
}
    
    

  
    
    // Seller(String username, String password, textField) 
    //
   /* Seller(String username, String password, ArrayList<String> properties) {
        //getting the properties seperated by comma and adding to ownedProperties
        super(username, password);
        
        ownedproperties = properties;
    } */
}
