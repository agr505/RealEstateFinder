/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import javax.swing.JPanel;
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
public class PropertyDescriptionPageStrategyTest {
    
    public PropertyDescriptionPageStrategyTest() {
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
     * Test of buildview method, of class PropertyDescriptionPageStrategy.
     */
    @Test
    public void testBuildview() {
        System.out.println("buildview");
        JPanel jpanel = null;
        PropertyDescriptionPageStrategy instance = new PropertyDescriptionPageStrategyImpl();
        JPanel expResult = null;
        JPanel result = instance.buildview(jpanel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PropertyDescriptionPageStrategyImpl implements PropertyDescriptionPageStrategy {

        public JPanel buildview(JPanel jpanel) {
            return null;
        }
    }
    
}
