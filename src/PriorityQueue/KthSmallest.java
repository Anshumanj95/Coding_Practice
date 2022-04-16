package PriorityQueue;

import java.util.*;

public class KthSmallest {
    public static void smallest(int[] arr,int n,int k){
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            if(p.size()==k&&arr[i]<p.peek()){
                p.poll();
                p.add(arr[i]);
            }
            else if(p.size()<k){
                p.add(arr[i]);
            }
        }
        System.out.println(p.peek());
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,5,4};
        int k=5;
        smallest(arr,arr.length,k);
    }
}
