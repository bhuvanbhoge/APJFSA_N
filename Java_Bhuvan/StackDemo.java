// Stack: Store 10 elements and remove 4 elements
package bhuvan;
import java.util.*;


public class StackDemo {
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<>();
		
		for(int i=1; i<= 10;i++) {
			s.push(i);
		}
		System.out.println("Inserted elements in Stack \n" + s);
		
		for(int i=1; i<=4;i++) {
			s.pop();
		}
		System.out.println("Popped (removed) elements in Stack \n" + s);
	}

}

/* Expected output:
Inserted elements in Stack 
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Popped (removed) elements in Stack 
[1, 2, 3, 4, 5, 6]
*/