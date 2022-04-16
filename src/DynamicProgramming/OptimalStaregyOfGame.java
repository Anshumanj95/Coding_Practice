package DynamicProgramming;

import java.util.Arrays;

public class OptimalStaregyOfGame {
    public static int recursive1(int[] arr,int i,int j,int sum){
        if(j==i+1)
            return Math.max(arr[i],arr[j]);
        return Math.max(sum-recursive1(arr,i+1,j,sum-arr[i]),sum-recursive1(arr,i,j-1,sum-arr[j]));
    }
    public static int recursive2(int[] arr,int i,int j){
        if(i+1==j)
            return Math.max(arr[i],arr[j]);
        return Math.max(arr[i]+Math.min(recursive2(arr,i+2,j),recursive2(arr,i+1,j-1)),
                arr[j]+Math.min(recursive2(arr,i+1,j-1),recursive2(arr,i,j-2)));
    }
    public static int dpSolution(int[] arr,int n){
        int[][] dp=new int[n][n];
        for (int i=0;i<n-1;i++){
            dp[i][i+1]=Math.max(arr[i],arr[i+1]);
        }
        for(int gap=3;gap<n;gap+=2){
            for (int i=0;i+gap<n;i++){
                int j=i+gap;
                dp[i][j]=Math.max(arr[i]+ Math.min(dp[i+2][j],dp[i+1][j-1]),arr[j]+Math.min(dp[i+1][j-1],dp[i][j-2]));
            }
        }
        return dp[0][n-1];
    }
    public static void main(String[] args) {
        int[] arr={20,5,4,6,8,3};
        int sum= Arrays.stream(arr).sum();
        System.out.println(recursive1(arr,0,arr.length-1,sum));
        System.out.println(recursive2(arr,0,arr.length-1));
        System.out.println(dpSolution(arr,arr.length));

    }
}
