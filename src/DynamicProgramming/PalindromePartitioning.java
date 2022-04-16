package DynamicProgramming;

public class PalindromePartitioning {
    // minimum partition of string to make all substring palindrome same as chain matrix multiplication
    // in place of ispla we use function isPalindrome, but we use because it is more optimize
    //O(n^3)
    public static int minimumPartition(String s,int n){
        int[][] dp=new int[n][n];
        boolean[][] isPal=new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=0;
            isPal[i][i]=true;
        }
        for(int gap=1;gap<n;gap++){
            for(int i=0;i+gap<n;i++){
                int j=i+gap;
                if((s.charAt(i)==s.charAt(j))&&(isPal[i+1][j-1]||gap==1)){
                    dp[i][j]=0;
                    isPal[i][j]=true;
                }
                else{
                    isPal[i][j]=false;
                    dp[i][j]=Integer.MAX_VALUE;
                    for(int k=i;k<j;k++){
                        dp[i][j]=Math.min(dp[i][j],1+dp[i][k]+dp[k+1][j]);
                    }
                }
            }
        }
        return dp[0][n-1];
    }
    public static void main(String[] args) {
        String s="abbaa";
        System.out.println(minimumPartition(s,s.length()));

    }
}
