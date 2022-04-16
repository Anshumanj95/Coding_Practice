package DynamicProgramming;

import java.util.Arrays;

public class MaximumSumIncreasingSubsequence {
    public static int maxSum(int[] arr,int n){
        int[] msis=new int[n];
        for (int i=0;i<n;i++){
            msis[i]=arr[i];
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    msis[i]=Math.max(msis[i],arr[i]+msis[j]);
                }
            }
        }
        return Arrays.stream(msis).max().getAsInt();
    }
    public static void main(String[] args) {
        int[] arr={3,20,4,6,7,30};
        System.out.println(maxSum(arr,arr.length));
    }
}
