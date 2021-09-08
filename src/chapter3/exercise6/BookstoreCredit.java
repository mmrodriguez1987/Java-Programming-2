package chapter3.exercise6;

import java.util.Scanner;

/**
 *
 * @author Marcos Rodriguez
 */
public class BookstoreCredit {
    public static String studentName;
    public static double studentGrade;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter the value for X: ");
        Scanner s = new Scanner(System.in);
        studentName = s.nextLine();
        System.out.print("Please enter the value for y: ");
        studentGrade = s.nextDouble();
        
        System.out.print("Bookstor Credit Calculator:");
        System.out.print("The Student: " + studentName + " with grade " + studentGrade + 
                        " has a credit of $"+ calculateCredit(studentGrade) + 
                        " in the BookStore");        
    }
    
    /**
     * Calculate the credit for a student
     * @param grade grade of student
     * @return return the value of the credit in double
     */
    public static double calculateCredit(double grade) {
        return grade * 10;
    }
    
}
