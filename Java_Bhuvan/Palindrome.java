package bhuvan;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int ogNumber = n; // Store the original number for comparison
        int rev = 0; // Variable to store the reversed number
        
        // Check for non-positive input
        if (n <= 0) {
            System.out.println("Given Number is Not Palindrome. Provide a valid positive number.");
        } else {
            // Calculate the reversed number
            while (n > 0) {
                int rem = n % 10; // Get the last digit
                rev = rev * 10 + rem; // Build the reversed number
                n /= 10; // Remove the last digit
            }
            
            // Check if the reversed number is equal to the original number
            if (rev == ogNumber) {
                System.out.println(ogNumber + " is a Palindrome number.");
            } else {
                System.out.println(ogNumber + " is Not a Palindrome number.");
            }
        }
        
        sc.close(); // Close the scanner
    }
}

/*
Expected Output:
Enter a positive integer: 121
121 is a Palindrome number.

Enter a positive integer: 123
123 is Not a Palindrome number.

Enter a positive integer: -121
Given Number is Not Palindrome. Provide a valid positive number.
*/
