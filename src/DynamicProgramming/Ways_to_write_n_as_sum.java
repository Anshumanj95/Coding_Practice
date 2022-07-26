package DynamicProgramming;

import java.util.Arrays;

public class Ways_to_write_n_as_sum {
    public static int ways(int n){
        int mod=1000000007;
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<n;i++){
            for(int j=i;j<=n;j++)
                dp[j]+=dp[j-i]%mod;
            System.out.println(Arrays.toString(dp));
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int sum=5;
        System.out.println(ways(sum));

    }
}
