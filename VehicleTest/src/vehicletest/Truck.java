/*
* David Dennis
* November 10th 2017
* To create truck objects
*/

package vehicletest;

/**
 *
 * @author daden2468
 */
public class Truck extends Vehicle{
    private String bedType;
    private String cabType;
    
    
    /**
     * Truck constructor
     * pre: none
     * post: a truck is constructed
     */
    public Truck(String c, double f, String bT, String cT){
        super(c,f);
        bedType = bT;
        cabType = cT;
    }
    
    /**
     * Gets bedType
     * pre: none
     * post: returns the type of bed 
     */
    public String getBed(){
        return(bedType);
    }
    
    /**
     * Gets cabType
     * pre: none
     * post: returns the type of cab 
     */
    public String getCab(){
        return(cabType);
    }
    
    /**
     * Returns all the info for the truck
     * pre: none
     * post: returns the string of the truck info 
     */
    public String toString(){
        return("This " + super.getColor() + " truck has a " + cabType + " cab, and a " + bedType +
                " bed, and has " + super.getFuel() + "L of gas left");
    }
}
