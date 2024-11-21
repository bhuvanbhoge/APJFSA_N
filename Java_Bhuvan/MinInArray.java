package bhuvan;

public class MinInArray {

	public static void main(String[] args) {
		int arr[]= {3,55,32,53,23,34,12,35};
		int min = arr[0];
		for(int i = 1; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.print(min);
	}

}
