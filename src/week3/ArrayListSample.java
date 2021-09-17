package week3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

    
    public static void main(String[] args) {
        ArrayList myArrayList = new ArrayList();
        
        myArrayList.add("One");
        myArrayList.add("Two");
        myArrayList.add("Three");
        myArrayList.add("Four");
        myArrayList.add("Five");
         
        myArrayList.forEach((x) -> System.out.println(x));
        
        List<String> myList2 = new ArrayList<String>();
        
        myList2.add("String 1\n");
        myList2.add("String 3\n");
        myList2.add("String 4\n");
        myList2.add("String 5\n");
        
        
        myList2.forEach((x) -> System.out.print(x));
           
    }
    
}
