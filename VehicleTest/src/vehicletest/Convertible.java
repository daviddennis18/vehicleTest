/*
* David Dennis
* November 10th 2017
* To create convertible objects
*/

package vehicletest;

/**
 *
 * @author daden2468
 */
public class Convertible extends Car{
    public boolean hardtop;
    
    
    /**
     * Convertible constructor
     * pre: none
     * post: a convertible is constructed
     */
    public Convertible(String c, double f, boolean el, boolean hard){
        super(c, f, el);
        hardtop = hard;
    }
    
    /**
     * Checks if the convertible is hardtop
     * pre: none
     * post: returns the type of roof 
     */
    public boolean getTop(){
        return(hardtop);
    }
    
    /**
     * Returns all the info for the convertible
     * pre: none
     * post: returns the string of the convertible info 
     */
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
