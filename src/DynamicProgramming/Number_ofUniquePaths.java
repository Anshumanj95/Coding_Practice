package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Number_ofUniquePaths {
    public static int recursive(int a,int b,int i,int j){
        if(i<0||i>a-1||j<0||j>b-1)
            return 0;
        if(i==a-1 && j==b-1)
            return 1;
        return recursive(a,b,i+1,j)+recursive(a,b,i,j+1);
    }
    public static int dp(int a,int b){
        int[][] dp=new int[a][b];
        for (int i=0;i<b;i++){
            dp[0][i]=1;
        }
        for (int i=0;i<a;i++)
            dp[i][0]=1;
        for (int i=1;i<a;i++){
            for (int j=1;j<b;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[a-1][b-1];
    }
    public static void main(String[] args) {
        System.out.println(recursive(3,4,0,0));
        System.out.println(dp(3,4));
        int[] arr={1,2,3,45};

    }
}
