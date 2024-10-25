package bhuvan;

import java.util.Scanner;

/**
 * This program reverses a given integer number.
 * The user inputs a number, and the program returns the reversed number.
 */
public class ReverseNumber {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt(); // Read input number from user
        int remainder, reverse = 0;
        
        // While loop to reverse the number by extracting each digit
        while (number != 0) {
            remainder = number % 10;          // Get the last digit
            reverse = reverse * 10 + remainder; // Build the reversed number
            number /= 10;                     // Remove the last digit from number
        }
        
        System.out.println("Reversed number: " + reverse); // Print the reversed number
        scanner.close(); // Close the scanner object
    }
}

/*
Expected Output:
Enter a number to reverse: 1234
Reversed number: 4321

Enter a number to reverse: 7890
Reversed number: 987

Enter a number to reverse: 5000
Reversed number: 5
*/
