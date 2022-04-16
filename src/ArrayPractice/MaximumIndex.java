package ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumIndex {
    public static int maximum(int[] arr){
        int n=arr.length;
        int i,j;
        int maxDiff=-1;
        int[] rmax=new int[n];
        int[] lmin=new int[n];
        lmin[0]=arr[0];
        for(i=1;i<n;i++)
            lmin[i]=Math.min(arr[i],lmin[i-1]);
        rmax[n-1]=arr[n-1];
        for(j=n-2;j>=0;j--)
            rmax[j]=Math.max(arr[j],rmax[j+1]);
        i=0;
        j=0;
        while (j<n &&i<n){
            if(lmin[i]<=rmax[j]){
                maxDiff=Math.max(maxDiff,j-i);
                j++;
            }
            else
                i++;
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        int[] A = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(maximum(A));
       int max= Arrays.stream(A).min().getAsInt();

    }
}
