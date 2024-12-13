//1.Create a Student class and create an array list to add 10 student objects and print them using a for each loop.
package bhuvan;
import java.util.*;

public class ArrayListDemo {
	public static void main(String Args[]) {
		ArrayList<String> student = new ArrayList<>();
		
		// Add 10 student names to the ArrayList
		student.add("Adi");
		student.add("Bhuvan");
		student.add("Chandra");
		student.add("Digambar");
		student.add("Eknath");
		student.add("Falgun");
		student.add("Gukesh");
		student.add("Hetal");
		student.add("Ishwar");
		student.add("Jignesh");

		// Use a for-each loop to iterate through the ArrayList and print each student name
		for(String s : student) {
			System.out.println(s); // Prints each student's name
		}
	}
}

/* Expected output
Adi
Bhuvan
Chandra
Digambar
Eknath
Falgun
Gukesh
Hetal
Ishwar
Jignesh
 */