package bhuvan;

public class NextGreatest {
	public static void main(String[] args) {
		char letters[]= {'a','c','f','x'};
		char target='c';
		System.out.println(nextGreatestLetter(letters,target));
	}
	
	public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        if(letters[end]<=target){     //checking if is there greater than target element exist if yes go ahead or if not then return first letter in array
            return letters[0];
        } 

        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]<=target){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return letters[start];
    }

}
