package DynamicProgramming;

import java.util.Arrays;

public class MinimumCoinsToMakeSum {
    public static int getMinimum(int[] arr,int sum){
        if(sum==0)
            return 0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(sum-arr[i]>=0){
                int subAns=getMinimum(arr,sum-arr[i]);
                if(subAns!=Integer.MAX_VALUE && subAns+1<ans)
                    ans=subAns+1;
            }
        }
        return ans;
    }
    public static int getMinimumDp(int[] arr,int sum){
        int[] dp=new int[sum+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=sum;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]<=i){
                    int res=dp[i-arr[j]];
                    if(res!=Integer.MAX_VALUE)
                        dp[i]=Math.min(dp[i],res+1);
                }
            }
        }
        for(int x:dp)
            System.out.print(x+" ");
        return dp[sum];
    }
    public static void main(String[] args) {
        int[] arr={7,5,1};
        int sum=18;
        System.out.println(getMinimum(arr,sum));
        System.out.println(getMinimumDp(arr,sum));

    }
}
