package bhuvan;
import java.util.*;

public class FindOccuranceOfRandomNumberWeGeneratedUsingArrayWithoutHashMap {
    public static void main(String args[]) {
        Random r = new Random();
        int arr[] = new int[9];
        
        // Generating 9 random numbers between 1 and 9 and storing elements in array
        for (int i = 0; i < 9; i++) {
            int n = r.nextInt(9) + 1;
            arr[i] = n;
        }

        // Print the generated array
        System.out.println(Arrays.toString(arr));

        // Loop through the array to count occurrences
        for (int i = 0; i < 9; i++) {
            int count = 0;
            boolean isAlready = false;
            
            // Check if the number has already been counted
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isAlready = true;
                    break;
                }
            }

            // If not already counted, count its occurrences
            if (!isAlready) {
                for (int j = 0; j < 9; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " : " + count);
            }
        }
    }
}

/*
Expected output:

[4, 3, 9, 9, 6, 7, 2, 9, 8]
4 : 1
3 : 1
9 : 3
6 : 1
7 : 1
2 : 1
8 : 1

//
 
[6, 1, 3, 2, 3, 5, 3, 7, 5]
6 : 1
1 : 1
3 : 3
2 : 1
5 : 2
7 : 1

*/
