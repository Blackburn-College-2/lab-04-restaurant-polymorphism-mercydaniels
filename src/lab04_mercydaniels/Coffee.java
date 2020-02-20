/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04_mercydaniels;
import edu.blackburn.cs.cs212.restaurantbase.*;
/**
 *
 * @author mercy.daniels
 */
public class Coffee extends MenuItem {
    String name;
    Size size;
    Money basePrice;
    public Coffee(String name, Size size, Money basePrice){
        super(name, basePrice);
        this.name = name;
        this.basePrice = basePrice;
        this.size = size;
    }
    /**
     * Overrides toString to return the name, size, and price of the coffee.
     * @return coffeeInfo as a String
     */
    @Override
    public String toString() {
       String coffeeInfo = name + size.toString() + basePrice.toString();
       return coffeeInfo;
    }
/**
 * Overrides getPrice to return the price of the coffee item
 * @return basePrice as money
 */
    @Override
    public Money getPrice() {
        return basePrice;
    }
/**
 * Override getReceiptItem to return the name and the price as a Receipt item
 * @return name and price as String
 */
    @Override
    public String getReceiptItem() {
        return name + "    " + basePrice.toString();
    }
    
}
