package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class reversal {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(12);
        q.offer(23);
        q.offer(45);
        System.out.println(q);
        Deque<Integer> s=new ArrayDeque<>();
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        System.out.println(s);
    }
}
