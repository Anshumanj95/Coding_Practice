package Sorting;

import java.util.Arrays;

public class  waveArray {
    public static void wave(int[] arr,int n){
        Arrays.sort(arr);
        for(int i=0;i<n-1;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
//for (int i = 0; i < n; i+=2)
//    {
//        // If current even element is smaller
//        // than previous
//        if (i>0 && arr[i-1] > arr[i] )
//            swap(arr, i-1, i);
//
//        // If current even element is smaller
//        // than next
//        if (i<n-1 && arr[i] < arr[i+1] )
//            swap(arr, i, i + 1);
//    }
    public static void main(String[] args) {
        int[] arr={5,1,3,2,4};
        wave(arr,arr.length);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
