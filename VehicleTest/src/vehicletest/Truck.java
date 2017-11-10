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
public class Truck extends Vehicle{
    private String bedType;
    private String cabType;
    
    public Truck(String c, double f, String bT, String cT){
        super(c,f);
        bedType = bT;
        cabType = cT;
    }
    
    public String getBed(){
        return(bedType);
    }
    
    public String getCab(){
        return(cabType);
    }
    
    public String toString(){
        return("This " + super.getColor() + " truck has a " + cabType + " cab, and a " + bedType +
                " bed, and has " + super.getFuel() + "L of gas left");
    }
}
