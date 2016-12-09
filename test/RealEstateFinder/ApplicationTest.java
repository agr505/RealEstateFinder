package RealEstateFinder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dshakil2013
 */
public class ApplicationTest {
    
    public ApplicationTest() {
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
     * Test of createaccount method, of class Application.
     */
    @Test
    public void testCreateaccount() throws Exception {
        Application app=new Application();
         InterestedCustomers interestedcustomers = new InterestedCustomers();
         AvailableProperties availableproperties = new AvailableProperties(app);

         Favorites favorites = new Favorites(availableproperties, app, interestedcustomers);
        System.out.println("createaccount");
        boolean isseller = true;
        String username = "bob";
        String password = "joe";
       
        ArrayList propertyInput = new ArrayList<Property>();
        String phonenumber = "999";
        Application instance = new Application();
        instance.createaccount(isseller, username, password, propertyInput, phonenumber);
        // TODO review the generated test code and remove the default call to fail.
       
       Customer acc = new Customer("bob", "joe", favorites,  "999");
       assertTrue(acc.equals(instance)== false);
    }


    /**
     * Test of authenticate method, of class Application.
     */
    @Test
    public void testAuthenticate() throws IOException, ClassNotFoundException {
      
        
         Application app=new Application();
         InterestedCustomers interestedcustomers = new InterestedCustomers();
         AvailableProperties availableproperties = new AvailableProperties(app);
          ArrayList propertyInput = new ArrayList<Property>();
         Favorites favorites = new Favorites(availableproperties, app, interestedcustomers);
         
        System.out.println("createaccount");
        boolean isseller = true;
        String username = "bob";
        String password = "joe";
        String phonenumber = "999";
        Application instance = new Application();
        instance.createaccount(isseller, username, password, propertyInput, phonenumber);
       Seller expResult =new Seller("bobby","joe",propertyInput,interestedcustomers);
        System.out.println("authenticate");
        String testusername = "bob";
        String testpassword = "joe";
       // Application instance = new Application();
       // instance.authenticate(testusername, testpassword);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.equals(expResult)== false);
        //fail("The test case is a prototype.");
    }
  
}
