package Queue;

import java.util.*;

public class reverseK {
    public static Queue<Integer> reverse(Queue<Integer> q,int k){
        if(q.size()==0||k<=0){
            return q;
        }
        Deque<Integer> s=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            //add element at head
            s.push(q.poll());
        }
        for(int i=0;i<k;i++){
            //add element at tail
            q.offer(s.pop());
        }
        for(int i=0;i< q.size()-k;i++){
            q.offer(q.poll());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(12);
        q.offer(23);
        q.offer(45);
        q.offer(23);
        q.offer(21);
        q.offer(45);
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        Queue<Integer> ans=reverse(q,k);
        System.out.println(q);
    }
}
