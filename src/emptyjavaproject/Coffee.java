/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;
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
    @Override
    public String toString() {
       String coffeeInfo = name + size.toString() + basePrice.toString();
       return coffeeInfo;
    }

    @Override
    public Money getPrice() {
        return basePrice;
    }

    @Override
    public String getReceiptItem() {
        return name + "    " + basePrice.toString();
    }
    
}
