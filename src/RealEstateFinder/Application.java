/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Aaron
 */
public class Application {

    private LinkedList<Account> accounts;
    private Account loggedinaccount;
    private LoginSignupPage loginsignuppage;
    private CustomerPropertiesPage customerpropertiespage;

    public Application() throws ClassNotFoundException, IOException {
        loggedinaccount = null;
        createProperties();
        loginsignuppage = new LoginSignupPage(this);
        SignUpPage signuppage = new SignUpPage(this);
        accounts = new LinkedList<Account>();
        Favorites favorites = new Favorites();
        AvailableProperties availableproperties = new AvailableProperties(this, favorites);
        PropertyDescriptionPage pdp = new PropertyDescriptionPage(this);

        customerpropertiespage = new CustomerPropertiesPage(availableproperties);
        
        accounts.add(new Customer("joe", "bob"));
        // try {
        // createProperties();
        //}catch(IOException e){  
        //}

    }

    public LinkedList<Account> getaccounts() {
        return accounts;
    }

    public void createaccount(boolean isseller, String username, String password, String propertyInput) {
        if (isseller == true) {
            //Need code for getting text input about properties owned and having ownedproperties as a parameter to Seller Constructor
            //add properties, list them in a textField seperated by comma
            //seller constructor will have another paramerter textField
            //accounts.add(new Seller(username,password, textField));

            ArrayList<String> arr = delimiterinput(propertyInput);

            accounts.add(new Seller(username, password, arr));
        } else {
            accounts.add(new Customer(username, password));
        }
    }

    public ArrayList<String> delimiterinput(String input) {
        //deliminate input
        ArrayList<String> x = new ArrayList<>();

        String delims = "[,]";
        String[] output = input.split(delims);

        for (String p : output) {
            x.add(p);
        }

        return x;
    }

    public void authenticate(String username, String password) {
        LinkedList<Account> accountslist = getaccounts();
        for (int i = 0; i < getaccounts().size(); i++) {
            System.out.println(accountslist.get(i).getusername() + accountslist.get(i).getpassword());

            if (accountslist.get(i).getusername().equals(username) && accountslist.get(i).getpassword().equals(password)) {
                loggedinaccount = accountslist.get(i);
                System.out.println("Authenticated!!!!!!!!!!");

                loginsignuppage.leavepage();
                customerpropertiespage.routetopage();

                if (accountslist.get(i) instanceof Seller) {

                } else if (accountslist.get(i) instanceof Customer) {

                }
            } else {
                System.out.println("Account not found!!!!!!!!");
            }

        }
    }

    public Account provideLoggedinAccount() {
        return loggedinaccount;
    }

    public void createProperties() throws IOException {

        Property p1 = new Property("First property", "Image name", "text");
        Property p2 = new Property("2nd property", "Image name", "text");
        Property p3 = new Property("3rd property", "Image name", "text");

        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("property.txt"));
        out.writeObject(p1);
        out.writeObject(p2);
        out.writeObject(p3);
        out.close();

    }

    public void contactSeller(String propName) {
        System.out.println(propName + "was selected");
        Customer loggedIncustomer = (Customer) provideLoggedinAccount();
        //System.out.println(loggedIncustomer.getusername()+ " Is logged in");

        Seller propertyOwner = (Seller)findOwner(propName);

    }
    public Seller findOwner(String propName){
        
        for (int i = 0; i < accounts.size(); i++) {
          
            if(accounts.get(i) instanceof Seller)
            {
                Seller s=(Seller)accounts.get(i);
             for (int j = 0; j <s.getOwnedproperties().size();j++)
             {
                 if (s.getOwnedproperties().get(j).equals(propName)){
                     System.out.println(propName+ " Was owned by");
                     return s;
                 }
             }
        }
            
        } 
        return null;
    }

}
