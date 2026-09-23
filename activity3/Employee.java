/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity3;

/**
 *
 * @author User
 */
public class Employee {
    
    // Private properties - Encapsulation
    private String employeeId;
    private String name;
    private String position;
    private double hoursWorked;
    private double hourlyRate;

    // Constructor
    public Employee(String employeeId, String name, String position,
                    double hoursWorked, double hourlyRate) {

        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Getters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    // Setters
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Calculate gross pay
    public double calculateGrossPay() {

        if (hoursWorked <= 40) {
            return hoursWorked * hourlyRate;
        } else {
            double regularPay = 40 * hourlyRate;
            double overtimePay = calculateOvertimePay();

            return regularPay + overtimePay;
        }
    }

    // Calculate overtime pay
    public double calculateOvertimePay() {

        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            double overtimeRate = hourlyRate * 1.50;

            return overtimeHours * overtimeRate;
        }

        return 0;
    }

    // Calculate deduction
    public double calculateDeduction() {

        double grossPay = calculateGrossPay();

        if (grossPay <= 10000) {
            return grossPay * 0.05;
        } else {
            return grossPay * 0.10;
        }
    }

    // Calculate net pay
    public double calculateNetPay() {

        return calculateGrossPay() - calculateDeduction();
    }

    // Get employee classification
    public String getEmployeeClassification() {

        if (hoursWorked < 20) {
            return "Part-Time";
        } else if (hoursWorked <= 40) {
            return "Regular";
        } else {
            return "Overtime Worker";
        }
    }

    // Display payroll information
    public void displayPayroll() {

        double regularPay;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyRate;
        } else {
            regularPay = 40 * hourlyRate;
        }

        System.out.println("=========== EMPLOYEE PAYROLL ========");
        System.out.println();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Hourly Rate: P%.2f%n", hourlyRate);
        System.out.println();
        System.out.printf("Regular Pay: P%,.2f%n", regularPay);
        System.out.printf("Overtime Pay: P%,.2f%n", calculateOvertimePay());
        System.out.printf("Gross Pay: P%,.2f%n", calculateGrossPay());
        System.out.println();
        System.out.printf("Deduction: P%,.2f%n", calculateDeduction());
        System.out.printf("Net Pay: P%,.2f%n", calculateNetPay());
        System.out.println();
        System.out.println("Classification: " + getEmployeeClassification());
    }
}

