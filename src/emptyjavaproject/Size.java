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
public class Size extends Measurement {

    private String name;
    
    public Size(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return name;
    }

}
