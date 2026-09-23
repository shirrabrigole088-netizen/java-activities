/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5;

/**
 *
 * @author User
 */
public class InternetPlan {
    // Private attributes for encapsulation
    private String planCode;
    private String customerName;
    private double monthlyFee;
    private int monthsSubscribed;

    // Constructor
    public InternetPlan(String planCode, String customerName,
                        double monthlyFee, int monthsSubscribed) {

        this.planCode = planCode;
        this.customerName = customerName;
        this.monthlyFee = monthlyFee;
        this.monthsSubscribed = monthsSubscribed;
    }

    // Getter for plan code
    public String getPlanCode() {
        return planCode;
    }

    // Getter for customer name
    public String getCustomerName() {
        return customerName;
    }

    // Getter for monthly fee
    public double getMonthlyFee() {
        return monthlyFee;
    }

    // Getter for months subscribed
    public int getMonthsSubscribed() {
        return monthsSubscribed;
    }

    // Setter for plan code
    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    // Setter for customer name
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Setter for monthly fee
    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    // Setter for months subscribed
    public void setMonthsSubscribed(int monthsSubscribed) {
        this.monthsSubscribed = monthsSubscribed;
    }

    // Method that will be overridden by child classes
    public double calculateMonthlyBill() {
        return monthlyFee;
    }

    // Method that will be overridden
    public String getSpeed() {
        return "Unknown";
    }

    // Method that will be overridden
    public String getPlanDescription() {
        return "Internet Plan";
    }

    // Returns the discount percentage
    public double getDiscount() {
        return 0;
    }

    // Determines the customer's classification
    public String getClassification() {

        if (monthsSubscribed >= 12) {
            return "LONG-TERM SUBSCRIBER";
        } else {
            return "REGULAR SUBSCRIBER";
        }
    }

    // Displays the plan information
    public void displayInfo() {

        System.out.println("Customer: " + customerName);
        System.out.println("Plan: " + getPlanDescription());
        System.out.println("Speed: " + getSpeed());

        System.out.printf("Monthly Fee: P%,.2f%n", monthlyFee);

        System.out.println("Months Subscribed: " + monthsSubscribed);

        System.out.printf("Discount: %.0f%%%n",
                getDiscount() * 100);

        System.out.printf("Monthly Bill: P%,.2f%n",
                calculateMonthlyBill());

        System.out.println("Classification: " + getClassification());
    }
}

