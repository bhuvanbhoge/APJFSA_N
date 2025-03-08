package bhuvan;

import java.util.Arrays;

public class RectangleArray2D {
	static int m = 4;
    static int n = 3;
    public static void main(String[] args) {
        int a[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 }};

        int b[][] = new int[m][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[j][i]= a[i][j];
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println(Arrays.deepToString(b));

    }
}
