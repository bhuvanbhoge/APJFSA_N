package bhuvan;
import java.util.*;

public class IsPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean prime=true;
		if(n<=1) {
			prime=false;
		}else {
			for(int i = 2;i*i<=n;i++) {
				if(n%i==0) {
					prime=false;
					break;
				}
			}
		}
		if(prime) {
			System.out.print(n + " is a Prime number");
		}else {
			System.out.print(n + " is NOT a Prime number");
		}

	}
}
