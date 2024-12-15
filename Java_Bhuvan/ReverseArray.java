package bhuvan;
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,34,5,3,233};
		int start =0, end = arr.length-1;
		
		System.out.println("Original array : "+ Arrays.toString(arr));
		
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println("Reversed array : "+ Arrays.toString(arr));

	}

}
