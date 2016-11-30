/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
public class InterestedCustomerNavigationBarButtonListener implements ActionListener {

 InterestedCustomersPage interestedcustomerspage;
 SellerPropertyListingsPage  sellerpropertyistingspage;
  
 
  

InterestedCustomerNavigationBarButtonListener(InterestedCustomersPage icp,SellerPropertyListingsPage slp) {
      interestedcustomerspage=icp;
     sellerpropertyistingspage= slp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   sellerpropertyistingspage.leavepage();
             interestedcustomerspage.routetopage();
    
           
       
}}
