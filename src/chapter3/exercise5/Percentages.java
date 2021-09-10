package chapter3.exercise5;

/**
 *
 * @author mmrod
 */
public class Percentages {
    private static int x = 10, y = 5;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Compute percent: \n");
        System.out.print(y + " is " + computePercent(x,y) + " of " + x + "\n");    
        
    }
    /**
     * Calculate percents
     * @param x first number
     * @param y second number
     * @return a double value 
     */
    public static double computePercent(double x, double y) {
        return (double)(y*100)/x; //Wrong formula
    }
}
