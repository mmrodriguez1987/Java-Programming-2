package chapter3.exercise4;

import java.util.Scanner;

/**
 *
 * @author Marcos Rodriguez
 * Extending from the first class to don't duplicate code
 */
public class NumbersDemo2 extends NumbersDemo {
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
        
        System.out.print("Twice the number: \n");
        System.out.print("displayTwiceTheNumber X: " + displayTwiceTheNumber(x) + "\n");
        System.out.print("displayTwiceTheNumber Y:" + displayTwiceTheNumber(y) + "\n");
        System.out.print("Number plus 5: \n");
        System.out.print("displayNumberPlusFive X: " + displayNumberPlusFive(x) + "\n");
        System.out.print("displayNumberPlusFive Y:" + displayNumberPlusFive(y) + "\n");
        System.out.print("Number Squared: \n");
        System.out.print("displayNumberSquared X: " + displayNumberSquared(x) + "\n");
        System.out.print("displayNumberSquared Y:" + displayNumberSquared(y) + "\n");  
    }
    
}
