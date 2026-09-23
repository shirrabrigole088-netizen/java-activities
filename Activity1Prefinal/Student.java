/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1Prefinal;

/**
 *
 * @author User
 */
public class Student {
    private String studentId;
    private String name;
    private String course;
    private double prelimGrade;
    private double midtermGrade;
    private double finalGrade;

    public Student(String studentId, String name, String course, double prelimGrade, double midterGrade, double finalGrade) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.prelimGrade = prelimGrade;
        this.midtermGrade = midterGrade;
        this.finalGrade = finalGrade;
    }
    //Getter and Setter
    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getPrelimGrade() {
        return prelimGrade;
    }

    public void setPrelimGrade(double prelimGrade) {
        this.prelimGrade = prelimGrade;
    }

    public double getMidterGrade() {
        return midtermGrade;
    }

    public void setMidterGrade(double midterGrade) {
        this.midtermGrade = midterGrade;
    }
    
    public double calculateAverage() { 
        return(prelimGrade + midtermGrade + finalGrade) / 3; }
    
    public String getClassification() { 
        double average = calculateAverage(); 
        if (average >= 90){ 
            return "Excellent"; 
        } else if (average >= 85){ 
            return "Very Good"; 
        } else if (average >= 80) { 
            return "Good"; 
        } else if (average >= 75) { 
            return "Passing"; 
        } else { 
            return "Failed"; 
        }
        
    }
    
    public void displayStudentInfo() {

        double average = calculateAverage();

        System.out.println("========= STUDENT INFORMATION =========");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println();
        System.out.println("Prelim Grade: " + prelimGrade);
        System.out.println("Midterm Grade: " + midtermGrade);
        System.out.println("Final Grade: " + finalGrade);
        System.out.println();
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Classification: " + getClassification());

        if (average >= 75) {
            System.out.println("Status: PASSED");
        } else {
            System.out.println("Status: FAILED");
        }
    }
}
