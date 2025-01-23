package bhuvan;
import java.util.*;
public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int arr[]= {1,0,2,0,0,0,0,3,0,4};
        int count = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
               // if(i!=0){ //it saves one extra iteration
                    int temp = arr[i];
                    arr[i]=arr[count];
                    arr[count] = temp;
               // }
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}