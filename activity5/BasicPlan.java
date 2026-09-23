/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5;

/**
 *
 * @author User
 */
public class BasicPlan extends InternetPlan {

    // Constructor
    public BasicPlan(String planCode, String customerName,
                     int monthsSubscribed) {

        // Call the parent constructor
        // Basic Plan monthly fee = ₱999
        super(planCode, customerName, 999, monthsSubscribed);
    }

   
    @Override
    public double calculateMonthlyBill() {

        // 5% discount if subscribed for 6 months or more
        if (getMonthsSubscribed() >= 6) {
            return getMonthlyFee() * 0.95;
        }

        // No discount
        return getMonthlyFee();
    }

    
    @Override
    public String getSpeed() {
        return "50 Mbps";
    }

    
    @Override
    public String getPlanDescription() {
        return "Basic";
    }

    // Return the discount
    @Override
    public double getDiscount() {

        if (getMonthsSubscribed() >= 6) {
            return 0.05; // 5%
        }

        return 0;
    }
}

