/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.util.ArrayList;

/**
 *
 * @author Aaron
 */


//********************** has two constructors
public class Seller extends Account{

    private InterestedCustomers interestedcustomers;
      private ArrayList<String> ownedproperties;
      
     Seller( String uname, String pass,ArrayList<String> ownedproperties, InterestedCustomers interestedcust) {
        super(uname, pass);
        this.ownedproperties = ownedproperties;
        interestedcustomers=interestedcust;
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
