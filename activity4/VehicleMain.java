/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity4;

/**
 *
 * @author User
 */
public class VehicleMain {
    public static void main(String[] args) {
        
        Vehicle[] vehicles = {
            new Car("C001", "Toyota", "Vios", 7),
            new Motorcycle("M001", "Honda", "Click 125", 3),
            new Van("V001", "Toyota", "Hiace", 2)
        };

        System.out.println("================ VEHICLE RENTAL =========================");

        for (Vehicle vehicle : vehicles) {
            System.out.println();
            vehicle.display();
        }
    }
}
    
