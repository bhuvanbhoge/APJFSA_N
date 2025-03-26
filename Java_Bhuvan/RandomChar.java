package bhuvan;
import java.util.*;


class RandomChar {
    public static void main(String[] args) {
        Random r = new Random();
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 260; i++) {
            int randomNum = r.nextInt(26);  // Generate random number between 0 and 25
            
            char ch = (char) ('a' + randomNum);  // Convert to character between 'a' and 'z'
            System.out.print(ch + " ");  // Print the random character
            
            // Insert the character into the HashMap, updating its count
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        System.out.println();  // Newline after printing all characters
        
        // Print the content of the map
        System.out.println("In map: " + map);
        
        // Iterate through the map and print each key-value pair
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }
        
        System.out.println();  // Newline for better readability
        
        // Print the size of the map
        System.out.println("Size of map: " + map.size());
    }
}
