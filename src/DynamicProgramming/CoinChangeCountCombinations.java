package DynamicProgramming;

public class CoinChangeCountCombinations {
    public static int getCount(int[] coin,int n,int sum){
        if(sum==0)
            return 1;
        if(n==0)
            return 0;
        int res=getCount(coin,n-1,sum);
        if(coin[n-1]<=sum)
            res+=getCount(coin,n,sum-coin[n-1]);
        return res;
    }
    public static int getCountDp(int[] coin,int n,int sum){
        int[][] dp=new int[sum+1][n+1];
        for(int i=0;i<=n;i++)
            dp[0][i]=1;
        for (int i=1;i<=sum;i++)
            dp[i][0]=0;
        for(int i=1;i<=sum;i++){
            for (int j=1;j<=n;j++){
                dp[i][j]=dp[i][j-1];
                if(coin[j-1]<=i)
                    dp[i][j]+=dp[i-coin[j-1]][j];
            }
        }
        for(int i=0;i<=sum;i++){
            for(int j=0;j<=n;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[sum][n];
    }
    public static void main(String[] args) {
        int[] coin={1,2,5};
        System.out.println(getCount(coin,coin.length,11));
        System.out.println(getCountDp(coin,coin.length,11));

    }
}
