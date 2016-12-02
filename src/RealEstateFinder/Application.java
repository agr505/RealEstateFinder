/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Aaron
 */
public class Application implements Serializable {

    private ArrayList<Account> accounts;
    private Account loggedinaccount;
    private LoginSignupPage loginsignuppage;
    private SignUpPage signuppage;
    private CustomerPropertiesPage customerpropertiespage;

    private Favorites favorites;
    private InterestedCustomers interestedcustomers;
    private AvailableProperties availableproperties;
    private SellerPropertyListingsPage seller;

    /**
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Application() throws IOException, ClassNotFoundException {

        accounts = new ArrayList<Account>();
        loadaccounts();
        interestedcustomers = new InterestedCustomers();
        System.out.println("BEGINNING HASH CODE" + interestedcustomers.hashCode());
        loggedinaccount = null;
        createProperties();
        loginsignuppage = new LoginSignupPage(this, signuppage);
        //signuppage = new SignUpPage(this);

        availableproperties = new AvailableProperties(this);

        favorites = new Favorites(availableproperties, this, interestedcustomers);

        //  PropertyDescriptionPage pdp = new PropertyDescriptionPage(this);
        customerpropertiespage = null;

        //  PropertyDescriptionPage pdp = new PropertyDescriptionPage(this);
        // accounts.add(new Customer("joe", "bob", favorites));
        // try {
        // createProperties();
        //}catch(IOException e){  
        //}
    }

    public ArrayList<Account> getaccounts() {
        return accounts;
    }

    /**
     * Loads number of accounts saved from numberofaccounts text file
     * Loads accounts from accounts serialized text file
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void loadaccounts() throws IOException, ClassNotFoundException {
        ObjectInputStream in2 = new ObjectInputStream(
                new FileInputStream("numberofaccounts.txt"));
        int numofacc = (int) in2.readObject();  //

        in2.close();

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("accounts.txt"));

        //ArrayList<Account> acc=new ArrayList<Account>();
        // try
        //{
        for (int i = 0; i < numofacc; i++) {
            accounts.add((Account) in.readObject());
            System.out.println(accounts.get(i).getusername());

            if (accounts.get(i) instanceof Seller) {
                Seller s = (Seller) accounts.get(i);
                InterestedCustomers ic = s.getInterestedCustomers();
                Iterator<Customer> c = ic.getCustomers();

                while (c.hasNext()) {
                    Customer cust = c.next();
                    System.out.println(" cust" + cust.getusername() + "fav=" + cust.getFavorites().getProperties().next().getName());

                }

            }

        }

        /*    catch(InvalidClassException e)
      {
         System.out.println( e.classname);
             System.out.println( e.getCause());
         System.out.println( e.getStackTrace());
      StackTraceElement d[]=   e.getStackTrace();
      for(int i=0;i<d.length;i++)
   System.out.println(d[i]);
      }
         catch(Exception e)
      {
         System.out.println(e);
      }
         */
        in.close();
    }
    //String propertyInput = "First Property, Second Property";

    public void createaccount(boolean isseller, String username, String password, List propertyInput, String phonenumber) throws ClassNotFoundException {
        if (isseller == true) {
            //Need code for getting text input about properties owned and having ownedproperties as a parameter to Seller Constructor
            //add properties, list them in a textField seperated by comma
            //seller constructor will have another paramerter textField
            //accounts.add(new Seller(username,password, textField));

            // ArrayList<String> arr = delimiterinput(propertyInput);
            //accounts.add(new Seller(username, password, arr, interestedcustomers));
            accounts.add(new Seller(username, password, propertyInput, interestedcustomers));

        } else {
            //accounts.add(new Customer("joe", "bob", favorites));
            accounts.add(new Customer(username, password, favorites, phonenumber));

            // accounts.add(new Customer(username, password));
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
        ArrayList<Account> accountslist = getaccounts();

        for (int i = 0; i < getaccounts().size(); i++) {
            // System.out.println(accountslist.get(i).getusername() + accountslist.get(i).getpassword());

            if (accountslist.get(i) instanceof Seller) {
                if (accountslist.get(i).getusername().equals(username) && accountslist.get(i).getpassword().equals(password)) {
                    System.out.println(" Seller Authenticated!!!!!!!!!!");
                    Seller s = (Seller) accountslist.get(i);
                    interestedcustomers = s.getInterestedCustomers();
                    loggedinaccount = accountslist.get(i);
                    loginsignuppage.leavepage();
                    seller = new SellerPropertyListingsPage(this, availableproperties);
                    InterestedCustomersPage icp = new InterestedCustomersPage(interestedcustomers, this, seller);
                    SellerNavigationBar bar = new SellerNavigationBar(this, icp, seller);
                    seller.addbar(bar);
                } else {
                    System.out.println("Account not found!!!!!!!!");
                }
            } else if (accountslist.get(i) instanceof Customer) {

                if (accountslist.get(i).getusername().equals(username) && accountslist.get(i).getpassword().equals(password)) {
                    Customer c = (Customer) accountslist.get(i);
                    favorites = c.getFavorites();
                    favorites.listeners = c.getFavorites().listeners;
                    availableproperties.assignFavorites(favorites);
                    loggedinaccount = accountslist.get(i);
                    System.out.println(" Customer Authenticated!!!!!!!!!!");
                    FavoritesPage fp=favorites.initializeFavoritesPage();
                    customerpropertiespage = new CustomerPropertiesPage(availableproperties, this, favorites, interestedcustomers);
                   CustomerNavigationBar bar=new    CustomerNavigationBar(this,customerpropertiespage,fp);
                      CustomerNavigationBar bar2=new    CustomerNavigationBar(this,customerpropertiespage,fp);
                   customerpropertiespage.addbar(bar);
                   fp.addbar(bar2);
                    loginsignuppage.leavepage();
                    customerpropertiespage.routetopage();
                    
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

        Property p1 = new Property("First Property", "src\\img\\NYC_Empire_State_Building.jpg", "Empire State Building Office #1");
        Property p2 = new Property("Second Property", "src\\img\\NYC_Empire_State_Building.jpg", "Empire State Building Office #2");
        Property p3 = new Property("Third Property", "src\\img\\NYC_Empire_State_Building.jpg", "Empire State Building Office #3");
        Property p4 = new Property("Fourth Property", "src\\img\\NYC_Empire_State_Building.jpg", "Empire State Building Office #4");
        Property p5 = new Property("Fifth Property", "src\\img\\NYC_Empire_State_Building.jpg", "Empire State Building Office #5");
        Property p6 = new Property("Sixth Property", "src\\img\\White_House_02.jpg", "The White House: Oval Office");
        Property p7 = new Property("Seventh Property", "src\\img\\White_House_02.jpg", "The White House: Red Room ");
        Property p8 = new Property("Eighth Property", "src\\img\\White_House_02.jpg", "The White House: Living Room");
        Property p9 = new Property("Nineth Property", "src\\img\\White_House_02.jpg", "The White House: Guest Room");
        Property p10 = new Property("Tenth Property", "src\\img\\White_House_02.jpg", "The White House: Master Room");
        Property p11 = new Property("Eleventh Property", "src\\img\\Eiffel_Tower_01.jpg", "Eiffel Tower");
        Property p12 = new Property("Twelfth Property", "src\\img\\Miami.jpg", "Fountainebleau PH #1");
        Property p13 = new Property("Thirteenth Property", "src\\img\\Miami.jpg", "Fountainebleau PH #2");
        Property p14 = new Property("Fourteenth Property", "src\\img\\Miami.jpg", "Fountainebleau PH #3");
        Property p15 = new Property("Fifteenth Property", "src\\img\\Miami.jpg", "Fountainebleau PH #4");
        Property p16 = new Property("Sixteenth Property", "src\\img\\Miami.jpg", "Fountainebleau PH #5");

        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("property.txt"));
        out.writeObject(p1);
        out.writeObject(p2);
        out.writeObject(p3);
        out.writeObject(p4);
        out.writeObject(p5);
        out.writeObject(p6);
        out.writeObject(p7);
        out.writeObject(p8);
        out.writeObject(p9);
        out.writeObject(p10);
        out.writeObject(p11);
        out.writeObject(p12);
        out.writeObject(p13);
        out.writeObject(p14);
        out.writeObject(p15);
        out.writeObject(p16);

    }

    /**
     * Saves the accounts on accounts text file
     * saves the number to represent the number of accounts that are saved
     * @throws IOException 
     */
    public void saveAccounts() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream( 
                new FileOutputStream("accounts.txt"));

        ArrayList<Account> acc;
        acc = this.getaccounts();

        for (int i = 0; i < acc.size(); i++) {
            out.writeObject(acc.get(i));   //writing the accounts into file
        }

        ObjectOutputStream out2 = new ObjectOutputStream(
                new FileOutputStream("numberofaccounts.txt"));

        int numberofaccounts = this.getaccounts().size(); //getting number of accounts 

        out2.writeObject(numberofaccounts);  //writing the size of accounts in file

    }

    public void contactSeller(String propname) {

        Customer loggedincustomer = (Customer) provideLoggedinAccount();
        loggedincustomer.updatepropertyinterestedin(propname);
        Seller propertyowner = (Seller) findowner(propname);
        System.out.println("you contacted " + propertyowner.getusername());
        InterestedCustomers interestedcust = propertyowner.getInterestedCustomers();
        interestedcust.listeners = interestedcustomers.listeners;
        interestedcust.addCustomer(loggedincustomer);

    }

    public Seller findowner(String propName) {
        System.out.println("enteredfindowner");
        for (int i = 0; i < accounts.size(); i++) {

            if (accounts.get(i) instanceof Seller) {
                Seller s = (Seller) accounts.get(i);
                for (int j = 0; j < s.getOwnedproperties().size(); j++) {
                    if (s.getOwnedproperties().get(j).equals(propName)) {
                        System.out.println(propName + " Was owned by");
                        return s;
                    }
                }
            }

        }
        return null;
    }

    public boolean hascontactedcustomer(String propertyname) {
        Seller s = findowner(propertyname);
        Customer c = (Customer) provideLoggedinAccount();
        c.updatepropertyinterestedin(propertyname);
        InterestedCustomers interestedcustomers = s.getInterestedCustomers();
        return interestedcustomers.containsCustomer(c);
    }
}
