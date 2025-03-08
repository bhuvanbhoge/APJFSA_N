package bhuvan;

import java.util.Arrays;

public class Square2Darray {
    static int n = 4;
    public static void main(String[] args) {
        int a[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 },
                      { 4, 4, 4, 4} };

        int b[][] = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]= a[j][i];
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println(Arrays.deepToString(b));

    }
}
