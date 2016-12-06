
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
/**
 * Constructor that initializes its fields with the Property's information
 * @param name String holding the value of the Property's name
 * @param pic String holding the value of the Property's image path
 * @param text String holding the value of the Property's text description
 */
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
 
        this.setSize(350, 400);
   

    }
/**
 * Method utilizing the PropertyDescriptionPageStrategy to return the customized JPanel based on the PropertyDescriptionPageStrategy
 * algorithm, then removes the current JPanel to add the newly created one
 * @param strategy PropertyDescriptionPageStrategy used to return the customized JPanel based on its algorithm
 */
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
