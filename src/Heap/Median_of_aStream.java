package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Median_of_aStream {
/*
    class Solution
    {
        //Function to insert heap.
        static PriorityQueue<Integer> greater=new PriorityQueue<>();
        static PriorityQueue<Integer> smaller=new PriorityQueue<>(Collections.reverseOrder());
        public static void insertHeap(int x)
        {
            // add your code here
            if(smaller.isEmpty()||smaller.peek()>=x)
                smaller.add(x);
            else
                greater.add(x);
            balanceHeaps();
        }

        //Function to balance heaps.
        public static void balanceHeaps()
        {
            // add your code here
            if(smaller.size()>greater.size()+1){
                greater.add(smaller.poll());
            }
            else if(smaller.size()<greater.size())
                smaller.add(greater.poll());
        }

        //Function to return Median.
        public static double getMedian()
        {
            // add your code here
            if(smaller.size()==greater.size())
                return (smaller.peek()+greater.peek())/2.0;
            else
                return smaller.peek();
        }

    }
 */
    public static void findAllMedian(int[] arr){
        //min heap
        PriorityQueue<Integer> greater=new PriorityQueue<>();
        //max heap
        PriorityQueue<Integer> smaller=new PriorityQueue<>(Collections.reverseOrder());
        smaller.add(arr[0]);
        System.out.print(arr[0]+" ");
        for(int i=1;i<arr.length;i++){
            int x=arr[i];
            if(smaller.size()> greater.size()){
                if(smaller.peek()>x){
                    greater.add(smaller.poll());
                    smaller.add(x);
                }
                else{
                    greater.add(x);
                }
                System.out.print((double) (smaller.peek()+greater.peek())/2+" ");
            }
            else{
                if(x<= smaller.peek()){
                    smaller.add(x);
                }
                else{
                    greater.add(x);
                    smaller.add(greater.poll());
                }
                System.out.print(smaller.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={12,15,10,5,8,7,16};
        findAllMedian(arr);
    }
}
