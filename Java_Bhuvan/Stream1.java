package bhuvan;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Stream1 {
	public static void main(String[] args) {
        int arr[]={11,22,33,11,33,22,44};
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        
        // for(int i : arr){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        
        System.out.println(map);
        ////////////////////////////////////////////////////////////
        //by stream
        List<Integer> num = Arrays.asList(11,22,11,44,22,33,44,55);
        System.out.println(num.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        ////////////////////////////////////////////////////////////
        int add = IntStream.range(1,11).sum();
        System.out.println(add);
        
        
        
    }
}
