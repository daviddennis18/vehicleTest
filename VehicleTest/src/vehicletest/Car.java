/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicletest;

/**
 *
 * @author daden2468
 */
public abstract class Car extends Vehicle{
    public boolean electric;
    
    public Car(String c, double f, boolean el){
        super(c, f);
        electric = el;
    }
    
    public boolean getElectric(){
        return(electric);
    }
    
    public abstract String toString();
}
