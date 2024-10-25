// Write a program to find largest number among three.
package bhuvan;
import java.util.*;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        // Determine the largest number
        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1; // num1 is the largest
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2; // num2 is the largest
        } else {
            largest = num3; // num3 is the largest
        }

        // Output the largest number
        System.out.println("The largest number among the three is: " + largest);
    }
}

/*
Expected Output:
Enter the first number: 10
Enter the second number: 25
Enter the third number: 15
The largest number among the three is: 25
*/
