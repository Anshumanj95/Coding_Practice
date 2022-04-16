package SortingPractice;

import java.util.Arrays;

public class Chocolate {
    public static int distribution(int[] arr,int n,int m){
        if(n==0||m==0)
            return 0;
        if(n<m)
            return -1;
        Arrays.sort(arr);
        int res=arr[m]-arr[0];
        for(int i=1;i+m-1<arr.length;i++)
            res=Math.min(res,arr[i+m-1]-arr[i]);
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 7, 11, 10, 9};

        int m = 3;

        int n = arr.length;
        System.out.println(distribution(arr, n, m));
    }
}
