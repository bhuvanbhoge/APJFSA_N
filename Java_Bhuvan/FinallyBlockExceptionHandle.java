package bhuvan;
import java.util.*;

public class FinallyBlockExceptionHandle {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number to divide 100 by : ");
			int divisor = sc.nextInt();
			int result = 100/divisor;
			System.out.println("Result of division : " + result);
		}
		catch(ArithmeticExceptionHandling e) {
			System.out.println("Arithmetic Exception: Cannot divide by zero");
		}
		catch(NumberFormatException e) {
			System.out.println("Number Format exception: Please enter a valid integer");
		}
		catch(InputMismatchException e) {
			System.out.println("Number Format exception: Please enter a valid integer");
		}
		finally {
			System.out.println("Excuting finall block. Closing resources ...");
		}
		System.out.print("Program execution completed.");
	}

}
