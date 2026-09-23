/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2;

/**
 *
 * @author User
 */
public class MainClass {
      public static void main(String[] args) {

        // Create 3 WaterBill objects
        WaterBill customer1 = new WaterBill(
            "W-1001",
            "Eden Dape",
            "Residential",
            120,
            145
        );

        WaterBill customer2 = new WaterBill(
            "W-1002",
            "Princes May Opano",
            "Commercial",
            200,
            215
        );

        WaterBill customer3 = new WaterBill(
            "W-1003",
            "Shirra Brigole",
            "Residential",
            300,
            335
        );

        // Display bills
        customer1.displayBill();
        customer2.displayBill();
        customer3.displayBill();
    }
}
