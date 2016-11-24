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
       public ArrayList<InterestedCustomersStateChangeListener> listeners;
    
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
        System.out.println(customer.getusername()+"has contacted seller");
        customers.add(customer);
        
        
        InterestedCustomersStateEvent event = new  InterestedCustomersStateEvent(this,customer.returnlatestpropertyinterestedin());
      



/*

listeners.get(0).stateChanged(event);

for (int i=1;i<listeners.size();i++)
{
    if(listeners.get(i).property.equals(customer.returnlatestpropertyinterestedin()))
            {
                listeners.get(i).stateChanged(event);
            }
}
        
        
        
     */   
        
        
        
        
        
        
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

     public void addListener( InterestedCustomersStateChangeListener listener)
    {
        listeners.add(listener);
    }
    public ArrayList<Customer> getInterestedCustomers(){
        return customers;

    }
}
