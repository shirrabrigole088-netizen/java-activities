/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5;

/**
 *
 * @author User
 */
public class MainClass {
    public static void main(String[] args) {

        InternetPlan[] plans = {

            new BasicPlan(
                "B001",
                "Shirra Brigole",
                6
            ),

            new StandardPlan(
                "S001",
                "Princes May Opano",
                12
            ),

            new PremiumPlan(
                "P001",
                "Eden Dape",
                15
            )
        };

        // Display title
        System.out.println("========= INTERNET SUBSCRIPTION =======");

        // Loop through all InternetPlan objects
        for (InternetPlan plan : plans) {

            System.out.println();

            // Display information
            // The correct overridden methods are called
            plan.displayInfo();

            System.out.println("---------------------------------------");
        }
    }
}

