/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

//import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

/**
 * Allows the user to create an account and extends JFrame
 * @author Sam
 */
/**
 * 
 * @author Aaron
 */
public class SignUpPage extends JFrame {

    Application app;
    LoginSignupPage page;

    JLabel title = new JLabel("Sign Up:");
    JLabel un = new JLabel("Enter Username:");
    JLabel pw = new JLabel("Enter Password:");
    JLabel phoneNum = new JLabel("Enter Phone Number:");
    JLabel propertyNames = new JLabel("Enter all the owned Properties(Sellers only)");

    JTextField username = new JTextField(12);
    JTextField password = new JTextField(12);
    JTextField phoneNumber = new JTextField(12);
    JTextField tf3 = new JTextField(20);
    JCheckBox check = new JCheckBox("Check if you are a seller");
    JButton signUp = new JButton("Sign Up");
    JPanel panel = new JPanel();
    //JButton movebutton;

    String[] myStrings = {"First Property", "Second Property", "Third Property", "Fourth Property",
                           "Fifth Property", "Sixth Property", "Seventh Property", "Eighth Property",
                         "Ninthth Property", "Tenth Property", "Eleventh Property", "Twelfth Property",
                    "Thirteenth Property", "Fourteenth Property", "Fifteenth Property", "Sixteenth Property"};
    
    JList leftlist;
   // JList rightlist;
   
   
    SignUpPage(Application app, LoginSignupPage p) {

        leftlist = new JList(myStrings);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        getProperties();
       //add( new JScrollPane(leftlist));
       
//       movebutton = new JButton("Move-->");
//       movebutton.addActionListener( new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                rightlist.setListData((Object[]) leftlist.getSelectedValue());
//                
//            }
//       });
//       rightlist = new JList();
//       rightlist.setVisibleRowCount(5);
//       rightlist.setFixedCellWidth(100);
//        rightlist.setFixedCellHeight(15);
//        rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      // panel.add(movebutton);
      
        this.app = app;
        page = p;

        panel.add(title);
        panel.add(un);
        panel.add(username);
        panel.add(pw);
        panel.add(password);
        panel.add(phoneNum);
        panel.add(phoneNumber);
        panel.add(propertyNames);
        //panel.add(tf3);
        //panel.add(box);
        panel.add(new JScrollPane(leftlist));
        panel.add(check);
        

        signUp.addActionListener(new SignupButtonListener(app, this, page));
        panel.add(signUp);
        this.add(panel);

        this.setTitle("SignUp");
        //this.pack();
        this.setSize(250, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * accessor for  username
     * @return string holding the value of accounts username
     */
    public String getusernameinput() {
        return username.getText();
    }
    /**
     * accessor for password
     * @return string holding the value of accounts password
     */
    public String getpasswordinput() {
        return password.getText();
    }
    /**
     * accessor for phone number
     * @return string holding the value of accounts phone number
     */
    public String getPhone() {
        return phoneNumber.getText();
    }
    
    public List getProperties() {
        //ListModel model = leftlist.getModel();
        
        List  x  = leftlist.getSelectedValuesList();
//        for(Object a: x){
//            System.out.println(x);
//        }
       
        return x;
    }

    public Boolean getCheck() {

        if (check.isSelected()) {
            return true;
        } else {
            return false;
        }
    }
/**
 * Routing method used to leave this page
 */
    public void setToVisible() {
        this.setVisible(false);
    }
}
