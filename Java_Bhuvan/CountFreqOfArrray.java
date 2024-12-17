package bhuvan;
import java.util.*;

public class CountFreqOfArrray {
	public static void main(String args[]) {
		int arr[] = {3,5,3,2,6,7,2,6};
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
		System.out.println("El  Fq");
		for(int key: map.keySet()) {
			System.out.println(key + " -> "+ map.get(key));
		}
		
		System.out.println(map);
	}
}
