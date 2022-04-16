package Sorting;

import java.util.Arrays;

public class HeapSort {
    //1.build max heap
    //2.repeatedly swap root with last node,reduce heap size by one,and heapify
    public static void buildHeap(int[] arr,int n){
        for(int i=(n-2)/2;i>=0;i--){
            maxHeapify(arr,n,i);
        }
    }
    public static void maxHeapify(int[] arr,int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && arr[left]>arr[largest])
            largest=left;
        if(right<n && arr[right]>arr[largest])
            largest=right;
        if(largest!=i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            maxHeapify(arr,n,largest);
        }
    }
    public static void Sort(int[] arr,int n){
        buildHeap(arr,n);
        for (int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeapify(arr,i,0);
        }
    }
    public static void main(String[] args) {
        int[] arr={4,12,56,1,3,2,50};
        Sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
