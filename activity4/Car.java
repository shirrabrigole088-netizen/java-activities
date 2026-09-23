/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity4;

/**
 *
 * @author User
 */
public class Car extends Vehicle{
  
    public Car(String vehicleId, String brand, String model, int rentalDays) {
        super(vehicleId, brand, model, rentalDays);
    }

    @Override
    public double calculateRental() {
        double cost = 1500 * rentalDays;

        if (rentalDays >= 7) {
            cost = cost - (cost * 0.10);
        }

        return cost;
    }
}

