package PriorityQueue;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ReduceArrayToHalf {
    public static int minSetSize(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);
        if (map.size()==1)
            return 1;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i:map.values())
            pq.offer(i);
        int count=0;
        int ele=0;
        while (ele<n/2){
            ele+=pq.poll();
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr= {3,3,3,3,5,5,5,2,2,7};
    }
}
