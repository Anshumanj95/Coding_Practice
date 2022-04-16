package Heap;

import java.util.PriorityQueue;

public class Kth_largest_element_in_a_stream {
    public static void KthLargest(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i=0;i<k;i++){
            pq.add(arr[i]);
            if(i<k-1)
                System.out.print(-1+" ");
            else
                System.out.print(pq.peek()+" ");
        }
        for(int i=k;i<arr.length;i++){
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
            System.out.print(pq.peek()+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={857,744,492,218,366,860};
        KthLargest(arr,3);
    }
}
