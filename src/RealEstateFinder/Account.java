
package RealEstateFinder;

import java.io.Serializable;

/**
 *
 * @author Aaron
 */
/**
 * Class for holding Account information
 *
 */
public class Account implements Serializable {

    private static final long serialVersionUID = 2L;
    private String username;
    private String password;

    /**
     * Constructor initializing the username and password fields
     *
     * @param uname String holding username
     * @param pass String holding password
     */
    public Account(String uname, String pass) {
        username = uname;
        password = pass;

    }

    /**
     * accessor for Accounts username
     *
     * @return string holding the value of accounts username
     */
    public String getusername() {
        return username;
    }

    /**
     * accessor for Accounts password
     *
     * @return string holding the value of accounts password
     */
    public String getpassword() {
        return password;
    }
}
