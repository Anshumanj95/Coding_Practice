package Heap;

import java.util.PriorityQueue;

public class printKthClosest {
    static class Pair
    {
        Integer key;
        Integer value;

        public Pair(Integer key, Integer value)
        {
            this.key = key;
            this.value = value;
        }
    }

    public static void printKClosest(int[] arr, int n, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (p1, p2) -> p2.value.compareTo(
                        p1.value));
        for(int i = 0; i < k; i++)
        {
            pq.offer(new Pair(arr[i], Math.abs(arr[i] - x)));
        }
        for(int i = k; i < n; i++)
        {
            int diff = Math.abs(arr[i] - x);
            if(pq.peek().value>diff) {
                pq.poll();
                pq.offer(new Pair(arr[i], diff));
            }
        }
        while(!pq.isEmpty())
        {
            System.out.print(pq.poll().key + " ");
        }
    }

        public static void main (String[] args)
        {
            int[] arr = { 10,30,5,40,38,80,70 };

            int size = arr.length;

            int x=35; int k = 3;

            printKClosest(arr,size,k,x);
        }
    }
