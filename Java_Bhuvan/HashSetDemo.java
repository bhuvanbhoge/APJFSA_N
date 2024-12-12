//

package bhuvan;
import java.util.*;

public class HashSetDemo {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Banana");
		set.add("Apple");
		set.add("Guava");
		set.add("Mango");
		
		System.out.println("Set : " + set);
		
		set.add("Grapes");
		System.out.println("Is Empty : " + set.isEmpty());
		System.out.println("Contains \"Mango\" in set : " + set.contains("Mango"));
		
		System.out.println("Now one by one traverse");
		String a[] = set.toArray(new String[set.size()]);
		for(String s : a) {
			System.out.println(s);
		}
		System.out.println();
		
		
		System.out.println("Now Set : " + set);
		
	}
}



/*Expectedd output
 * Set : [Guava, Apple, Mango, Banana]
Is Empty : false
Contains "Mango" in set : true
Now one by one traverse
Guava
Apple
Grapes
Mango
Banana

Now Set : [Guava, Apple, Grapes, Mango, Banana]
*/
