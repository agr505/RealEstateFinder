/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.util.LinkedList;


/**
 *
 * @author Aaron
 */
public class Application {

   private LinkedList<Account> accounts;
    
  public LinkedList<Account> getaccounts()
  {
   return accounts;   
  }
   public void createaccount(boolean isseller, String username,String password)
  {
      if(isseller==true)
      {
          accounts.add(new Seller(username,password));
      }
      else 
      {
          accounts.add(new Customer(username,password));
      }
  }
   public void authenticate(String username,String password)
   {
       LinkedList<Account> accountslist=getaccounts();
       for(int i=0;i<getaccounts().size();i++)
       {
           if(accountslist.get(i).u()==username&&accountslist.get(i).p()==password)
           {
               System.out.println("Authenticated!!!!!!!!!!");
           }
           else
           {
                System.out.println("Account not found!!!!!!!!");
           }
              
       }
   }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
