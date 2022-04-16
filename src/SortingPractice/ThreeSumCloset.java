package SortingPractice;

import java.util.Arrays;

public class ThreeSumCloset {
    public static int closeToX(int[] arr,int n,int x){
        Arrays.sort(arr);
        int ans=Integer.MAX_VALUE;
        for (int k=0;k<n-2;k++){
            int i=k+1,j=n-2;
            while (i<j){
                int curr=arr[i]+arr[j]+arr[k];
                if (Math.abs(curr-x)<Math.abs(ans-x))
                    ans=curr;
                if (Math.abs(curr-x)==Math.abs(ans-x))
                    ans=Math.max(ans,curr);
                if (curr<x)
                    i++;
                else
                    j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-7,9,8,3,1,1};
        System.out.println(closeToX(arr,arr.length,2));
    }
}
