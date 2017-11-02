/*
 * David Dennis
 * November 2nd 2017
 * to create food objects for the lunchorder class
 */

package lunchorder;

/**
 * This class creates food objects for the lunchOrder class
 * Author: David Dennis
 */
public class Food {
    final private double cost;
    final private double fat;
    final private double carbs;
    final private double fiber;
    final private String name;
    
    
    /**
     * Constructor for the Food class
     */
    Food(String newName, double co, double f, double c, double fi){
        cost = co;
        fat = f;
        carbs = c;
        fiber = fi;
        name = newName;
    }
    /**
     * This returns the total cost for the number of things you want
     * pre: object must be created
     * post: returns the total cost of the number of food you wanted
     */
    public double getCost(int num){
        double totalCost = (double)cost*num;
        return(totalCost);
    }
    
    /**
     * This overrides the toString method and sets it to the output we want
     * pre: none
     * post: returns the correct String back
     */
    public String toString(){
        
        String foodString = "";
        foodString = foodString + "Each " + name + " has " + fat + "g of fat, " 
                + carbs + "g of carbs, and " + fiber + "g of fiber.";
        return(foodString);
    }
}
