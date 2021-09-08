package chapter3.exercise7;

import java.util.Scanner;

/**
 *
 * @author Marcos Rodriguez
 */
public class InchConversion {
    private static double inches;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter the value in Inch: ");
        Scanner s = new Scanner(System.in);
        inches = s.nextDouble();
        
        System.out.print("Inch Conversion Class: \n");
        System.out.print(inches + " inchs = " + inchesToFeets(inches) + " Feets\n");
        System.out.print(inches + " inchs = " + inchesToYards(inches) + " Yards\n");
        
    }
    
    /**
     * Convert inches to feet
     * @param inches value of inches
     * @return the value of feet
     */
    public static double inchesToFeets(double inches) {
        return  inches / 12;
    }
    
    /**
     * Convert inches to yards
     * @param inches value of inches
     * @return the value of feet
     */
    public static double inchesToYards(double inches) {
        return inches / 36;
    }
}
