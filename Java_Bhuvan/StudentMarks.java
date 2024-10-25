package bhuvan;

import java.util.Scanner;

/**
 * This program reads a student's marks and prints their grade based on the mark range.
 * Grades:
 * - Marks > 90: "O"
 * - Marks > 75: "A"
 * - Marks > 60: "B"
 * - Marks > 35: "C"
 * - Marks <= 35: "Fail"
 */
public class StudentMarks {

    public static void main(String[] args) {
        // Initialize scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();  // Read integer input for marks

        // Determine and print grade based on marks
        if (marks > 90) {
            System.out.println("Grade: O");
        } else if (marks > 75) {
            System.out.println("Grade: A");
        } else if (marks > 60) {
            System.out.println("Grade: B");
        } else if (marks > 35) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

/*
Output Example:
Enter marks: 85
Grade: A
*/

