package bhuvan;
import java.util.*;

public class Remove0fromStringWithoutStringBuilder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        String str = sc.nextLine();
        String strW0 = "";
        
        System.out.println("Entered string : "+str);
        System.out.println("Empty string(before): " + strW0);
        
        int n = str.length();
        
        for(int i=0;i<n;i++) {
        	if(str.charAt(i)!='0') {
        		strW0 += str.charAt(i);
        	}
        }
        System.out.println("After removing the Zeros " + strW0);
        
        
    }
}

/* Expected output

005840034022
Entered string : 005840034022
Empty string(before): 
After removing the Zeros 5843422


*/