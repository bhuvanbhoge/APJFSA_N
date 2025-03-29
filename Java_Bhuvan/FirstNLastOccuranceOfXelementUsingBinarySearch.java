package bhuvan;

import java.util.Arrays;

public class FirstNLastOccuranceOfXelementUsingBinarySearch {
	public static void main(String[] args) {
        //Try to solve it using Binary search
        int nums[]={5,7,7,7,7,8,8,10};
        int target=7;
        int ans[] = searchRange(nums,target);
        System.out.println("First and last occurance of " + target + " in given array is from index " + Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int ans[] = {-1,-1};
        ans[0]=firstOcc(nums,target);
        if(ans[0]==-1){
            return ans;
        }
        ans[1]=lastOcc(nums,target);
        return ans;
    }

    public static int firstOcc(int nums[],int target){
        int first = -1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                first = mid;
                end=mid-1;
            }else if(nums[mid]<target){
                start= mid+1;
            }else{
                end=mid-1;
            }
        }
        return first;
    }

    public static int lastOcc(int nums[],int target){
        int last = -1;
        int start = 0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                last = mid;
                start=mid+1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return last;
    }
}
