package chapter3.exercise4;

/**
 *
 * @author Marcos Rodriguez
 */
public class NumbersDemo {

    private static int x = 5, y = 2;
    public static void main(String[] args) {
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
    /**
     * Display the Twice of the number
     * @param number The number to make the twice
     * @return response in integer
     */
    public static int displayTwiceTheNumber(int number) {
        return number * 2;
    }
    
    /**
     * Display the Number plus 5
     * @param number The number to make make the addition.
     * @return response in integer
     */
    public static int displayNumberPlusFive(int number) {
        return number + 5;
    }
    
    /**
     * Display the number squared
     * @param number The number to make squared
     * @return response in double
     */
    public static double displayNumberSquared(int number) {    
        return Math.pow((double)number, 2);
    }    
}
