
package lab04_mercydaniels;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;

/**
 *
 * @author mercy.daniels
 */
public class Syrup implements Orderable {

    private Money price = new Money(25.0);
    private String flavor;

    public Syrup(String flavor) {

        this.flavor = flavor;
    }
/**
 * overrides getPrice to return the price of the syrup
 * @return price as type Money
 */
    @Override
    public Money getPrice() {
        return this.price;
    }
/**
 * overrides getReceiptItem to return the reciept item as a string
 * @return receiptSyrup as String
 */
    @Override
    public String getReceiptItem() {
        String receiptSyrup = flavor + "   " + price.getAmountString();
        return receiptSyrup;
    }
    
    
  
}
