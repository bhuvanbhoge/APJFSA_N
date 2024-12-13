// 2.Write a program to add elements to the HashMap given the key as integer and value data type is String
package bhuvan;
import java.util.*;

public class HashMapDemo {
    public static void main(String args[]) {
        // Create a HashMap with Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();
        
        // Add entries to the map
        map.put(1, "Tata");
        map.put(2, "Hyundai");
        map.put(3,"Suzuki");
        map.put(4, "Toyota");
        map.put(5, "Honda");
        map.put(6, "Volkswagon");
        map.put(null, null); // Null key and value are allowed in HashMap
        map.put(7, "Renaults");
        
        // Use generics for type safety, defining Set of Map.Entry for key-value pairs
        Set<Map.Entry<Integer, String>> s = map.entrySet();
        
        // Create an iterator to iterate over the entry set
        Iterator<Map.Entry<Integer, String>> it = s.iterator();
        
        // Iterating over the map using the iterator and printing each key-value pair
        while(it.hasNext()) {
            Map.Entry<Integer, String> me = it.next();
            System.out.println("Key: " + me.getKey() + ", Value: " + me.getValue());
        }
        
        // Another iteration method (this will not work after the first iteration as the iterator would have been exhausted)
        // Commented out because it would throw an exception since the iterator is already exhausted
        /*
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        */
        
        // Accessing the value for key 5 in the map
        System.out.println(map.get(5)); // Output: Honda
        
        // Printing the entire map
        System.out.println(map);
    }
}

/* Expected Output
 * Key: null, Value: null
Key: 1, Value: Tata
Key: 2, Value: Hyundai
Key: 3, Value: Suzuki
Key: 4, Value: Toyota
Key: 5, Value: Honda
Key: 6, Value: Volkswagon
Key: 7, Value: Renaults
Honda
{null=null, 1=Tata, 2=Hyundai, 3=Suzuki, 4=Toyota, 5=Honda, 6=Volkswagon, 7=Renaults}
*/
