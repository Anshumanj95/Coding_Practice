package DynamicProgramming;

public class ShortestUncommonSubsequence {
    public static int shortest(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int max=1000;
        int[][] dp=new int[m+1][n+1];
        for (int i=0;i<=n;i++)
            dp[i][0]=1;
        for (int i=0;i<=m;i++)
            dp[0][i]=max;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                int k=j-1;
                for (;k>=0;k--){
                    if (s1.charAt(i-1)==s2.charAt(k))
                        break;
                }
                if (k<0)
                    dp[i][j]=1;
                else
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][k]+1);
            }
        }
        return dp[n][m]>=max?-1:dp[n][m];
    }
    public static void main(String[] args) {
        String s="babab";
        String t="babba";
        System.out.println(shortest(s,t));
    }

}
