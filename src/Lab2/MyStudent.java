/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author mmrod
 */
public class MyStudent  {
    private static String studentName, studentID;
    private static double averageGrade;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
       
        Scanner s = new Scanner(System.in);
        System.out.print("Student Name: ");
        studentName = s.nextLine();
        System.out.print("Student ID: ");
        studentID = s.nextLine();
        System.out.print("Student Average Grade: ");
        averageGrade = s.nextDouble();
        
        Student student = new Student(studentName, studentID, averageGrade);
       
        System.out.print("LAB 1 Student Class GP Calculator\n");
        System.out.print("The Student " 
                + Student.getName() 
                + " with Student ID: " 
                + Student.getId() + "\n"
                + "AverageGrade = " + averageGrade + " have a GPA = " + Student.getGPA());
      
    }
    
}
