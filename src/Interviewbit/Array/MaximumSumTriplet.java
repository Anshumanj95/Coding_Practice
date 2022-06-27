package Interviewbit.Array;

import java.util.Arrays;
import java.util.TreeSet;

public class MaximumSumTriplet {
    public static int maxSumTrip(int[] arr,int n){
        int[] right=new int[n];
        right[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--)
            right[i]=Math.max(right[i+1],arr[i]);
        System.out.println(Arrays.toString(right));
        int ans=0;

        TreeSet<Integer> lowValue=new TreeSet<>();
        lowValue.add(arr[0]);
        for (int i = 1; i < n-1 ; i++) {
            Integer sec=arr[i];
            Integer first=lowValue.lower(arr[i]);
            Integer third=right[i+1];
            if (first!=null && first<sec && sec<third)
                ans=Math.max(ans,first+sec+third);
            lowValue.add(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,5,3,1,4,9};
        System.out.println(maxSumTrip(arr,arr.length));

    }
}
