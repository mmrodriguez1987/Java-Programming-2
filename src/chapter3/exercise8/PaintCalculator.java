package chapter3.exercise8;

import java.util.Scanner;


/**
 *
 * @author Marcos Rodriguez
 */
public class PaintCalculator {
    private static double height, width, length, area, galUsed, price;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Paint Calculator: \n");
        System.out.print("Height: ");       
        height = s.nextDouble();
        System.out.print("Width: ");       
        width = s.nextDouble();
        System.out.print("Length: ");       
        length = s.nextDouble();
        
        
        area = calculateWallArea(width, height, length);
        galUsed = calculateGallonsUsed(area);
        price = calculatePrice(galUsed);
        
        
        System.out.print("Results: \n");
        System.out.print("The painted area covered wil be: " + area + " square feets\n");
        System.out.print("The Job will use: " + galUsed + " Gal to paint the room\n");
        System.out.print("The Total Cost will be: $" + price + " for the job");
    }
    
    public static double calculateWallArea(double w, double h, double l) {
        return 2 *(l *h) + 2 * (l * w);
    }
    
    public static double calculateGallonsUsed(double areaInFeets) {
        return areaInFeets/350;
    }
    
    public static double calculatePrice(double gallonsUsed) {
        return Math.ceil(gallonsUsed) * 32;
    }
}
