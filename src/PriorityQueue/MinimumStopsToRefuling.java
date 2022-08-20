package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumStopsToRefuling {
    public static int minimumStops(int target,int start,int[][] stations){
        if (start>target)
            return 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0,n=stations.length,stops=0,maxDis=start;
        while (maxDis<target){
            while (i<n && stations[i][0]<=maxDis)
                pq.offer(stations[i++][1]);
            if (pq.isEmpty())
                return -1;
            maxDis+=pq.poll();
            stops++;
        }
        return stops;
    }
    public static void main(String[] args) {
        int target=100;
        int start=10;
        //stations[i][0]=distance stations[i][1]=fuel present
        int[][] stations={{10,60},{20,30},{30,30},{60,40}};
        System.out.println(minimumStops(target,start,stations));
    }
}
