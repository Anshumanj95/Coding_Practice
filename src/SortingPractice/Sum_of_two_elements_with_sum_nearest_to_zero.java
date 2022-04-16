package SortingPractice;

import java.util.Arrays;

public class Sum_of_two_elements_with_sum_nearest_to_zero {
    public static int closeToZero(int[] arr,int n){
        Arrays.sort(arr);
        int i=0,j=n-1;
        int ans=Integer.MAX_VALUE;
        while (i<j){
            int curr=arr[i]+arr[j];
            if (Math.abs(curr)<Math.abs(ans))
                ans=curr;
            if (Math.abs(ans)==Math.abs(curr))
                ans=Math.max(ans,curr);
            if (curr<0)
                i++;
            else
                j--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-66,-8,67};
        System.out.println(closeToZero(arr,arr.length));

    }
}
