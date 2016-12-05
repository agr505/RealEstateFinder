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
public class FavoritesTest {
    
    public FavoritesTest() {
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
     * Test of initializeFavoritesPage method, of class Favorites.
     */
    @Test
    public void testInitializeFavoritesPage() {
        System.out.println("initializeFavoritesPage");
        Favorites instance = null;
        FavoritesPage expResult = null;
        FavoritesPage result = instance.initializeFavoritesPage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addListener method, of class Favorites.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        FavoritesStateChangeListener listener = null;
        Favorites instance = null;
        instance.addListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsproperty method, of class Favorites.
     */
    @Test
    public void testContainsproperty() {
        System.out.println("containsproperty");
        String propertyname = "";
        Favorites instance = null;
        boolean expResult = false;
        boolean result = instance.containsproperty(propertyname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Favorites.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Property property = null;
        Favorites instance = null;
        instance.add(property);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
