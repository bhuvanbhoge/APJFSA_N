package bhuvan;

public class PrimeNum {
	public static void main(String[] args) {
        int num =0;
        for(int i=2; i<100;i++){
            boolean isPrime = true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
        
    }
}
