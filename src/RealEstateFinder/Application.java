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
     * @throws ClassNotFoundException loads accounts from the text file
     * hardcodes properties by calling createProperties initializes
     * loginsignuppage, interestedCustomers, availableProperties and favorites
     */
    public Application() throws IOException, ClassNotFoundException {

        accounts = new ArrayList<Account>();
        loadaccounts();
        interestedcustomers = new InterestedCustomers();

        loggedinaccount = null;
        createProperties();
        loginsignuppage = new LoginSignupPage(this, signuppage);

        availableproperties = new AvailableProperties(this);

        favorites = new Favorites(availableproperties, this, interestedcustomers);

        customerpropertiespage = null;

    }

    /**
     *
     * @return the accounts list
     */
    public ArrayList<Account> getaccounts() {
        return accounts;
    }

    /**
     * Loads number of accounts saved from numberofaccounts text file Loads
     * accounts from accounts serialized text file
     *
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

        in.close();
    }

    /**
     *
     * @param isseller gets the value from checkbox for seller account
     * @param username gets the username
     * @param password gets the password
     * @param propertyInput gets the properties pwned by seller, if seller is
     * signing up
     * @param phonenumber of the customer signing up
     * @throws ClassNotFoundException creates seller account if account type is
     * seller else creates a customer account
     */
    public void createaccount(boolean isseller, String username, String password, List propertyInput, String phonenumber) throws ClassNotFoundException {
        if (isseller == true) {

            accounts.add(new Seller(username, password, propertyInput, interestedcustomers));

        } else {

            accounts.add(new Customer(username, password, favorites, phonenumber));

        }
    }

    /**
     * Used for delimiting Strings
     *
     * @param input String to be delimited
     * @return delimited String
     */
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

    /**
     *
     * @param username is passed in
     * @param password is passed in goes through the list of accounts saved and
     * compares the username and password authenticates customers or sellers if
     * seller is authenticated user is routed to sellerpropertypage if customer
     * is authenticated user is routed to customerpropertypage
     */
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
                    FavoritesPage fp = favorites.initializeFavoritesPage();
                    customerpropertiespage = new CustomerPropertiesPage(availableproperties, this, favorites, interestedcustomers);
                    CustomerNavigationBar bar = new CustomerNavigationBar(this, customerpropertiespage, fp);
                    CustomerNavigationBar bar2 = new CustomerNavigationBar(this, customerpropertiespage, fp);
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

    /**
     *
     * @return the current account thats logged in
     */
    public Account provideLoggedinAccount() {
        return loggedinaccount;
    }

    /**
     *
     * @throws IOException for file not found hardcodes the properties objects
     * objects are written into a file and serialized
     */
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
     * Saves the accounts on accounts text file saves the number to represent
     * the number of accounts that are saved
     *
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

    /**
     *
     * @param propname is the property that the customer contacted the seller in
     * regards to gets the current customer thats logged in adds the property to
     * propertyintersted in finds the owned of the property adds the customer to
     * sellers interested buyers
     */
    public void contactSeller(String propname) {

        Customer loggedincustomer = (Customer) provideLoggedinAccount();
        loggedincustomer.updatepropertyinterestedin(propname);
        Seller propertyowner = (Seller) findowner(propname);
        System.out.println("you contacted " + propertyowner.getusername());
        InterestedCustomers interestedcust = propertyowner.getInterestedCustomers();
        interestedcust.listeners = interestedcustomers.listeners;
        interestedcust.addCustomer(loggedincustomer);

    }

    /**
     *
     * @param propName is the propertyname
     * @return the owned of the property selected goes through accounts list for
     * all the sellers and matches the property selected with the owned property
     * by the seller
     */
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

    /**
     * finds the owned of the property gets the customer thats logged in updates
     * the latest propertyinterestedin
     *
     * @param propertyname
     * @return true if the customer is in the interestedcustomers list
     */
    public boolean hascontactedcustomer(String propertyname) {
        Seller s = findowner(propertyname);
        Customer c = (Customer) provideLoggedinAccount();
        c.updatepropertyinterestedin(propertyname);
        InterestedCustomers interestedcustomers = s.getInterestedCustomers();
        return interestedcustomers.containsCustomer(c);
    }
}
