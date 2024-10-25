// Write a java Program to find given number is Armstrong or not.
package bhuvan;

import java.util.*;

public class ArmstrongNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int n, temp, sum = 0; // Changed variable name to 'sum'
        int originalNumber = num; // More descriptive variable name
        
        // Check if the number is an Armstrong number
        while (num != 0) {
            n = num % 10; // Get the last digit
            temp = n * n * n; // Calculate the cube of the digit
            sum += temp; // Sum the cubes
            num /= 10; // Remove the last digit
        }
        
        // Output result
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}

/*
Expected Output:
Enter a number :
153
153 is an Armstrong number
*/
