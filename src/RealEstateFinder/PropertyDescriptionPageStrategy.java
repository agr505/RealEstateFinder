
package RealEstateFinder;

import javax.swing.JPanel;

/**
 *
 * @author Aaron
 */
/**
   * PropertyDescriptionPageStrategy interface that will be implemented by anonymous classes for a Customer PropertyDescriptionPageStrategy 
   * and a Seller PropertyDescriptionPageStrategy 
 */
public interface PropertyDescriptionPageStrategy {
    /**
     * Method that will be implemented with how to customize the JPanel with the appropriate button based on the conditions     * @param jpanel
     * @return JPanel with appropriate JButton
     */
    public JPanel buildview(JPanel jpanel);
}
