/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ApplicationTest {
    
    public ApplicationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getaccounts method, of class Application.
     */
    @Test
    public void testGetaccounts() throws IOException, ClassNotFoundException {
        System.out.println("getaccounts");
        Application instance = new Application();
        ArrayList<Account> expResult = null;
        ArrayList<Account> result = instance.getaccounts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadaccounts method, of class Application.
     */
    @Test
    public void testLoadaccounts() throws Exception {
        System.out.println("loadaccounts");
        Application instance = new Application();
        instance.loadaccounts();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createaccount method, of class Application.
     */
    @Test
    public void testCreateaccount() throws Exception {
        Application app=new Application();
         InterestedCustomers interestedcustomers = new InterestedCustomers();
         AvailableProperties availableproperties = new AvailableProperties(app);

         Favorites favorites = new Favorites(availableproperties, app, interestedcustomers);
        System.out.println("createaccount");
        boolean isseller = true;
        String username = "bob";
        String password = "joe";
       
        ArrayList propertyInput = new ArrayList<Property>();
        String phonenumber = "999";
        Application instance = new Application();
        instance.createaccount(isseller, username, password, propertyInput, phonenumber);
        // TODO review the generated test code and remove the default call to fail.
       
       Customer acc = new Customer("bob", "joe", favorites,  "999");
       assertTrue(acc.equals(instance)== false);
        
    }

    /**
     * Test of delimiterinput method, of class Application.
     */
    @Test
    public void testDelimiterinput() throws IOException, ClassNotFoundException {
        System.out.println("delimiterinput");
        String input = "";
        Application instance = new Application();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.delimiterinput(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticate method, of class Application.
     */
    @Test
    public void testAuthenticate() throws IOException, ClassNotFoundException{
        
         Application app=new Application();
         InterestedCustomers interestedcustomers = new InterestedCustomers();
         AvailableProperties availableproperties = new AvailableProperties(app);
          ArrayList propertyInput = new ArrayList<Property>();
         Favorites favorites = new Favorites(availableproperties, app, interestedcustomers);
         
        System.out.println("createaccount");
        boolean isseller = true;
        String username = "bob";
        String password = "joe";
        String phonenumber = "999";
        Application instance = new Application();
        instance.createaccount(isseller, username, password, propertyInput, phonenumber);
       Seller expResult =new Seller("bobby","joe",propertyInput,interestedcustomers);
        System.out.println("authenticate");
        String testusername = "bob";
        String testpassword = "joe";
       // Application instance = new Application();
       // instance.authenticate(testusername, testpassword);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.equals(expResult)== false);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of provideLoggedinAccount method, of class Application.
     */
    @Test
    public void testProvideLoggedinAccount() throws IOException, ClassNotFoundException{
        System.out.println("provideLoggedinAccount");
        Application instance = new Application();
        Account expResult = null;
        Account result = instance.provideLoggedinAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createProperties method, of class Application.
     */
    @Test
    public void testCreateProperties() throws Exception {
        System.out.println("createProperties");
        Application instance = new Application();
        instance.createProperties();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAccounts method, of class Application.
     */
    @Test
    public void testSaveAccounts() throws Exception {
        System.out.println("saveAccounts");
        Application instance = new Application();
        instance.saveAccounts();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contactSeller method, of class Application.
     */
    @Test
    public void testContactSeller() throws IOException, ClassNotFoundException{
        System.out.println("contactSeller");
        String propname = "";
        
        Application instance = new Application();
        instance.contactSeller(propname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findowner method, of class Application.
     */
    @Test
    public void testFindowner() throws IOException, ClassNotFoundException{
        System.out.println("findowner");
        String propName = "";
        Application instance = new Application();
        Seller expResult = null;
        Seller result = instance.findowner(propName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hascontactedcustomer method, of class Application.
     */
    @Test
    public void testHascontactedcustomer() throws IOException, ClassNotFoundException{
        System.out.println("hascontactedcustomer");
        String propertyname = "";
        Application instance = new Application();
        boolean expResult = false;
        boolean result = instance.hascontactedcustomer(propertyname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
