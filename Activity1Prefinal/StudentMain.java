/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1Prefinal;

/**
 *
 * @author User
 */
public class StudentMain {
    public static void main(String[] args) {
         // Create Student object
        Student student = new Student(
            "2026-001",
            "Shirra S. Brigole",
            "BSIT",
            85,
            88,
            91
        );

        // Display information
        student.displayStudentInfo();
    }
}
