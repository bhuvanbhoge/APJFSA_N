package bhuvan;
import java.util.*;
public class ReverseAndPalindromeString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int right = str.length();
        String rev = "";
        char ch;
        boolean isPalindrome = true;
        
        for(int i=0;i<right/2;i++){
            if(str.charAt(i) != str.charAt(right-1-i)){
                isPalindrome = false;
            }
        }
        
        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Non palindrome");
        }
        
        
        for(int i=0;i<right;i++){
            ch = str.charAt(i);
            rev = ch+ rev;
        }
        if(rev==str){
            System.out.println("Palindrome");   
        }else{
            System.out.println("non palindrome");
        }
        
        
        System.out.println("reversed string is " + rev);
    }
}
