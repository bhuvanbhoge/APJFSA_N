package bhuvan;
import java.util.*;
public class MergeArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,0,0,0};
		int m=3;
		int b[]= {2,5,6};
		int n=3;
		
		// write code below
		
		int index=m+n-1;
		int x=m-1;
		int y=n-1;
		
		while(y>=0){
			if(x>=0 && a[x]>b[y]) {
				a[index]=a[x];
				x--;
			}else {
				a[index]=b[y];
				y--;
			}
			index--;
		}
		System.out.println(Arrays.toString(a));
	}
}
