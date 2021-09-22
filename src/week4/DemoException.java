package week4;

public class DemoException {   
    
    public static void main(String[] args) {
        int[] arrayDemo = new int[]{1,2,3,4,5};
        
        try {
          for(int i = 0; i <= arrayDemo.length; i++) {
            System.out.print("Element: " + i +  " has: " + arrayDemo[i]+ "\n");
          } 
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.print("Exception Catched, index out of bounds\n");
        }
        
        
    }
    
}
