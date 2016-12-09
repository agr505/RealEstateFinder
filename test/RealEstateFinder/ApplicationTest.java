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
    public void testGetaccounts() {
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
        System.out.println("createaccount");
        boolean isseller = false;
        String username = "";
        String password = "";
        List propertyInput = null;
        String phonenumber = "";
        Application instance = new Application();
        instance.createaccount(isseller, username, password, propertyInput, phonenumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delimiterinput method, of class Application.
     */
    @Test
    public void testDelimiterinput() {
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
    public void testAuthenticate() {
        System.out.println("authenticate");
        String username = "";
        String password = "";
        Application instance = new Application();
        instance.authenticate(username, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of provideLoggedinAccount method, of class Application.
     */
    @Test
    public void testProvideLoggedinAccount() throws IOException, ClassNotFoundException {
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
    public void testContactSeller() {
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
    public void testFindowner() {
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
    public void testHascontactedcustomer() {
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
