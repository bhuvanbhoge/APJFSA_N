/*
Problem Statement: Elaborate Transformation of Integer Arrays
You are tasked with the intricate endeavor of transforming a given sequence of integers, referred to as nums. This array holds a variety of integers, and your objective is to meticulously apply a series of transformations governed by a set of precise and multi-faceted rules. The transformations will ultimately yield a refined array that adheres to specified criteria, requiring careful analysis of each integer's properties.

Step 1: Detection of the First Negative Element
Commence your journey by traversing the array to identify the index of the first negative integer that appears in the sequence. This integer serves as a critical marker for subsequent operations. Should you discover that the sequence is devoid of any negative integers, your task will culminate in the simple act of returning the array in its current form, unaltered and untouched.

Step 2: Truncation of Subsequent Elements
Upon the successful identification of the first negative integer, it is imperative to eliminate all elements that follow this integer, including the integer itself. This step is crucial as it sets the stage for the transformative operations that lie ahead. The remaining portion of the array shall be the focal point for further modifications.

Step 3: Conditional Transformations of Remaining Elements
With the truncated array in hand, you are now ready to embark on the next phase of the operation, which involves a series of conditional transformations based on intricate criteria:

Classification of Acceptance: An integer is deemed "Acceptance" if it satisfies two conditions: it must be less than 54 and simultaneously divisible by 9. Should an integer meet this dual criterion, it will undergo a transformation into the value of -9.

Non-Acceptance Handling: If an integer is less than 54 but does not satisfy the divisibility by 9, it will be modified to -6. This ensures that all integers below the threshold of 54 are adequately categorized and transformed.

Transformations for Larger Integers: Conversely, if an integer is 54 or greater and fulfills the divisibility condition of 9, it will not be classified as "Acceptance." Instead, such integers will be replaced with the value of -5 to denote their status.

Final Output
After the execution of these transformations, you will return the resulting array, now modified according to the rules outlined above. Your output must reflect the careful consideration of each integer's properties throughout the process.

Example Scenario
Input:
nums = [10, 18, 54, -2, 30]
Output:
[-6, -9, -5]
*/




import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int limit = scanner.nextInt(); // Get the limit of numbers to enter
        ArrayList<Integer> array = new ArrayList<>(limit);

        System.out.println("Enter up to " + limit + " numbers:");

        // Read the specified number of inputs
        for (int i = 0; i < limit; i++) {
            int num = scanner.nextInt();
            array.add(num); // Add every number entered
        }

        // Process the array after collecting input
        processArray(array);
        System.out.println("Processed Array: " + array + " Size - " + array.size());
    }

    public static void processArray(ArrayList<Integer> array) {
        // Find the index of the first negative number
        int firstNegativeIndex = -1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < 0) {
                firstNegativeIndex = i;
                break; // Stop at the first negative number
            }
        }

        // Remove all elements after the first negative number
        if (firstNegativeIndex != -1) {
            for (int i = array.size() - 1; i > firstNegativeIndex; i--) {
                array.remove(i);
            }
            array.remove(firstNegativeIndex); // Remove the negative number itself
        }

        // Process remaining numbers
        for (int i = 0; i < array.size(); i++) {
            int num = array.get(i);
            if (num < 54 && num % 9 == 0) {
                array.set(i, -9); // Set to -9
            } else if (num < 54) {
                array.set(i, -6); // Set to -6
            } else if (num % 9 == 0) {
                array.set(i, -5); // Set to -5
            }
        }
    }
}

/* Output
  How many numbers do you want to enter?
10
Enter up to 10 numbers:
2
44
45
90
87
34
-1
43
52
2
->
Processed Array: [-6, -6, -9, -5, 87, -6] Size - 6
*/
