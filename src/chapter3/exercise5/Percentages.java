package chapter3.exercise5;

/**
 *
 * @author mmrod
 */
public class Percentages {
    private static int x = 5, y = 2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Compute percent: \n");
        System.out.print(x + " is " + computePercent(x,y) + " of " + y);    
        
    }
    /**
     * Calculate percents
     * @param x first number
     * @param y second number
     * @return a double value 
     */
    public static double computePercent(double x, double y) {
        return (double)(x*100)/y;
    }
}
