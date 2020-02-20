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
/**
 * Overrides getprice to return the price of the sandwich
 * @return basePrice as type money
 */
    @Override
    public Money getPrice() {
        return basePrice;
    }
/**
 * Overrides getreceiptitem to get the receipt item for the sandwich
 * @return  sandwichReceipt as String
 */
    @Override
    public String getReceiptItem() {
        String sandwichReceipt = contents.toString();
        return sandwichReceipt;
    }
    /**
     * adds an orderable to the arraylist that consists of the ingredients of the sandwich
     * @param orderable topping or meat to be added
     */
    public void add(Orderable orderable){
        contents.add(orderable);
    }

}
