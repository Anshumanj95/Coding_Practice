package Matrix;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumRectangleSum {
    public static int kadane(int[] arr){
        int max=Integer.MIN_VALUE;
        int curr=0;
        for (int i:arr){
            curr=Math.max(i,curr+i);
            max=Math.max(max,curr);
        }
        return max;
    }
    public static int maxRectangleSum(int r,int c,int[][] mat){
        int ans=Integer.MIN_VALUE;
        for (int i=0;i<r;i++){
            int[] currSum=new int[c];
            for (int j=i;j<r;j++){
                for (int k=0;k<c;k++){
                    currSum[k]+=mat[j][k];
                }
                ans=Math.max(ans,kadane(currSum));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat={{1,2,-1,-4,-20},
                {-8,-3,4,2,1},
                {3,8,10,1,3},
                {-4,-1,1,7,-6}};
        System.out.println(maxRectangleSum(mat.length,mat[0].length,mat));
    }
}
