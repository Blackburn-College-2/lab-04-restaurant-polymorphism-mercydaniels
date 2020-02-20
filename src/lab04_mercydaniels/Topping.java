/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04_mercydaniels;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;

/**
 *
 * @author mercy.daniels
 */
public class Topping implements Orderable {

    private String type;
    private Money price;

    public Topping(String type, Money price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public Money getPrice() {
        return price;
    }

    @Override
    public String getReceiptItem() {
        String toppingReceipt = type + "    " + price.getAmountString();
        return toppingReceipt;
    }

}
