package bhuvan;
import java.util.*;

// swapping without temp variable
//logic 
//a = a+b;
//b= a-b;
//a =a-b; now SWAPPED


public class ReverseArrayWithoutTemp {
	public static void main(String args[]) {
		int arr[] = {2,5,6,7};
        int n=arr.length;
        System.out.println("Before swapping : "+ Arrays.toString(arr));
        for(int i=0;i<n/2;i++){
            arr[i] = arr[i]+ arr[n-1-i];
            arr[n-1-i] = arr[i]- arr[n-1-i];
            arr[i]= arr[i]- arr[n-1-i];
        }
        System.out.println("After swappping : "+ Arrays.toString(arr));
	}
}

/*
Before swapping : [2, 5, 6, 7]
After swappping : [7, 6, 5, 2]
*/