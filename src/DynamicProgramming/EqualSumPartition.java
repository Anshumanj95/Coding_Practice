package DynamicProgramming;

import java.util.Arrays;

public class EqualSumPartition {
    //Given a set of numbers, check whether it can be partitioned into two subsets such that the sum of elements in both subsets is same or not.
    public static boolean findPartition(int[] a, int n)
    {
        // code here
        int sum= Arrays.stream(a).sum();
        if(sum%2==1)
            return false;
        sum/=2;
        int[][] dp = new int[n+1][sum+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(a[i-1] <= j)
                    dp[i][j] = Math.max(a[i-1] + dp[i-1][j-a[i-1]],dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum] == sum;
    }
    public static void main(String[] args) {
        int[] arr={1,5,5,11};
        System.out.println(findPartition(arr,arr.length));

    }
}
