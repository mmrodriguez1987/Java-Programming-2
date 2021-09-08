package chapter3.exercise5;

import java.util.Scanner;

/**
 * @author Marcos Rodriguez
 */
public class Percentages2 extends Percentages{
    private static int x, y;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter the value for X: ");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        System.out.print("Please enter the value for y: ");
        y = s.nextInt();  
        System.out.print("Compute percent: \n");
        System.out.print(x + " is " + computePercent(x,y) + " of " + y);  
    }
}
