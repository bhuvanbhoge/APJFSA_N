package bhuvan;

public class SortArray {
	public static void main(String args[]) {
		int arr[] = {2,5,3,7,4,9,5,8,5,1,8,6};
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        
        for (int num : arr) {
        	
            System.out.print(num + " ");
        }
	}
}
