/*
* David Dennis
* November 10th 2017
* To create vehicle objects
*/

package vehicletest;

/**
 *
 * @author daden2468
 */
public abstract class Vehicle {
    private String color;
    private double fuel;
    
    
    /**
     * Mini van constructor - abstract
     */
    public Vehicle(String c, double f){
        color = c;
        fuel = f;
    }
    
    
    /**
     * Gets fuel
     * pre: none
     * post: returns the amount of fuel 
     */
    public double getFuel(){
        return(fuel);
    }
    
    /**
     * Gets color
     * pre: none
     * post: returns the color 
     */
    public String getColor(){
        return(color);
    }
    
    /**
     * returns a string - abstract 
     */
    public abstract String toString();
}
