package bhuvan;

public class FactorialWithoutRecursion {
	public static void main(String args[]) {
		int n=5;
		int fact=1;
		
		for(int i=n;i>1;i--) {
			fact *= i;
		}
		System.out.print("Factorial of " + n + " is "+ fact);
		
	}
}

/*
Expected Output:
Factorial of 5 is 120
*/
