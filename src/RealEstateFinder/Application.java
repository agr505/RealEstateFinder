/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;


/**
 *
 * @author Aaron
 */
public class Application {
//comment
   private LinkedList<Account> accounts;
   private Account loggedinaccount;
    
  public Application()
  {
         loggedinaccount=null;
      LoginSignupPage loginsignuppage=new LoginSignupPage(this);  
      SignUpPage signuppage=new  SignUpPage(this);  
      accounts= new LinkedList<Account>();
      Favorites favorites=new Favorites();
      AvailableProperties availableproperties=new AvailableProperties(this,favorites);
      
      
      
      
      accounts.add(new Account("joe","bob"));
     // try {
     // createProperties();
      //}catch(IOException e){  
      //}
     
      
  }
  public LinkedList<Account> getaccounts()
  {
   return accounts;   
  }
   public void createaccount(boolean isseller, String username,String password)
  {
      if(isseller==true)
      {
          //Need code for getting text input about properties owned and having ownedproperties as a parameter to Seller Constructor
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
       System.out.println(accountslist.get(i).getusername()+accountslist.get(i).getpassword());
       
           if(accountslist.get(i).getusername().equals(username)&&accountslist.get(i).getpassword().equals(password))
           {
                loggedinaccount=accountslist.get(i);
               System.out.println("Authenticated!!!!!!!!!!");
               if(accountslist.get(i) instanceof Seller)
               {
                  
               }
               else if(accountslist.get(i) instanceof Customer)
               {
                   
               }
           }
           else
           {
                System.out.println("Account not found!!!!!!!!");
           }
              
       }
   }
   
   public Account provideLoggedinAccount()
   {
       return loggedinaccount;
   }
   public void createProperties() throws IOException {
       
      Property p1 = new Property("First property", "Image name", "text" );
      Property p2 = new Property("2nd property", "Image name", "text" );
      Property p3 = new Property("3rd property", "Image name", "text" );
      
      ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream ("property.txt"));
      out.writeObject(p1);
       out.writeObject(p2);
        out.writeObject(p3);
        out.close();
      
   }
   
 
}
