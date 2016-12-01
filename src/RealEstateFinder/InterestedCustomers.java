/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aaron
 */
public class InterestedCustomers implements Serializable{
      
       private ArrayList<Customer> customers;
       public ArrayList<InterestedCustomersStateChangeListener> listeners;
    private static final long serialVersionUID = 4L;
        public InterestedCustomers() {
            this.customers = new ArrayList<Customer>();
            listeners=new ArrayList<InterestedCustomersStateChangeListener>();
    }
 
     
 
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
        customer.numofpropertiesinterestedin++;
        customers.add(customer.clone());
        
        
        InterestedCustomersStateEvent event = new  InterestedCustomersStateEvent(this,customer.returnlatestpropertyinterestedin());
      





System.out.println("INSIDE INTERESTED CUST HASH IS"+this.hashCode());
        

for (int i=0;i<listeners.size();i++)
{
    if(listeners.get(i).property.equals(customer.returnlatestpropertyinterestedin()))
            {
                System.out.println("number was called"+i);
                listeners.get(i).stateChanged(event);
            }
}
        
        
        
       
        
        
        
        
        
        
    }
    public boolean containsCustomer(Customer customer)
    {
        Customer c;
        int i=0;
        Iterator<Customer> iter = getCustomers();
        while (iter.hasNext()&&i<customer.numofpropertiesinterestedin) {
            c=iter.next();
            if (c.getusername().equals(customer.getusername())) {
               
                   if(customer.returnlatestpropertyinterestedin().equals(c.returnlatestpropertyinterestedin()))
                   {
                       return true;
                   }
                   else
                   {
                       i++;
                   }
               
              
            }

        }
        return false;
    }
    public int sizeget(){
        return customers.size();
    }

     public void addListener( InterestedCustomersStateChangeListener listener)
    {
        listeners.add(listener);
        System.out.println("THE SIZE IS "+listeners.size());
    }
    public ArrayList<Customer> getInterestedCustomers(){
        return customers;

    }
}
