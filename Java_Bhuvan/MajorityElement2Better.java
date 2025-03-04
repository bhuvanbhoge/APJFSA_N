package bhuvan;
import java.util.*;
public class MajorityElement2Better {
	public static void main(String[] args) {
		int nums[]= {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
		 HashMap<Integer,Integer> map=new HashMap<>();

	        for(int i=0;i<nums.length;i++){
	            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
	        }

	        ArrayList<Integer> ls = new ArrayList<>();
	        
	        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
	            if(entry.getValue()>(nums.length/3)){
	                ls.add(entry.getKey());
	            }
	        }
	        System.out.println(ls);
	}
}
