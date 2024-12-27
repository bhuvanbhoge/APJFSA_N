package bhuvan;

import java.util.*;

public class ReverseAndPalindromeString {
    public static void main(String[] args) {
        // Create a scanner to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Initialize variables
        int right = str.length(); // Length of the string
        String rev = "";          // String to store the reversed string
        char ch;                  // Temporary variable to hold each character
        boolean isPalindrome = true; // Flag to check if string is a palindrome

        // Check if the string is a palindrome by comparing characters from both ends
        for (int i = 0; i < right / 2; i++) {
            if (str.charAt(i) != str.charAt(right - 1 - i)) {
                isPalindrome = false;  // If characters don't match, it's not a palindrome
                break;  // No need to continue if already determined it's not a palindrome
            }
        }

        // Output whether the string is a palindrome or not
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Non-palindrome");
        }

        // Reverse the string manually
        for (int i = 0; i < right; i++) {
            ch = str.charAt(i); // Get character at index i
            rev = ch + rev;      // Add it to the beginning of 'rev' to reverse the string
        }

        // Check if the reversed string is the same as the original string
        if (rev.equals(str)) {  // Use equals() to compare the content of the strings
            System.out.println("Palindrome");
        } else {
            System.out.println("Non-palindrome");
        }

        // Output the reversed string
        System.out.println("Reversed string is: " + rev);

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}

/*
output
	Enter a string: mam
Palindrome
Palindrome
Reversed string is: mam
	*/
