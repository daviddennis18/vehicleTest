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
public class Convertible extends Car{
    public boolean hardtop;
    
    public Convertible(String c, double f, boolean el, boolean hard){
        super(c, f, el);
        hardtop = hard;
    }
    
    public boolean getTop(){
        return(hardtop);
    }
    
    public String toString(){
        if(super.getElectric() && hardtop){
            return("This " + super.getColor() + " hardtop electric convertible has " + super.getFuel() + " kilowatt-hours left");
        }else if(super.getElectric() && !hardtop){
            return("This " + super.getColor() + " electric convertible has " + super.getFuel() + " kilowatt-hours left");
        }else if(!super.getElectric() && hardtop){
            return("This " + super.getColor() + " hardtop convertible has " + super.getFuel() + "L of gas left");
        }
        return("This " + super.getColor() + " convertible has " + super.getFuel() + "L of gas left");
    }
}
