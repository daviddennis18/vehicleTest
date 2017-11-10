/*
* David Dennis
* November 10th 2017
* To create car objects
*/

package vehicletest;

/**
 *
 * @author daden2468
 */
public abstract class Car extends Vehicle{
    public boolean electric;
    
    
    /**
     * Car constructor - abstract
     */
    public Car(String c, double f, boolean el){
        super(c, f);
        electric = el;
    }
    
    /**
     * Checks if the car is electric or not
     * pre: none
     * post: returns the fuel type of the car 
     */
    public boolean getElectric(){
        return(electric);
    }
    
    /**
     * returns a string - abstract 
     */
    public abstract String toString();
}
