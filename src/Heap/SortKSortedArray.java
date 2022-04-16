package Heap;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SortKSortedArray {
    //O(nlogk)
    public static void kSort(int[] arr,int k){
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<=k;i++){
            q.add(arr[i]);
        }
        int index=0;
        for(int i=k+1;i<arr.length;i++){
            arr[index++]=q.poll();
            q.add(arr[i]);
        }
        while (!q.isEmpty())
            arr[index++]=q.poll();
    }
    public static void main(String[] args) {
        int[] arr={9,8,7,19,18};
        kSort(arr,2);
        for(int e:arr)
            System.out.print(e+" ");
    }
}
