// USE of PRINTF and decimal upto 2 using "%.2f" inside printf 
package bhuvan;
import java.util.*;
public class Printf_ChemicalSol {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter X(curr temp) : ");
        double x = sc.nextInt();
        
        System.out.println("Enter A(curr solubility of solution of water with salt) : ");
        double a = sc.nextInt();
        
        System.out.println("Enter B(degree of increase as per temp) : ");
        double b = sc.nextInt();
        
        if(x<=0 && x>=100){
            System.out.println("ReEnter valid X(curr temp) : ");
        }
        if(a<=0 && a>=1000){
            System.out.println("ReEnter valid A(curr solubility of solution of water with salt) : ");
        }
        if(b<=0 && b>=10){
            System.out.println("ReEnter valid B(degree of increase as per temp) : ");
        }
        
        double sol = 100-x;
        
        double semiFinal = a + (sol*b);
        double finalSol = semiFinal / 100;
        System.out.printf("%.2f",finalSol);
	}
}

/*
Expected output 

Enter X(curr temp) : 
30
Enter A(curr solubility of solution of water with salt) : 
40
Enter B(degree of increase as per temp) : 
2
1.80

//
 * Enter X(curr temp) : 
35
Enter A(curr solubility of solution of water with salt) : 
110
Enter B(degree of increase as per temp) : 
2
2.40

//
 * Enter X(curr temp) : 
40
Enter A(curr solubility of solution of water with salt) : 
80
Enter B(degree of increase as per temp) : 
1
1.40

*/