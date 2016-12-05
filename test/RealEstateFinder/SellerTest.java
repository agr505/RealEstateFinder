/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.util.ArrayList;
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
public class SellerTest {
    
    public SellerTest() {
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
     * Test of getOwnedproperties method, of class Seller.
     */
    @Test
    public void testGetOwnedproperties() {
        System.out.println("getOwnedproperties");
        Seller instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getOwnedproperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterestedCustomers method, of class Seller.
     */
    @Test
    public void testGetInterestedCustomers() {
        System.out.println("getInterestedCustomers");
        Seller instance = null;
        InterestedCustomers expResult = null;
        InterestedCustomers result = instance.getInterestedCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Seller.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Seller instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
