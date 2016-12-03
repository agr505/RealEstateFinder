/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 * Shows the descriptions of the properties and extends JFrame
 * @author User
 */
public class PropertyDescriptionPage extends JFrame {
JPanel currentpanel;
JPanel abovepanel;
 JLabel  Ptext;

    PropertyDescriptionPage(String name, String pic, String text) {
    JPanel currentpanel=new JPanel();
    JPanel imagePanel = new JPanel();
    imagePanel.setLayout(new BorderLayout());
    JLabel Pname;
    JLabel Ppic = new JLabel();
   
    
    Pname = new JLabel(name);
    Ptext = new JLabel(text);
    Ppic.setIcon(new ImageIcon(pic));
    
    imagePanel.add(Pname, BorderLayout.NORTH);
    imagePanel.add(Ppic, BorderLayout.CENTER);
   imagePanel.add(Ptext,BorderLayout.SOUTH);
        
        abovepanel=imagePanel;
        this.add(abovepanel, BorderLayout.NORTH);
       
        this.setTitle("Property Description Page");
        this.add(currentpanel, BorderLayout.SOUTH);
        //this.pack();
        this.setSize(350, 400);
      //  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void usestrategy(PropertyDescriptionPageStrategy strategy) {
        if(currentpanel!=null)
       {
       this.remove(currentpanel);
       }
        JPanel jpanel = new JPanel();

        JPanel j = strategy.buildview(jpanel);
        currentpanel=j;
          this.add(abovepanel, BorderLayout.NORTH);
        this.add(j, BorderLayout.SOUTH);
        
        this.setVisible(true);
        System.out.println("in property description page"+this.hashCode());
    }

}
