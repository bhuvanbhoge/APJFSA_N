//3.Write a program using exception handling to handle array index out of bounds
package bhuvan;

import java.util.*;

public class ArrayIndexOutOfBoundExceptionHandling {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        try {
            // Prompt user to enter a divisor
            System.out.println("Enter a number to divide 100 by: ");
            int divisor = sc.nextInt(); // Take divisor input
            int result = 100 / divisor; // Perform division

            // Prompt user to enter an array index
            int number[] = new int[5]; // Declare an array with 5 elements
            System.out.println("Enter an index to access: ");
            int index = sc.nextInt(); // Take array index input

            // Access the array element at the given index
            System.out.println("Number at index " + index + ": " + number[index]);
            System.out.println("Result of division: " + result);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid array index access
            System.out.println("Array Index Out Of Bounds Exception: Invalid index.");
        } 
        finally {
            // Ensure resources are released or final actions executed
            sc.close(); // Close the scanner
        }

        // Indicate program completion
        System.out.println("Program execution completed.");
    }
}

/*
Expected output:
Enter a number to divide 100 by: 
1
Enter an index to access: 
22
Array Index Out Of Bounds Exception: Invalid index.
Program execution completed.
*/
