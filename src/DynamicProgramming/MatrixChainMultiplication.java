package DynamicProgramming;

public class MatrixChainMultiplication {
    //O(n^3)
    public static int matrixChain(int[] arr,int n){
        int[][] dp=new int[n][n];
        for(int i=0;i<n-1;i++){
            dp[i][i+1]=0;
        }
        for(int gap=2;gap<n;gap++){
            for (int i=0;i+gap<n;i++){
                int j=i+gap;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i+1;k<j;k++){
                    dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k][j]+arr[i]*arr[j]*arr[k]);
                }
            }
        }
        return dp[0][n-1];
    }
    public static void main(String[] args) {
        int[] arr={10,5,20,10,5};
        System.out.println(matrixChain(arr,arr.length));
    }
}
