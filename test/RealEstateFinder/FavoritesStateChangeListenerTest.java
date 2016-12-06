/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import javax.swing.event.ChangeEvent;
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
public class FavoritesStateChangeListenerTest {
    
    public FavoritesStateChangeListenerTest() {
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
     * Test of reassingproppage method, of class FavoritesStateChangeListener.
     */
    @Test
    public void testReassingproppage() {
        System.out.println("reassingproppage");
        PropertyDescriptionPage propertydespage = null;
        PropertyDescriptionPageStrategyProvider strategyprov = null;
        String prop = "";
        FavoritesStateChangeListener instance = null;
        instance.reassingproppage(propertydespage, strategyprov, prop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stateChanged method, of class FavoritesStateChangeListener.
     */
    @Test
    public void testStateChanged() {
        System.out.println("stateChanged");
        ChangeEvent e = null;
        FavoritesStateChangeListener instance = null;
        instance.stateChanged(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
