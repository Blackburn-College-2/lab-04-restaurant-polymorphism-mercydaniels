package lab04_mercydaniels;

import edu.blackburn.cs.cs212.restaurantbase.*;

/**
 * Est Time: 2 hours Real Time: 4 hours
 *
 * @author mercy.daniels
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Money money = new Money(1.0);
        Meat ham = new Meat(money, "ham");
        Meat armadillo = new Meat(money, "armadillo");
        Topping cardboard = new Topping("cardboard");
        Topping dandruff = new Topping("dandruff");
        Topping sand = new Topping("sand");
        Sandwich sanFranciscoSurprise = new Sandwich(money);
        sanFranciscoSurprise.add(ham);
        sanFranciscoSurprise.add(armadillo);
        sanFranciscoSurprise.add(cardboard);
        sanFranciscoSurprise.add(dandruff);
        sanFranciscoSurprise.add(sand);

        Receipt sandwichReceipt = new Receipt();
        sandwichReceipt.add(sanFranciscoSurprise);
        sandwichReceipt.prepare();
        System.out.println(sandwichReceipt);

    }

}
