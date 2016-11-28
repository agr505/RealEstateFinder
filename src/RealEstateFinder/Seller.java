/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aaron
 */


//********************** has two constructors
public class Seller extends Account implements Serializable{
private static final long serialVersionUID = 10L;
    private InterestedCustomers interestedcustomers;
      private ArrayList<String> ownedproperties = new ArrayList<>();
      
       Seller(String uname, String pass, List ownedProperties,InterestedCustomers interestedcust){ 
     //Seller( String uname, String pass, ArrayList<String> ownedproperties, InterestedCustomers interestedcust) {
     
        super(uname, pass);
        interestedcustomers=interestedcust;
        for(int i = 0; i <ownedProperties.size(); i++){
            ownedproperties.add(ownedProperties.get(i).toString());
        }
        this.ownedproperties = ownedproperties;
        System.out.println("Seller Account created");
       // interestedcustomers=interestedcust;
       
       System.out.println("Properties this seller enter are: ");
        for(Object x: ownedProperties){
            System.out.println(x);
       }
       
       for (String x: ownedproperties){
           System.out.println(x + " is in the ownedproperty list");
       }
    }
    
    public ArrayList<String> getOwnedproperties() {
        return ownedproperties;
    }
public InterestedCustomers getInterestedCustomers()
{
    return interestedcustomers;//interestedcustomers needs to be initialized in constructor
}
public int getSize(){
    return ownedproperties.size();
}
    
    

  
    
    // Seller(String username, String password, textField) 
    //
   /* Seller(String username, String password, ArrayList<String> properties) {
        //getting the properties seperated by comma and adding to ownedProperties
        super(username, password);
        
        ownedproperties = properties;
    } */
}
