package bhuvan;

public class PrimeNumFirst25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=25;
		int count = 0;
		
		for(int i=2;count<n;i++) {
			boolean isPrime = true;
			
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i + " ");
				count++;
			}
		}

	}

}
