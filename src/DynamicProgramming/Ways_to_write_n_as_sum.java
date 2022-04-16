package DynamicProgramming;

public class Ways_to_write_n_as_sum {
    public static int ways(int n){
        int M=1000000000+7;
        int N=n-1;
        int[] coin=new int[N];
        for (int i=0;i<N;i++){
            coin[i]=i+1;
        }
        int[][] dp=new int[N+1][n+1];
        for (int i=0;i<=N;i++){
            dp[i][0]=1;
        }
        for (int i=1;i<=N;i++){
            for (int j=1;j<=n;j++){
                if (coin[i-1]<=j){
                    dp[i][j]=(dp[i][j-coin[i-1]]+dp[i-1][j])%M;
                }
                else
                    dp[i][j]=dp[i-1][j]%M;
            }
        }
        return dp[N][n]%M;
    }
    public static void main(String[] args) {
        int sum=5;
        System.out.println(ways(sum));

    }
}
