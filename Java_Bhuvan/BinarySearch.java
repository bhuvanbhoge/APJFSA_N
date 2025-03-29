package bhuvan;
//only for sorted array and if repetitive numbers then its not guaranteed for first occurrence of that number it start by comparing with mid number
public class BinarySearch {
	public static void main(String[] args) {
		int arr[]={1,2,5,7,9,12,14,15,19};
        int target=19;
        System.out.println(binarySearch(arr,target));
    }
    
    public static int binarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
