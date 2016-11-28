/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.io.Serializable;


/**
 *
 * @author Aaron
 */
public class Customer extends Account implements Serializable{
private static final long serialVersionUID = 1L;
    private String latestpropertyinterestedin;
    private Favorites favorites;

    Customer(String username, String password, Favorites fav) throws ClassNotFoundException {
        super(username, password);
        favorites = fav;
        latestpropertyinterestedin = null;
        System.out.println("Customer account created");
        
        
    }
    public Favorites getFavorites()
    {
        return favorites;
    }
public String returnlatestpropertyinterestedin()
{
    return latestpropertyinterestedin;
}
    public void updatepropertyinterestedin(String latestproperty) {
        latestpropertyinterestedin = latestproperty;
    }

}
