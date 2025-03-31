package bhuvan;

public class FindPeakElementUsingBinarySearch {

	public static void main(String[] args) {
		int nums[]= {1,2,1,3,5,6,4};
		int start =0;
        int end=nums.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        System.out.println(start);
    }

}
