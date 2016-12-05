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
 * @author Aaron
 */
public class InterestedCustomersStateChangeListenerTest {
    
    public InterestedCustomersStateChangeListenerTest() {
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
     * Test of stateChanged method, of class InterestedCustomersStateChangeListener.
     */
    @Test
    public void testStateChanged() {
        System.out.println("stateChanged");
        ChangeEvent e = null;
        InterestedCustomersStateChangeListener instance = null;
        instance.stateChanged(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
