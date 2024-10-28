// Write a program for even odd by using conditional(ternary) operator.
package bhuvan;
import java.util.*;

public class OddEvenUsingTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = sc.nextInt(); // Changed variable name to 'number'
        
        // Determine if the number is odd or even using a ternary operator
        String result = (number % 2 == 0) ? "Given number is Even" : "Given number is Odd";
        
        // Output the result
        System.out.print(result);
    }
}

/*
Expected Output:

Enter a number
4
Given number is Even

*/