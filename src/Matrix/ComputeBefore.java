package Matrix;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComputeBefore {
    public static int[][] computeBefore(int[][] after,int n,int m){
        /*using extra space
        int[][] ans=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (i==0&&j==0)
                    ans[i][j]=after[0][0];
                else if (i==0 && j!=0)
                    ans[i][j]=after[i][j]-after[i][j-1];
                else if (i!=0 && j==0)
                    ans[i][j]=after[i][j]-after[i-1][j];
                else
                    ans[i][j]=after[i][j]+after[i-1][j-1]-after[i-1][j]-after[i][j-1];
            }
        }
        return ans;
         */
        for (int i=n-1;i>0;i--)
            for (int j=0;j<m;j++)
                after[i][j]-=after[i-1][j];
        for (int i=0;i<n;i++)
            for (int j=m-1;j>0;j--)
                after[i][j]-=after[i][j-1];
        return after;
    }
    public static void main(String[] args) {
        int[][] after={{1,3,6},{3,7,11}};
        after=computeBefore(after,after.length,after[0].length);
        for (int i=0;i< after.length;i++){
            for (int j=0;j<after[0].length;j++)
                System.out.print(after[i][j]+" ");
            System.out.println();
        }
    }
}
