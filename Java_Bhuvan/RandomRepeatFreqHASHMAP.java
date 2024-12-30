package bhuvan;
import java.util.*;

public class RandomRepeatFreqHASHMAP {
	public static void main(String[] args) {
        Random r = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<10;i++){
            int n = r.nextInt(9)+1;
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+ " : " +e.getValue());
        }
    }
}
