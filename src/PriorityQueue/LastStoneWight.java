package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWight {
    public static int lastStone(int[] arr){
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for (int i:arr)
            q.add(i);
        while (q.size()>1){
            int y=q.poll();
            int x=q.poll();
            if (x!=y)
                q.add(y-x);
        }
        return q.isEmpty()?0:q.peek();
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3};
        System.out.println(lastStone(arr));
    }
}
