package DynamicProgramming;

public class NumberOfDiceRollsWithTargetSum {
    public static int noOfWays(int n,int k,int target){
        int[][] dp=new int[n+1][target+1];
        int mod=1000000007;
        dp[0][0]=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=target;j++){
                for (int face=1;face<=k;face++){
                    if (j-face>=0)
                        dp[i][j]=(dp[i][j]+dp[i-1][j-face])%mod;
                }
            }
        }
        return dp[n][target];
    }
    public static void main(String[] args) {
        int n=3;
        int k=2;
        int target=6;
        System.out.println(noOfWays(n,k,target));
    }
}
