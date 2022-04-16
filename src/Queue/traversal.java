package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class traversal {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(12);
        q.offer(23);
        q.offer(45);
        q.offer(21);
        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
    }
}
