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
public class VehicleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertible hondaFit = new Convertible("red", 20, true, false);
        Minivan momVan = new Minivan("grey", 30, true, 6, "sliding");
        Truck dodge = new Truck("black", 60, "full", "short");
        
        System.out.println(hondaFit);
        System.out.println(momVan);
        System.out.println(dodge);
        
    }
    
}
