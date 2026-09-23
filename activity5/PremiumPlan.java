/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5;

/**
 *
 * @author User
 */
  
public class PremiumPlan extends InternetPlan {

    // Constructor
    public PremiumPlan(String planCode, String customerName,
                       int monthsSubscribed) {

        // Premium Plan monthly fee = ₱2,499
        super(planCode, customerName, 2499, monthsSubscribed);
    }

    
    @Override
    public double calculateMonthlyBill() {

        // 15% discount if subscribed for 12 months or more
        if (getMonthsSubscribed() >= 12) {
            return getMonthlyFee() * 0.85;
        }

        // No discount
        return getMonthlyFee();
    }

    
    @Override
    public String getSpeed() {
        return "300 Mbps";
    }

    
    @Override
    public String getPlanDescription() {
        return "Premium";
    }

    // Return the discount
    @Override
    public double getDiscount() {

        if (getMonthsSubscribed() >= 12) {
            return 0.15; // 15%
        }

        return 0;
    }
}

