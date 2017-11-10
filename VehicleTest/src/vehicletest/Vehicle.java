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
public abstract class Vehicle {
    private String color;
    private double fuel;
    
    public Vehicle(String c, double f){
        color = c;
        fuel = f;
    }
    
    public double getFuel(){
        return(fuel);
    }
    
    public String getColor(){
        return(color);
    }
    
    public abstract String toString();
}
