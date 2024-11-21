//2.Write a program demonstrating multiple catch statements and finally block.

package bhuvan;

import java.util.*;

public class TryCatchExceptionHandling {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        try {
            // Prompt user for divisor input
            System.out.println("Enter a number to divide 100 by : ");
            int divisor = sc.nextInt();
            int result = 100 / divisor; // Perform division

            // Prompt user for array index input
            int number[] = new int[5]; // Array with 5 elements
            System.out.println("Enter an index to access: ");
            int index = sc.nextInt();

            // Access array element at given index
            System.out.println("Number at index " + index + ": " + number[index]);
            System.out.println("Result of division: " + result);
        } 
        // Catch block for arithmetic exception
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        } 
        // Catch block for array index out of bounds exception
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: Invalid index.");
        } 
        // Catch block for invalid number format (e.g., non-integer input)
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception: Please enter a valid integer.");
        } 
        // Catch block for input mismatch (e.g., non-numeric input)
        catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception: Please enter a valid integer.");
        } 
        finally {
            // Ensure resources are released or final actions executed
            sc.close(); // Close scanner to prevent resource leaks
            System.out.println("Program execution completed."); // Program completion message
        }
    }
}

/* Expected output: 
 Enter a number to divide 100 by : 
 1
 Enter an index to access : 
 22
 Array Index Out Of Bounds Exception: Invalid index.
 Program execution completed.
*/
