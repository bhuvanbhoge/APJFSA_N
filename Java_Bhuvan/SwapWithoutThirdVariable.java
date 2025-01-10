// Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write two programs to swap the values of the two variables without using any third variable
package bhuvan;
import java.util.*;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a first number: ");
        int firstNumber = sc.nextInt(); // Changed variable name to 'firstNumber'
        
        System.out.println("Enter a second number: ");
        int secondNumber = sc.nextInt(); // Changed variable name to 'secondNumber'
        
        // Swap the numbers using XOR      or              we can use  (a=a+b;     b=a-b;     a=a-b;)               
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;
        
        // Output the results
        System.out.print("After swapping " + "\n" + "First number is : " + firstNumber + "\n" + "Second number is: " + secondNumber);
    }
}

/*
Expected Output:
Enter a first number: 
5
Enter a second number: 
10

After swapping 
First number is : 10
Second number is: 5
*/
