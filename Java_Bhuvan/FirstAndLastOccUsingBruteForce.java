package bhuvan;
import java.util.*;
public class FirstAndLastOccUsingBruteForce {
	public static void main(String[] args) {
        char letters[]= {'a','b','c','c','c','f'}; // ExOutput [2,4]
		char target='c';
		int ans[] = first_n_lastEl(letters,target);
        System.out.println(Arrays.toString(ans));
        
        if(ans[0]==-1) {
        	System.out.println("No Occurance");
        	return;
        }
        int occurance = ans[1]-ans[0]+1;
        System.out.println("With occurance of "+ occurance);
    }
    public static int[] first_n_lastEl(char letters[],char target){
        int ans[]={-1,-1};
        for(int i=0;i<letters.length;i++){
            if(letters[i]==target){
                ans[0]=i;
                break;
            }
        }
        for(int i=letters.length-1;i>=0;i--){
            if(letters[i]==target){
                ans[ans.length-1]=i;
                break;
            }
        }
        return ans; 
    }
}
