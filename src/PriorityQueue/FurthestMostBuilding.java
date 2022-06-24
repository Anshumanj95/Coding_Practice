package PriorityQueue;

import java.util.PriorityQueue;

public class FurthestMostBuilding {
    public static int furthestMost(int[] heights,int bricks,int ladder){
        int n=heights.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int brickUsed=0;
        for (int i=1;i<n;i++){
            int diff=heights[i]-heights[i-1];
            if (diff>0){
                pq.add(diff);
                if (pq.size()>ladder)
                    brickUsed+=pq.remove();
                if (brickUsed>bricks)
                    return i-1;
            }
        }
        return n-1;
    }
    public static void main(String[] args) {
        int[] heights={4,2,7,6,9,14,12};
        System.out.println(furthestMost(heights,5,1));
    }
}
