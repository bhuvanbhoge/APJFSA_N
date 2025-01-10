package bhuvan;
import java.util.*;
public class TruckCapacity {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input number of items
        System.out.print("Enter the number of items (N): ");
        int n = scanner.nextInt();

        // Input values array
        int[] values = new int[n];
        System.out.println("Enter the values of the items: ");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        // Input weights array
        int[] weights = new int[n];
        System.out.println("Enter the weights of the items: ");
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        // Input the lorry's capacity
        System.out.print("Enter the capacity of the lorry: ");
        int capacity = scanner.nextInt();

        // Initialize variables to track the maximum value and corresponding weight
        int maxValue = 0;
        int maxWeight = 0;

        // Total number of subsets (2^n)
        int totalSubsets = (1 << n);

        // Check all subsets for the best combination
        for (int subset = 0; subset < totalSubsets; subset++) {
            int currentValue = 0;
            int currentWeight = 0;

            for (int i = 0; i < n; i++) {
                if ((subset & (1 << i)) != 0) { // If the i-th item is included
                    currentValue += values[i];
                    currentWeight += weights[i];
                }
            }

            // Update maxValue and maxWeight if the current combination is valid and better
            if (currentWeight <= capacity && currentValue > maxValue) {
                maxValue = currentValue;
                maxWeight = currentWeight;
            }
        }

        // Print the maximum value and corresponding weight
        System.out.println("The maximum value that can be loaded into the lorry is: " + maxValue);
        System.out.println("The corresponding weight is: " + maxWeight);
		
	}

}
