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
public class Size extends Measurement {

    private String name;
    
    public Size(String name){
        this.name = name;
    }
    /**
     * gets the name of the size to differentiate between coffee items
     * @return name as String
     */
    public String getName(){
        return this.name;
    }
    /**
     * overrides toString to return the name of the size
     * @return 
     */
    @Override
    public String toString() {
        return name;
    }

}
