package SortingPractice;

import java.util.Arrays;

public class SortedSquare {
    public static int[] sorted_square(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int i=0;
        int j=n-1;
        for (int k=n-1;k>=0;k--){
            if (Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k]=arr[i]*arr[i];
                i++;
            }
            else{
                ans[k]=arr[j]*arr[j];
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sorted_square(arr)));
    }
}
