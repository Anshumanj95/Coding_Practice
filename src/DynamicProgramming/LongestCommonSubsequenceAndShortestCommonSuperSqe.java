package DynamicProgramming;

import java.util.Arrays;
import java.util.Locale;

public class LongestCommonSubsequenceAndShortestCommonSuperSqe {
    public static int lcs1(String s1,String s2,int m,int n){
        if(m==0||n==0)
            return 0;
        if(s1.charAt(m-1)==s2.charAt(n-1))
            return 1+lcs1(s1,s2,m-1,n-1);
        else{
            return Math.max(lcs1(s1,s2,m-1,n),lcs1(s1,s2,m,n-1));
        }
    }
    public static int[][] memo;
    public static int lcsMemoization(String s1,String s2,int m,int n){
       if(memo[m][n]!=-1)
           return memo[m][n];
       if(m==0||n==0)
           memo[m][n]=0;
       else{
           if(s1.charAt(m-1)==s2.charAt(n-1))
               memo[m][n]=1+lcsMemoization(s1,s2,m-1,n-1);
           else{
               memo[m][n]=Math.max(lcsMemoization(s1,s2,m-1,n),lcsMemoization(s1,s2,m,n-1));
           }
       }
    return memo[m][n];
    }
    public static int[][] lcsTabulation(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
            dp[i][0]=0;
        for(int i=0;i<=n;i++)
            dp[0][i]=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp;
    }
    public static String  printLcs(int[][] dp,String s1,String s2){
        int index=dp[s1.length()][s2.length()];
        StringBuffer s=new StringBuffer();

        int i=s1.length();
        int j=s2.length();
        while (i>0&& j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                s.append(s1.charAt(i-1));
                i--;
                j--;
                index--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
                i--;
            else
                j--;
        }
        return s.reverse().toString();

    }
    public static int shortestCommonSupersequence(String X,String Y)
    {
        //Your code here
        int m=X.length();
        int n=Y.length();
        int[][] dp=lcsTabulation(X,Y);
        String s=printLcs(dp,X,Y);
        return s.length()+(m-s.length())+(n-s.length());
    }
    public static int LCSof3(String s1, String s2, String s3, int n1, int n2, int n3)
    {
        // code here
        int[][][] dp=new int[n1+1][n2+1][n3+1];
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                for(int k=0;k<=n3;k++){
                    if(i==0||j==0||k==0)
                        dp[i][j][k]=0;
                    else if(s1.charAt(i-1)==s2.charAt(j-1) && s2.charAt(j-1)==s3.charAt(k-1))
                        dp[i][j][k]=1+dp[i-1][j-1][k-1];
                    else
                        dp[i][j][k]=Math.max(dp[i-1][j][k],Math.max(dp[i][j-1][k],dp[i][j][k-1]));
                }
            }
        }
        return dp[n1][n2][n3];

    }
    public static void main(String[] args) {
        String s1="pxohgmgnkeufd";
        String s2="xotogbgxp";
        String s3="eyanfetcukepz";
        System.out.println(LCSof3(s1,s2,s3,s1.length(),s2.length(),s3.length()));

    }
}
