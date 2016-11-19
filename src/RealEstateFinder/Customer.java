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
public class Customer extends Account {

    private String latestpropertyinterestedin;
    private Favorites favorites;

    Customer(String username, String password, Favorites fav) {
        super(username, password);
        favorites = fav;
        latestpropertyinterestedin = null;
    }

    public void updatepropertyinterestedin(String latestproperty) {
        latestpropertyinterestedin = latestproperty;
    }

}
