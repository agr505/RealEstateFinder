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


/**
 * Class for the Account type of a Seller which holds the InteresedCustomers in Property that
 * the Seller owns and the Properties the Seller owns
 * @author Aaron
 */
public class Seller extends Account implements Serializable{
private static final long serialVersionUID = 10L;
    private InterestedCustomers interestedcustomers;
      private ArrayList<String> ownedproperties = new ArrayList<>();
      
      /**
       * Constructor which will call the super class Account's constructor along with initializing InterestedCutomers and the 
       * Seller's list of Property names the Seller owns 
       *
       * @param uname String holding value of username
       * @param pass  String holding value of password
       * @param ownedProperties  Seller's list of Property names the Seller owns 
       * @param interestedcust InteresedCustomers in Property that the Seller owns
       */
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
    /**
     * accessor for Seller owned properties
     * @return ArrayList<String> which are the properties owned by the seller
     */
    public ArrayList<String> getOwnedproperties() {
        return ownedproperties;
    }
    /**
     * accessor for Interested Customers
     * @return InterestedCustomers the interested customers
     */
public InterestedCustomers getInterestedCustomers()
{
    return interestedcustomers;//interestedcustomers needs to be initialized in constructor
}
/**
     * accessor for size
     * @return int which holds the value of the number of owned properties
     */
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
