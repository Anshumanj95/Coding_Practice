package PriorityQueue;
import java.util.*;
public class MinimumCostRopes {
    public static long minCost(long[] arr){
        PriorityQueue<Long> p=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
            p.offer(arr[i]);
        long sum=0;
        while(p.size()!=1){
            long f=p.poll();
            long s=p.poll();
            sum=sum+(f+s);
            p.offer(f+s);
        }

        return sum;
    }
    public static void main(String[] args) {
        long[] arr={4,3,2,5};
        System.out.println(minCost(arr));
    }
}
