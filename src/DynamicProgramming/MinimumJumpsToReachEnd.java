package DynamicProgramming;

import java.util.Arrays;

public class MinimumJumpsToReachEnd {
    public static int minJumps(int[] arr,int n){
        if(n==1)
            return 0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            if(i+arr[i]>=n-1){
                int sub_res=minJumps(arr,i+1);
                if(sub_res!=Integer.MAX_VALUE)
                    res=Math.min(res,sub_res+1);
            }
        }
        return res;
    }
    //dp[i]=minimum jumps to reach index i(from 0) in the given array
    public static int minJumpsDp(int[] arr,int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] + j >= i) {
                    if (dp[j] != Integer.MAX_VALUE)
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        if(dp[n-1]==Integer.MAX_VALUE)
            return -1;
        return dp[n-1];
    }
    public static void main(String[] args) {
        int[] arr={0,1 ,0, 3};
        System.out.println(minJumpsDp(arr,arr.length));

    }
}
