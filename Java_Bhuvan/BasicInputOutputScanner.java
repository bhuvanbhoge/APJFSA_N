package bhuvan;
import java.util.*;
public class BasicInputOutputScanner {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        double d = scan.nextDouble();
        
        // Consume the leftover newline character from nextInt()/nextDouble() or any next
        scan.nextLine();
        String str= scan.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

/*
Expected output

20
5.25
Bhel lo Bhel
String: Bhel lo Bhel
Double: 5.25
Int: 20

*/