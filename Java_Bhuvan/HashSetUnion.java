//Union of Two Sets hashset
package bhuvan;
import java.util.*;

public class HashSetUnion {
	public static void main(String args[]) {
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		
		set1.add("A");
		set1.add("B");
		set1.add("C");
		
		set2.add("D");
		set2.add("B");
		set2.add("C");
		
		System.out.println("Set 1 : "+ set1);
		System.out.println("Set 2 : "+ set2);
		
		HashSet<String> unionSet = new HashSet<>(set1);
		unionSet.addAll(set2);
		System.out.println("Union of Set 1 & 2 : "+ unionSet);
	}
}

/* Expected output:
Set 1 : [A, B, C]
Set 2 : [B, C, D]
Union of Set 1 & 2 : [A, B, C, D]
*/