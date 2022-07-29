package DynamicProgramming;

import java.util.Arrays;

public class DeleteAndEarn {
    //dp[i]=store max points after remove ith element
    public static int maxPoint(int[] arr){
        int maxNumber= Arrays.stream(arr).max().getAsInt();
        int[] dp=new int[20005];
        int[] freq=new int[20005];
        for (int i:arr)
            freq[i]++;
        dp[1]=freq[1];
        dp[2]=Math.max(dp[1],freq[2]*2);
        for (int i=3;i<=maxNumber;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+freq[i]*i);
        }
        return dp[maxNumber];
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,4,5,5,5,6};
        System.out.println(maxPoint(arr));
    }
}
