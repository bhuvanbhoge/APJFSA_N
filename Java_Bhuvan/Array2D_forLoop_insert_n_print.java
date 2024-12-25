package bhuvan;
import java.util.*;
public class Array2D_forLoop_insert_n_print {
	public static void main(String[] args) {
        int[][] arr = new int[3][3]; // Correct way to declare and initialize
        int val=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // Use arr[i].length for columns
                arr[i][j] = val++; // Example: assigning values 1 to 9
            }
        }
        
        for(int i =0;i<arr.length;i++){
            for(int j =0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr));
        //used deepToString method to print 2d array as a string
    }
}
