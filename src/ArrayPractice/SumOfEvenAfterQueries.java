package ArrayPractice;

import java.util.Arrays;

public class SumOfEvenAfterQueries {
    public static int[] sumOfEven(int[] arr,int[][] queries){
        int n=arr.length;
        int[] ans=new int[n];
        int sum=0;
        for (int i:arr){
            if (i%2==0)
                sum+=i;
        }
        int i=0;
        for (int[] curr:queries){
            int val=curr[0];
            int idx=curr[1];
            if (arr[idx]%2==0)
                sum-=arr[idx];
            arr[idx]+=val;
            if (arr[idx]%2==0)
                sum+=arr[idx];
            ans[i++]=sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[][] queries={{1,0},{-3,1},{-4,0},{2,3}};
        System.out.println(Arrays.toString(sumOfEven(arr,queries)));
    }
}
