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
public class AvailablePropertiesTest {
    
    public AvailablePropertiesTest() {
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
     * Test of addListener method, of class AvailableProperties.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        AvailablePropertiesStateChangeListener listener = null;
        AvailableProperties instance = null;
        instance.addListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignFavorites method, of class AvailableProperties.
     */
    @Test
    public void testAssignFavorites() {
        System.out.println("assignFavorites");
        Favorites fav = null;
        AvailableProperties instance = null;
        instance.assignFavorites(fav);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadProperties method, of class AvailableProperties.
     */
    @Test
    public void testLoadProperties() throws Exception {
        System.out.println("loadProperties");
        AvailableProperties instance = null;
        instance.loadProperties();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of matchownedProperties method, of class AvailableProperties.
     */
    @Test
    public void testMatchownedProperties() {
        System.out.println("matchownedProperties");
        SellerPropertyListingsPage p = null;
        AvailableProperties instance = null;
        instance.matchownedProperties(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addtoFav method, of class AvailableProperties.
     */
    @Test
    public void testAddtoFav() {
        System.out.println("addtoFav");
        String propertyname = "";
        AvailableProperties instance = null;
        instance.addtoFav(propertyname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProperty method, of class AvailableProperties.
     */
    @Test
    public void testUpdateProperty() {
        System.out.println("updateProperty");
        String text = "";
        String propertyname = "";
        AvailableProperties instance = null;
        instance.updateProperty(text, propertyname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
