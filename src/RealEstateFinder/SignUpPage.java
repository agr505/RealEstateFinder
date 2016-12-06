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
 *
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

    String[] myStrings = {"First Property", "Second Property", "Third Property", "Fourth Property",
        "Fifth Property", "Sixth Property", "Seventh Property", "Eighth Property",
        "Ninthth Property", "Tenth Property", "Eleventh Property", "Twelfth Property",
        "Thirteenth Property", "Fourteenth Property", "Fifteenth Property", "Sixteenth Property"};

    JList leftlist;

    /**
     *
     * @param app is the reference to application
     * @param p is the reference to login/signup page creates a JList called
     * leftlist with the properties from mystrings gets the properties and puts
     * it into a List adds the text boxes and button and the Jlist into the
     * panel panel is added to the frame actionlistener for the signup button is
     * attached
     */
    SignUpPage(Application app, LoginSignupPage p) {

        leftlist = new JList(myStrings);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        getProperties();

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
     * accessor for username
     *
     * @return string holding the value of accounts username
     */
    public String getusernameinput() {
        return username.getText();
    }

    /**
     * accessor for password
     *
     * @return string holding the value of accounts password
     */
    public String getpasswordinput() {
        return password.getText();
    }

    /**
     * accessor for phone number
     *
     * @return string holding the value of accounts phone number
     */
    public String getPhone() {
        return phoneNumber.getText();
    }

    /**
     *
     * @return the List with all the selected values by the user
     */
    public List getProperties() {

        List x = leftlist.getSelectedValuesList();

        return x;
    }

    /**
     * See if checkbox is checked
     *
     * @return boolean based on if checkbox is checked
     */
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
