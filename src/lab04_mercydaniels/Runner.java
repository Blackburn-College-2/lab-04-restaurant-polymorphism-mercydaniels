
package lab04_mercydaniels;

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
        Coffee inABowl = new Coffee("In a Bowl", large, price);
        Coffee onAPlate = new Coffee ("On a Plate", large, price);
        Coffee inYourHands = new Coffee("In your Hands", large, price);
        Coffee inAGlass = new Coffee("In a Glass", large, price);
        Receipt coffeeReceipt = new Receipt();
        
        coffeeReceipt.add(inAMug);
        coffeeReceipt.add(inABowl);
        coffeeReceipt.add(onAPlate);
        coffeeReceipt.add(inYourHands);
        coffeeReceipt.add(inAGlass);
        
         String coffeeReceiptPrint = coffeeReceipt.prepare();
         System.out.println(coffeeReceiptPrint);
    }
    
}
