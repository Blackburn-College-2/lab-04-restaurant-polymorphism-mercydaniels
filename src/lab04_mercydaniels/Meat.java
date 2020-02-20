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
public class Meat implements Orderable{
 private Money price;
 private String name;

    public Meat(Money price, String name) {
        this.price = price;
        this.name = name;
    }
 
    @Override
    public Money getPrice() {
        return price;
    }

    @Override
    public String getReceiptItem() {
        String meatReceipt = name + "   " + price.getAmountString();
        return meatReceipt;
    }
    
}
