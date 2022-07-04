package Interviewbit.Array;

import java.util.Arrays;

public class MaximumUnsortedArray {
    public static int maxUnsorted(int[] arr){
        int[] copy= Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        int s=arr.length,e=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=copy[i]){
                s=Math.min(s,i);
                e=Math.max(e,i);
            }
        }
        return e-s+1>=0?e-s+1:-1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,4,5};
        System.out.println(maxUnsorted(arr));
    }
}
