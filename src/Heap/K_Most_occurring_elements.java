package Heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class K_Most_occurring_elements {
    public static int kthMostFrequent(int[] arr,int k){
        HashMap<Integer,Integer> h=new HashMap<>();
        for (int i=0;i<arr.length;i++)
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(Integer freq:h.values())
            pq.add(freq);
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=pq.poll();
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,1,3,5,4,3,6,2,1};
        int k=2;
        System.out.println(kthMostFrequent(arr,k));
    }
}
