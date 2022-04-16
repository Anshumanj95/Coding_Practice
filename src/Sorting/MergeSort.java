package Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MergeSort {
    public static void sort(int[] arr,int l,int r){
        if(l<r){
            int m=(l+r)/2;
            sort(arr,0,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public static void merge(int[] arr,int l,int m,int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i]<=right[j]){
                arr[k]=left[i];
                k++;
                i++;
            }
            else{
                arr[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={5,3,89,45,34};
        sort(arr,0,arr.length-1);
        printArray(arr);

    }

}
