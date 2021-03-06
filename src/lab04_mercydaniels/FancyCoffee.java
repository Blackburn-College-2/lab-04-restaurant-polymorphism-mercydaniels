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
public class FancyCoffee extends Coffee {

    private Receipt fancyCoffeeReceipt = new Receipt();

    public FancyCoffee(String name, Size size, Money basePrice) {
        super(name, size, basePrice);
        
    }
/**
 * Adds syrups to internal receipt
 * @param orderable the syrup to be added
 */
    public void add(Orderable orderable) {
        fancyCoffeeReceipt.add(orderable);
    }
 /**
  * makes the reciept a string
  * @return syrupReceipt as String
  */
      public String receiptAsString() {
         String syrupReceipt = fancyCoffeeReceipt.prepare();
          return syrupReceipt;
    }

}
