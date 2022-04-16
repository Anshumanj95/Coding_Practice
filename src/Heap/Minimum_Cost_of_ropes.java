package Heap;

import java.util.PriorityQueue;

public class Minimum_Cost_of_ropes {
    public static int cost(int[] arr){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i=0;i<arr.length;i++)
            pq.add(arr[i]);
        int sum=0;
        while (pq.size()!=1){
            int first=pq.poll();
            int second=pq.poll();
            sum+=(first+second);
            pq.add(first+second);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={4,3,2,6};
        System.out.println(cost(arr));
    }
}
