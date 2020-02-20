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
        Money price = new Money(1337.00);
        FancyCoffee poured = 
               new FancyCoffee("Poured Directly Into Your Mouth", large, price);
        Syrup mayo = new Syrup("Warm Mayo");
        Syrup sprite = new Syrup ("It's Just Sprite!");
        Syrup shampoo = new Syrup ("Shampoo");
        
        poured.add(mayo);
        poured.add(sprite);
        poured.add(shampoo);
         
        Receipt fancyCoffeeReceipt = new Receipt();
        fancyCoffeeReceipt.add(poured);
        
        
        System.out.println(fancyCoffeeReceipt.prepare());
        System.out.println(poured.receiptAsString());
        System.out.println(fancyCoffeeReceipt.getTotalString());
    }

}
