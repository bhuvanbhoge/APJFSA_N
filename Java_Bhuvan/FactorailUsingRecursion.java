package bhuvan;

public class FactorailUsingRecursion {
	public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    
    public static void main(String[] args) {
        int n=5;
        System.out.print("Factorail of " + n + " is " + fact(n));
    }
}
