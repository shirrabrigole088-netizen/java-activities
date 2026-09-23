/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity3;

/**
 *
 * @author User
 */
public class EmployeeMainClass {
  public static void main(String[] args) {

        // Create Employee object
        Employee employee = new Employee(
            "E-001",
            "Shirra Brigole",
            "Programmer",
            45,
            250
        );

        // Display payroll
        employee.displayPayroll();
    }
}
