/*
* David Dennis
* November 10th 2017
* To create minivan objects
*/

package vehicletest;

/**
 *
 * @author daden2468
 */
public class Minivan extends Car{
    private int numSeats;
    private String doors;
    
    /**
     * Mini van constructor
     * pre: none
     * post: a mini van is constructed
     */
    public Minivan(String c, double f, boolean el, int seats, String doors){
        super(c, f, el);
        numSeats = seats;
        this.doors = doors;
    }
    
    /**
     * returns the number of seats
     * pre: none
     * post: returns the number of seats 
     */
    public int getSeats(){
        return(numSeats);
    }
    
    /**
     * Returns all the info for the mini van
     * pre: none
     * post: returns the string of the mini van info 
     */
    public String toString(){
        if(super.getElectric()){
            return("This " + super.getColor() + ", " + numSeats + " seat, " + doors + " door minivan has " + super.getFuel() + " kilowatt-hours left");
        }
        return("This " + super.getColor() + ", " + numSeats + " seat, " + doors + " door minivan has " + super.getFuel() + "L of gas left");
    }
}
