/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getFavorites method, of class Customer.
     */
    @Test
    public void testGetFavorites() {
        System.out.println("getFavorites");
        Customer instance = null;
        Favorites expResult = null;
        Favorites result = instance.getFavorites();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnlatestpropertyinterestedin method, of class Customer.
     */
    @Test
    public void testReturnlatestpropertyinterestedin() {
        System.out.println("returnlatestpropertyinterestedin");
        Customer instance = null;
        String expResult = "";
        String result = instance.returnlatestpropertyinterestedin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatepropertyinterestedin method, of class Customer.
     */
    @Test
    public void testUpdatepropertyinterestedin() {
        System.out.println("updatepropertyinterestedin");
        String latestproperty = "";
        Customer instance = null;
        instance.updatepropertyinterestedin(latestproperty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnphonenumber method, of class Customer.
     */
    @Test
    public void testReturnphonenumber() {
        System.out.println("returnphonenumber");
        Customer instance = null;
        String expResult = "";
        String result = instance.returnphonenumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Customer.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Customer instance = null;
        Customer expResult = null;
        Customer result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
