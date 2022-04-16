package Heap;

import java.util.PriorityQueue;

public class MaximumPurchaseInGivenSum {
    public static int maxPurchase(int[] arr,int sum){
        PriorityQueue<Integer> q=new PriorityQueue<>();
        int res=0;
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
        }
        for (int i=0;i<arr.length;i++){
            if(q.peek()<=sum){
                sum-=q.poll();
                res++;
            }
            else{
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,12,5,110,200};
        System.out.println(maxPurchase(arr,20));
    }
}
