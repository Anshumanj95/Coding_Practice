package DynamicProgramming;

import java.util.Arrays;

public class OutOfBoundary {
    static int M=10000007;
    public static int findPaths(int m,int n,int row,int col,int max){
        int[][][] memo=new int[m][n][max+1];
        for (int[][] l:memo)
            for (int[] sl:l)
                Arrays.fill(sl,-1);
        return findAll(m,n,max,row,col,memo);
    }
    public static int findAll(int m,int n,int N,int i,int j,int[][][] memo){
        if (i==m||j==n||i<0||j<0)
            return 1;
        if (N==0)
            return 0;
        if (memo[i][j][N]>=0)
            return memo[i][j][N];
        memo[i][j][N]=((findAll(m,n,N-1,i-1,j,memo)+findAll(m,n,N-1,i+1,j,memo))%M+(findAll(m,n,N-1,i,j-1,memo)+findAll(m,n,N-1,i,j+1,memo))%M)%M;
        return memo[i][j][N];
    }
    public static void main(String[] args) {
        System.out.println(findPaths(2,2,0,0,2));

    }
}

