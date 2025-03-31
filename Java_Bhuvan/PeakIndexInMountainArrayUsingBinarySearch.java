package bhuvan;

public class PeakIndexInMountainArrayUsingBinarySearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,4,3,2};
		int start =0;
        int end=arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1]){
                //you are in ascending part of the array
                start=mid+1;
            }else{
                //you are in decreasing part of array
                //this may be the ans, but look at left
                end=mid;
	                //this is why end!=mid-1;
            }
        }
        //in the end , start == end and pointing to the largest number because of the two checks above
	        //start and end are always trying to find max element in the above 2 checks
	        //hence, when they are pointing to just one element, that is the max one because that is what the check says
	        //more elaboration: at every point of time for start and end , they have the best possible answer till that time
	        //and if we are saying that only one item is remaining,hence cuz of above line that is the best possible ans
	    System.out.println(start);// or return end as both are =
    }

}
