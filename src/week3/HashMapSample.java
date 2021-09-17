
package week3;

import java.util.HashMap;


public class HashMapSample {
    
    
    public static void main(String[] args) {
        HashMap myHashMap = new HashMap();        
        myHashMap.put("John", 50000.90);        
        System.out.print(myHashMap.get("John"));
        
        HashMap <String, Double> myHashMap2 = new HashMap<>();
        myHashMap2.put("John", 5000.3);
    }
}
