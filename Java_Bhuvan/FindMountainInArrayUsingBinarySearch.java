package bhuvan;
/* Input: mountainArr = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
Example 2:

Input: mountainArr = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.*/
public class FindMountainInArrayUsingBinarySearch {
	public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,1};
        int target=3;
        int n = arr.length-1;
        
        int peak = findpeak(arr);
        
        int ascEl = binarySearch(arr,target,0,peak,true);
        if(ascEl!=-1){
            System.out.println(ascEl);
            return;
        }
        
        System.out.println(binarySearch(arr,target,peak,n,false));
        
    }
    
    public static int findpeak(int arr[]){
        int start=0;
        int end= arr.length-1;
        
        while(start<end){
            int mid=start+ (end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
    
    public static int binarySearch(int arr[], int target, int start, int end, boolean isAsc){
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(arr[mid]<target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
