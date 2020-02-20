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
public class Syrup implements Orderable{
private Money price = new Money(25.0);
private String flavor;

    public Syrup(String flavor) {
        
        this.flavor = flavor;
    }

    @Override
    public Money getPrice() {
        return this.price;
    }

    @Override
    public String getReceiptItem() {
        String receiptSyrup = flavor + "   " + price.getAmountString();
        return receiptSyrup;
    }
    
}
