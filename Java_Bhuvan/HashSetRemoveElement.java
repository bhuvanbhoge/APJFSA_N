//3. Write a Java program to remove all elements from a hash set.
package bhuvan;
import java.util.*;

public class HashSetRemoveElement {
    public static void main(String args[]) {
        // Create a HashSet and add elements
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(7);
        set.add(15);
        set.add(31);
        
        // Print the initial set
        System.out.println("Initial set: " + set);
        
        // Use the clear method to remove all elements from the set
        set.clear();
        System.out.println("After clear method use \n" + set);
        
        // Re-enter elements into the set
        set.add(1);
        set.add(3);
        set.add(7);
        set.add(15);
        set.add(31);
        
        // Print a message before starting the removal process
        System.out.println("Now we will remove elements one by one from the set FIFO:");
        
        // Create an iterator to iterate through the set
        Iterator<Integer> it = set.iterator();
        
        // Iterate over the set and remove elements one by one
        while(it.hasNext()) {
            Integer element = it.next();
            System.out.println("Removing " + element);
            it.remove(); // Remove the current element
            System.out.println("Set after removal: " + set);
        }
    }
}

/* Expected output
Initial set: [1, 3, 7, 15, 31]
After clear method use 
[]
Now we will remove elements one by one from the set FIFO:
Removing 1
Set after removal: [3, 7, 15, 31]
Removing 3
Set after removal: [7, 15, 31]
Removing 7
Set after removal: [15, 31]
Removing 15
Set after removal: [31]
Removing 31
Set after removal: []

 */


