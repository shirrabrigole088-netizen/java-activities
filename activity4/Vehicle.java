/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity4;

/**
 *
 * @author User
 */
public class Vehicle {
    //Parent Class
    protected String vehicleId;
    protected String brand;
    protected String model;
    protected int rentalDays;

    public Vehicle(String vehicleId, String brand, String model, int rentalDays) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.rentalDays = rentalDays;
    }

    public double calculateRental() {
        return 0;
    }

    public void display() {
        System.out.println("Vehicle: " + getClass().getSimpleName());
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Days: " + rentalDays);
        System.out.printf("Rental Cost: P%,.2f%n", calculateRental());
        System.out.println();
    }
}


