
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.*;

/**
 *
 * @author mercy.daniels
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Size large = new Size("Large");
        Money price =  new Money(500.00);
        Coffee inAMug = new Coffee("In a Mug", large, price);
        Receipt coffeeReceipt = new Receipt();
    }
    
}
