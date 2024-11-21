//1.Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.

package bhuvan;
import java.util.*;

public class ArithmeticExceptionHandling {
    public static void main(String args[]) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        try {
            // Prompt user for input
            System.out.println("Enter a number to divide 100 by : ");
            int divisor = sc.nextInt(); // Take divisor input from the user

            // Perform division
            int result = 100 / divisor;
            System.out.println("Result of division : " + result); // Print result if no exception occurs
        } 
        catch (ArithmeticException e) {
            // Catch and handle divide-by-zero exception
            System.out.println("Arithmetic Exception: Cannot divide by zero");
        }

        // Indicate program completion
        System.out.print("Program execution completed.");
    }
}

/* Expected output: 
Enter a number to divide 100 by : 
0
Arithmetic Exception: Cannot divide by zero
Program execution completed.
*/
