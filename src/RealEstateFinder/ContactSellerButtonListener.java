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
public class ContactSellerButtonListener implements ActionListener {

    private String name;

    Application application;

    ContactSellerButtonListener(String name, Application app) {
        this.name = name;

        application = app;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        application.contactSeller(name);

    }
}
