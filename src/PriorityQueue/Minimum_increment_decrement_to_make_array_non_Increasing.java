package PriorityQueue;

import com.company.Prime;

import java.util.PriorityQueue;

public class Minimum_increment_decrement_to_make_array_non_Increasing {
    public static int minimum(int[] arr,int n){
        PriorityQueue<Integer> q=new PriorityQueue<>();
        int count=0;
        for (int i:arr){
            if (!q.isEmpty() && q.peek()<i){
                count+=i-q.poll();
                q.add(i);
            }
            q.add(i);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={3,1,5,1};
        System.out.println(minimum(arr,arr.length));
    }
}
