package bhuvan;

public class Pattern12345NextRowStarX5_1112131415 {
	public static void main(String[] args) {
        int rows=5;
        int a = 1;
        for(int i=1;i<=rows;i++){
            if(i%2!=0){
                for(int j=1; j<=rows;j++){
                    System.out.print(a++ + " ");
                }
                a+=5;
            }else{
                for(int j=1; j<=rows;j++){
                    System.out.print("* ");
                }
            }
         System.out.println();
        }
    }
}

/* Expected output

1 2 3 4 5 
* * * * * 
11 12 13 14 15 
* * * * * 
21 22 23 24 25 

*/