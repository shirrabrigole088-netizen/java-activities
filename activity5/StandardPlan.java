/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5;

/**
 *
 * @author User
 */
 public class StandardPlan extends InternetPlan {

    // Constructor
    public StandardPlan(String planCode, String customerName,
                        int monthsSubscribed) {

        // Standard Plan monthly fee = ₱1,499
        super(planCode, customerName, 1499, monthsSubscribed);
    }

    
    @Override
    public double calculateMonthlyBill() {

        // 10% discount if subscribed for 12 months or more
        if (getMonthsSubscribed() >= 12) {
            return getMonthlyFee() * 0.90;
        }

        // No discount
        return getMonthlyFee();
    }

    
    @Override
    public String getSpeed() {
        return "100 Mbps";
    }

    
    @Override
    public String getPlanDescription() {
        return "Standard";
    }

    // Return the discount
    @Override
    public double getDiscount() {

        if (getMonthsSubscribed() >= 12) {
            return 0.10; // 10%
        }

        return 0;
    }
}

