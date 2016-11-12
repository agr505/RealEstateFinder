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
public class Seller extends Account{

    public ArrayList<String> getOwnedproperties() {
        return ownedproperties;
    }

    public Seller(ArrayList<String> ownedproperties, String uname, String pass) {
        super(uname, pass);
        this.ownedproperties = ownedproperties;
    }

    private ArrayList<String> ownedproperties;
    
    Seller(String username, String password) {
       super(username, password);
    }

  
}
