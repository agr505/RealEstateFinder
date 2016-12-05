/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.util.ArrayList;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron
 */
public class InterestedCustomersTest {
    
    public InterestedCustomersTest() {
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
     * Test of getCustomers method, of class InterestedCustomers.
     */
    @Test
    public void testGetCustomers() {
        System.out.println("getCustomers");
        InterestedCustomers instance = new InterestedCustomers();
        Iterator<Customer> expResult = null;
        Iterator<Customer> result = instance.getCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomer method, of class InterestedCustomers.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        Customer customer = null;
        InterestedCustomers instance = new InterestedCustomers();
        instance.addCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsCustomer method, of class InterestedCustomers.
     */
    @Test
    public void testContainsCustomer() {
        System.out.println("containsCustomer");
        Customer customer = null;
        InterestedCustomers instance = new InterestedCustomers();
        boolean expResult = false;
        boolean result = instance.containsCustomer(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sizeget method, of class InterestedCustomers.
     */
    @Test
    public void testSizeget() {
        System.out.println("sizeget");
        InterestedCustomers instance = new InterestedCustomers();
        int expResult = 0;
        int result = instance.sizeget();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addListener method, of class InterestedCustomers.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        InterestedCustomersStateChangeListener listener = null;
        InterestedCustomers instance = new InterestedCustomers();
        instance.addListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterestedCustomers method, of class InterestedCustomers.
     */
    @Test
    public void testGetInterestedCustomers() {
        System.out.println("getInterestedCustomers");
        InterestedCustomers instance = new InterestedCustomers();
        ArrayList<Customer> expResult = null;
        ArrayList<Customer> result = instance.getInterestedCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
