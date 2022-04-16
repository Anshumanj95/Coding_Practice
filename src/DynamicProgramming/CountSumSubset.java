package DynamicProgramming;

public class CountSumSubset {
    //dp[i][j]=count of subset in arr[0..i-1] with sum j
    public static int countSubset(int[] arr,int n,int sum){
        int[][] dp=new int[n+1][sum+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for (int i=1;i<=sum;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++){
            for (int j=1;j<=sum;j++){
                if(j<arr[i-1]){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-arr[i-1]];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int[] arr={2,3,5};
        System.out.println(countSubset(arr,arr.length,5));
    }
}
