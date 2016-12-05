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
 * @author Aaron
 */
public class LoginSignupPageTest {
    
    public LoginSignupPageTest() {
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
     * Test of getusernameinput method, of class LoginSignupPage.
     */
    @Test
    public void testGetusernameinput() {
        System.out.println("getusernameinput");
        LoginSignupPage instance = null;
        String expResult = "";
        String result = instance.getusernameinput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getpasswordinput method, of class LoginSignupPage.
     */
    @Test
    public void testGetpasswordinput() {
        System.out.println("getpasswordinput");
        LoginSignupPage instance = null;
        String expResult = "";
        String result = instance.getpasswordinput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of routetopage method, of class LoginSignupPage.
     */
    @Test
    public void testRoutetopage() {
        System.out.println("routetopage");
        LoginSignupPage instance = null;
        instance.routetopage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leavepage method, of class LoginSignupPage.
     */
    @Test
    public void testLeavepage() {
        System.out.println("leavepage");
        LoginSignupPage instance = null;
        instance.leavepage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
