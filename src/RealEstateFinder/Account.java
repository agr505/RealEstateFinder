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
public class Account implements Serializable{
    private static final long serialVersionUID = 2L;
    private String username;
    private String password;
    public Account(String uname,String pass)
          {
              username=uname;
              password=pass;
              
          }
    /**
     * accessor for Accounts username
     * @return string holding the value of accounts username
     */
    public String getusername()
    {
        return username;
    }
    /**
     * accessor for Accounts password
     * @return string holding the value of accounts password
     */
     public String getpassword()
    {
        return password;
    }
}
