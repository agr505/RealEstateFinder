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
public class Account {
    
    String username;
    String password;
    public Account(String uname,String pass)
          {
              username=uname;
              password=pass;
              
          }
    public String u()
    {
        return username;
    }
     public String p()
    {
        return password;
    }
}
