package bhuvan;
import java.util.*;
import java.util.stream.*;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> team1 = Arrays.asList("Anu","Bhuvan","Charu");
        List<String> team2 = Arrays.asList("Diga","Charu","Anu");
        List<String> team3 = Arrays.asList("Anu","Hitu","Charu");
        
        List<List<String>> teams = Arrays.asList(team1,team2,team3);
        System.out.println("3D : " + teams);
        
        List<String> finalName = teams.stream().flatMap(t->t.stream()).collect(Collectors.toList());
        System.out.println("1D : " + finalName);
        System.out.println(finalName.size());
        
        List<String> uniqueNames = finalName.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique Names : " + uniqueNames);
        System.out.println(uniqueNames.size());
        
        List<String> limitedNames = finalName.stream().limit(3).collect(Collectors.toList());
        System.out.println("limited Names : " + limitedNames);
        
        List<Integer> numbers = Arrays.asList(11,22,88,55,77,44,88,99,11);
        
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("evenNumbers : " + evenNumbers);
        int evenCount = (int)numbers.stream().filter(n->n%2==0).count();
        System.out.println("evenNumbers Count: " + evenCount);
        System.out.println("\nAscending Order:");
        numbers.stream().sorted().forEach(i-> System.out.print(i+ " "));

        System.out.println("\nDescending Order:"); // Added newline for better readability
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(i-> System.out.print(i+ " "));

        // Example of creating a new sorted list (ascending)
        List<Integer> sortedAscending = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("\nNew Sorted List (Ascending): " + sortedAscending);

        // Example of creating a new sorted list (descending)
        List<Integer> sortedDescending = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("\nNew Sorted List (Descending): " + sortedDescending);
        
        
     // Create a Set of fruits
        Set<String> fruits = new HashSet<>(Arrays.asList("One Apple", "Two Bananas", "One Orange", "Three grapes", "Two guavas"));

        boolean available1 = fruits.stream().anyMatch(s -> s.startsWith("Three"));
        System.out.println("Any fruit starts with 'Three': " + available1); 

        boolean available2 = fruits.stream().allMatch(s -> s.startsWith("One"));
        System.out.println("All fruits start with 'One': " + available2); 

        boolean available3 = fruits.stream().noneMatch(s -> s.startsWith("Four"));
        System.out.println("No fruits start with 'Four': " + available3);
	}

}
