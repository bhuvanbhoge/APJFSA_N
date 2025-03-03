package bhuvan;
import java.util.*;
public class NextPermutationArray {
	public static void main(String[] args) {
        int[] arr = {1,2,5,4,3}; // required output 1,3,2,4,5
        int n = arr.length-1;
        
        int pivot=-1;
        //step 1
        //finding pivot which is not in ascending order from end <-
        for(int i=n-1;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
//        System.out.println(pivot);   //just checking pivot before proceed
        //if pivot is still -1 then just reverse it and print and end the program
        if(pivot==-1){
            reverse(arr,0,n);
            System.out.println(Arrays.toString(arr));
            return;
        }
        
        //step2
        //if pivot is found in array(not -1)
        //Swap the pivot element from the array with last element
        for(int i=n;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                int temp = arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
        }
        
        //Step 3
        // reverse the elements of array from next of the pivot to end of the array(ie. pivot+1 to n)
        reverse(arr,pivot+1,n);
        
        
        System.out.println(Arrays.toString(arr));
    }
    
    public static void reverse(int arr[],int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
