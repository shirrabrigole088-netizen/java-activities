/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2;

/**
 *
 * @author User
 */
public class WaterBill {
    // Private properties - Encapsulation
    private String accountNumber;
    private String customerName;
    private String customerType;
    private double previousReading;
    private double currentReading;

    // Constructor
    public WaterBill(String accountNumber, String customerName,
                     String customerType, double previousReading,
                     double currentReading) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerType = customerType;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    // Calculate consumption
    public double calculateConsumption() {
        return currentReading - previousReading;
    }

    // Get rate based on customer type and consumption
    public double getRate() {

        double consumption = calculateConsumption();

        if (customerType.equalsIgnoreCase("Residential")) {

            if (consumption <= 10) {
                return 15;
            } else if (consumption <= 20) {
                return 18;
            } else {
                return 22;
            }

        } else if (customerType.equalsIgnoreCase("Commercial")) {

            if (consumption <= 10) {
                return 20;
            } else if (consumption <= 20) {
                return 25;
            } else {
                return 30;
            }
        }

        return 0;
    }

    // Calculate total bill
    public double calculateBill() {
        return calculateConsumption() * getRate();
    }

    // Get consumption classification
    public String getClassification() {

        double consumption = calculateConsumption();

        if (consumption > 20) {
            return "High Consumption";
        } else if (consumption >= 11) {
            return "Moderate Consumption";
        } else {
            return "Low Consumption";
        }
    }

    // Display water bill
    public void displayBill() {

        System.out.println("=============== WATER BILL ===================");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Type: " + customerType);
        System.out.println();
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.printf("Consumption: %.0f m^3 %n", calculateConsumption());
        System.out.println();
        System.out.printf("Rate: P%.2f%n", getRate());
        System.out.printf("Total Bill: P%.2f%n", calculateBill());
        System.out.println();
        System.out.println("Classification: " + getClassification());

        // Warning if consumption is greater than 30
        if (calculateConsumption() > 30) {
            System.out.println("WARNING: HIGH WATER CONSUMPTION");
        }
        System.out.println("=================================================");
        System.out.println();
    }
}

