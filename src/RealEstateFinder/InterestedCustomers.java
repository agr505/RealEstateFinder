/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aaron
 */
public class InterestedCustomers {
        public InterestedCustomers() {
            this.customers = new ArrayList<Customer>();
    }
    private ArrayList<Customer> customers;
    
    
    public Iterator<Customer> getCustomers()
    {
       return new
         Iterator<Customer>()          {
            public boolean hasNext()
            {
               return current < customers.size();
           }
             public Customer next()
            {
                return customers.get(current++);
            }

            public void remove()
             {
               throw new UnsupportedOperationException();
        }
 
            private int current = 0;
         };
   }
    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }
    public boolean containsCustomer(Customer customer)
    {
        Iterator<Customer> iter = getCustomers();
        while (iter.hasNext()) {
            if (iter.next().equals(customer)) {
               return true;
            }

        }
        return false;
    }
}
