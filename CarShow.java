/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshow;

/**
 *
 * @author FelembanAM
 */
public class CarShow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car c1 = new Car();  // create object
        c1.SetColor("red"); // access the object
        c1.PrintCarColor();
        Car.NumberOfCars = 9; // Access to class varaible 
        System.out.println(Car.brand);
        
    }
    
}
