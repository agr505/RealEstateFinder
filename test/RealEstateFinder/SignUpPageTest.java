/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.util.List;
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
public class SignUpPageTest {
    
    public SignUpPageTest() {
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
     * Test of getusernameinput method, of class SignUpPage.
     */
    @Test
    public void testGetusernameinput() {
        System.out.println("getusernameinput");
        SignUpPage instance = null;
        String expResult = "";
        String result = instance.getusernameinput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getpasswordinput method, of class SignUpPage.
     */
    @Test
    public void testGetpasswordinput() {
        System.out.println("getpasswordinput");
        SignUpPage instance = null;
        String expResult = "";
        String result = instance.getpasswordinput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhone method, of class SignUpPage.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        SignUpPage instance = null;
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperties method, of class SignUpPage.
     */
    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        SignUpPage instance = null;
        List expResult = null;
        List result = instance.getProperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCheck method, of class SignUpPage.
     */
    @Test
    public void testGetCheck() {
        System.out.println("getCheck");
        SignUpPage instance = null;
        Boolean expResult = null;
        Boolean result = instance.getCheck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setToVisible method, of class SignUpPage.
     */
    @Test
    public void testSetToVisible() {
        System.out.println("setToVisible");
        SignUpPage instance = null;
        instance.setToVisible();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
