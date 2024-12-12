// create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.[Hint: Use array and loop and try to access the element beyond the last index]
package bhuvan;

public class ArrayIndexOUtOfBoundDemo {
	    public static void main(String[] args) {
	        // Initialize an array with some elements
	        int[] numbers = {10, 20, 30, 40, 50};

	        System.out.println("Accessing elements in the array:");

	        // Iterate through the array and deliberately go out of bounds
	        for (int i = 0; i <= numbers.length; i++) { // Note: Condition goes out of bounds
	            try {
	                // Access the array element
	                System.out.println("Element at index " + i + ": " + numbers[i]);
	            } catch (ArrayIndexOutOfBoundsException e) {
	                // Handle the exception
	                System.out.println("Exception caught: Tried to access index " + i + " which is out of bounds!");
	            }
	        }

	        System.out.println("Program completed.");
	    }
	    

}

/* Expected output
Accessing elements in the array:
Element at index 0: 10
Element at index 1: 20
Element at index 2: 30
Element at index 3: 40
Element at index 4: 50
Exception caught: Tried to access index 5 which is out of bounds!
Program completed.
*/