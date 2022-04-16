package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {
    public static void BubbleSortNormal(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            System.out.println("Number of pass:"+(i+1));
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void BubbleSortAdaptive(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            System.out.println("Number of pass: "+(i+1));
            boolean isSorted=true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted=false;
                }
            }
            if(isSorted)
                return;
        }
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        int[] arr={12,54,65,7,23,9};
        int[] arr={1,3,2,5,4};
        int n=arr.length;
//        System.out.println("Before sorting");
//        printArray(arr);
//        BubbleSortNormal(arr,arr.length);
//        System.out.println("After sorting");
//        printArray(arr);
//        System.out.println("Before sorting");
//        printArray(arr);
        BubbleSortAdaptive(arr,arr.length);
//        System.out.println("After sorting");
//        printArray(arr)

    }
}
