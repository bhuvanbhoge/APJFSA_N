package bhuvan;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class OccuranceOFCharInStringAndReverseIndividualWords {

	public static void main(String[] args) {
		String str = "java batch is going on";

        System.out.println(str.chars()
                .mapToObj(c -> (char) c)  // Convert int to char
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))); // Group and count
                
        String words[] = str.split(" ");
        String finalStr = "";
        
        for(String w:words){
            String rev = "";
            for(int i = w.length() - 1; i >= 0; i--){
                rev = rev + w.charAt(i);
            }
            finalStr += rev + " ";
        }
        
        System.out.println(finalStr);

	}

}
