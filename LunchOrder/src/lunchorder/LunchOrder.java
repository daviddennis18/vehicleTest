/*
 * David Dennis
 * November 2nd 2017
 * To fill a lunch order, and determine the cost
 */


package lunchorder;
import java.util.Scanner;
/**
 * this class creates food objects and determines the cost of your lunch order 
 */
public class LunchOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ham, sal, fri, sod;
        Scanner s = new Scanner(System.in);
        Food hamburger  = new Food("Hamburger",1.85,9.0,33,1);
        Food salad  = new Food("Salad",2.00,1,11,5);
        Food fries = new Food("French Fries",1.30,11,36,4);
        Food soda = new Food("Soda",0.95,0,38,0);
        
        System.out.println("How many hamburgers would you like: ");
        ham = s.nextInt();
        System.out.println(hamburger.toString());
        System.out.println("How many Salads would you like: ");
        sal = s.nextInt();
        System.out.println(salad.toString());
        System.out.println("How many French Fries would you like: ");
        fri = s.nextInt();
        System.out.println(fries.toString());
        System.out.println("How many Sodas would you like: ");
        sod = s.nextInt();
        System.out.println(soda.toString());
        
        System.out.println("Your order comes to: " + (hamburger.getCost(ham)+salad.getCost(sal)+fries.getCost(fri)+soda.getCost(sod)) );
        
    }
    
    
    
}
