package PriorityQueue;
import java.util.*;
public class KthLargest {
    public static void largest(int[] arr,int k) {
        // simple just sort array then print kth element but time taken is O(nlogn)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++)
            pq.add(arr[i]);
        for (int i = k; i < arr.length; i++) {
            if (arr[i] > pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                System.out.print(pq.poll());
            }
        }
        //another solution using 2 for loop time in both is O(nlogk)
//        for(int i=0;i<arr.length;i++){
//            if(pq.size()==k &&arr[i]>pq.peek()){
//                pq.poll();
//                pq.add(arr[i]);
//            }
//            else if(pq.size()<k){
//                pq.add(arr[i]);
//            }
//        }
//        System.out.println(pq);
//    }
    }
    public static void main(String[] args) {
        int[] arr={4, 3, 7, 6, 5};
        int k=5;
        largest(arr,k);
    }
}
