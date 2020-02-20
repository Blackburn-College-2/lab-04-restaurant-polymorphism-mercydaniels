/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04_mercydaniels;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;
import java.util.ArrayList;

/**
 *
 * @author mercy.daniels
 */
public class Sandwich implements Orderable {

    private Money basePrice;

    private ArrayList contents = new ArrayList();

    public Sandwich(Money basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public Money getPrice() {
        return basePrice;
    }

    @Override
    public String getReceiptItem() {
        String sandwichReceipt = null;
        return sandwichReceipt;
    }

}
