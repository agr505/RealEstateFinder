/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
public class SellerPropertyListingsPageNavigationBarButtonListener implements ActionListener {

 InterestedCustomersPage interestedcustomerspage;
 SellerPropertyListingsPage  sellerpropertyistingspage;
  
 
  

SellerPropertyListingsPageNavigationBarButtonListener(InterestedCustomersPage icp,SellerPropertyListingsPage slp) {
      interestedcustomerspage=icp;
     sellerpropertyistingspage= slp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   interestedcustomerspage.leavepage();
              sellerpropertyistingspage.routetopage();
    
           
       
}}
