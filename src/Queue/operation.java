package Queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class operation {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(12);//add throw error if capacity is full.offer return false
        q.offer(23);
        q.offer(45);
        q.offer(12);
        q.offer(23);
        System.out.println(q);
        System.out.println(q.poll());//remove last element(remove function throw error if queue is empty).poll return null
        System.out.println(q.peek());//return last element
        System.out.println(q);
        q.offer(12);
        System.out.println(Collections.frequency(q,12));
    }
}
