package bhuvan;

import java.util.ArrayList;

public class MajorityElement2MostOPtimal {
	public static void main(String[] args) {
        int arr[]={2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        
        for(int i=0;i<arr.length;i++){
            if(count1==0 && arr[i]!=el2){
                el1=arr[i];
                count1=1;
            }else if(count2==0 && arr[i]!=el1){
                el2=arr[i];
                count2=1;
            }else if(el1==arr[i]){
                count1++;
            }else if(el2==arr[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        
        if(count1==0){
            return;
        }else if(count2==0){
            return;
        }
        
        count1=0;
        count2=0;
        
        for(int i=0;i<arr.length;i++){
            if(el1==arr[i]){
                count1++;
            }else if(el2==arr[i]){
                count2++;
            }
        }
        ArrayList<Integer> ls=new ArrayList<>();
        if(count1>=(arr.length/3)){
            ls.add(el1);
        }
        if(count2>=(arr.length/3)){
            ls.add(el2);
        }
        System.out.println(ls);
    }

}
