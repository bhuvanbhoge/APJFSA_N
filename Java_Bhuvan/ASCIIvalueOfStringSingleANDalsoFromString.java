package bhuvan;
import java.util.*;

public class ASCIIvalueOfStringSingleANDalsoFromString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character to know its ASCII value");

        char ch = sc.next().charAt(0); // (only the first character is taken)

        int asciiOfch = (int) ch;  // Convert the character to its corresponding ASCII value (integer representation)

        System.out.print(ch + " " + asciiOfch + " ");
        // Alternative way to directly print the ASCII value of the character
        System.out.println(ch + " " + (int) ch);

        System.out.println();
        
        // Example to print the ASCII values of each character from a given string
        String str = "Bhuvan"; 
        int count = 0;  // Initialize a counter variable

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Get each character from the string
            char strch = str.charAt(i);

            System.out.println(strch + " " + (int) strch);  // Print the character and its corresponding ASCII value

            count++;  //count elements in string
        }

        System.out.println("Count: " + count);

        // Close the scanner object to prevent resource leak
        sc.close();
    }
}
