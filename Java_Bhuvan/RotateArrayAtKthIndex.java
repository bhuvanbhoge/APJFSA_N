package bhuvan;


import java.util.*;
public class RotateArrayAtKthIndex {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        int target = 3;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for(int i =0;i<target/2;i++){
            int temp=arr[i];
            arr[i]=arr[target-i-1];
            arr[target-i-1] = temp;
        }
        for(int i =target;i<(arr.length+target)/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length+target-i-1];
            arr[arr.length+target-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}