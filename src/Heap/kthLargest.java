package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargest {
    public static int KthLargest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            p.add(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(arr[i]>p.peek()){
                p.poll();
                p.add(arr[i]);
            }
        }
        int res=0;
        for(int i=0;i<k;i++){
            if(i==k-1)
                res=p.poll();
        }
        return res;
    }
    public static int kthSmallest(int arr[], int n, int k)
    {

        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            if(p.size()==k &&arr[i]<p.peek()){
                p.poll();
                p.add(arr[i]);
            }
            else if(p.size()<k)
                p.add(arr[i]);
        }
        return p.peek();
    }
    public static void main(String[] args) {
        int[] arr={3,5,4,2,9};
        System.out.println(kthSmallest(arr,arr.length,3));
        System.out.println(KthLargest(arr,arr.length,3));
    }
}
