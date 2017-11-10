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
public class Minivan extends Car{
    private int numSeats;
    private String doors;
    
    public Minivan(String c, double f, boolean el, int seats, String doors){
        super(c, f, el);
        numSeats = seats;
        this.doors = doors;
    }
    
    public int getSeats(){
        return(numSeats);
    }
    
    public String toString(){
        if(super.getElectric()){
            return("This " + super.getColor() + ", " + numSeats + " seat, " + doors + " door minivan has " + super.getFuel() + " kilowatt-hours left");
        }
        return("This " + super.getColor() + ", " + numSeats + " seat, " + doors + " door minivan has " + super.getFuel() + "L of gas left");
    }
}
