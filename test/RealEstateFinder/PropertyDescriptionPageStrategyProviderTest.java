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
public class PropertyDescriptionPageStrategyProviderTest {
    
    public PropertyDescriptionPageStrategyProviderTest() {
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
     * Test of createview method, of class PropertyDescriptionPageStrategyProvider.
     */
    @Test
    public void testCreateview() {
        System.out.println("createview");
        PropertyDescriptionPageStrategyProvider instance = null;
        instance.createview();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createview method, of class PropertyDescriptionPageStrategyProvider.
     */
    @Test
    public void testCreateview_3args() {
        System.out.println("createview");
        Favorites fav = null;
        FavoritesStateEvent e = null;
        PropertyDescriptionPage propdescriptionpage = null;
        PropertyDescriptionPageStrategyProvider instance = null;
        instance.createview(fav, e, propdescriptionpage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createview method, of class PropertyDescriptionPageStrategyProvider.
     */
    @Test
    public void testCreateview_InterestedCustomersStateEvent_PropertyDescriptionPage() {
        System.out.println("createview");
        InterestedCustomersStateEvent e = null;
        PropertyDescriptionPage propdescriptionpage = null;
        PropertyDescriptionPageStrategyProvider instance = null;
        instance.createview(e, propdescriptionpage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
