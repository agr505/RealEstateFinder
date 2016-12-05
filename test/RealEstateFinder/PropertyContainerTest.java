/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

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
public class PropertyContainerTest {
    
    public PropertyContainerTest() {
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
     * Test of getProperties method, of class PropertyContainer.
     */
    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        PropertyContainer instance = new PropertyContainer();
        Iterator<Property> expResult = null;
        Iterator<Property> result = instance.getProperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProperty method, of class PropertyContainer.
     */
    @Test
    public void testAddProperty() {
        System.out.println("addProperty");
        Property property = null;
        PropertyContainer instance = new PropertyContainer();
        instance.addProperty(property);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
