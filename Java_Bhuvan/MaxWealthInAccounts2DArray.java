package bhuvan;

public class MaxWealthInAccounts2DArray {
	public static void main(String[] args) {
        int accounts[][] = {{1,2},{3,2},{7,1}};
        System.out.println(maxWealth(accounts));
    }
    
    public static int maxWealth(int accounts[][]){
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum =0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
                
            }
            if(max<sum){
                    max=sum;
            }
        }
        return max;
    }
}
