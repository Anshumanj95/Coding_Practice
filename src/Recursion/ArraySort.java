package Recursion;

public class ArraySort {
    public static boolean sorted(int[] arr,int n){
        if(n==0||n==1)
            return true;
        return (arr[n-1]>arr[n-2] && sorted(arr,n-1));
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,56,9};
        System.out.println(sorted(arr,arr.length));
    }
}
