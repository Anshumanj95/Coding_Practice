package graph;

import java.util.Arrays;
/*
facts about dijkstra algorithm
1.it does not use for negative weighted graph it can give wrong answer
2.if we get the shortest path from src to  some vertex then we add some value to all the edges weight then we get same path or not?
    No, because there will be a chance that we reach from src to destination by two vertex between them so distance is increase by 2*added value
    if there is another path from src to destination by one vertex between them so distance is increase by 1*added
    then new answer is second one therefore is it false
3. above question is true for multiple some value to all edges then answer is remain same
   for more clarity do some pen and paper example and see it
 */
public class MinimumSpanningTreeDijkstra {
    public static int[] dijkstra(int[][] graph,int src){
        int V=graph.length;
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        boolean[] finalized=new boolean[V];
        for(int count=0;count<V;count++) {
            int u = -1;
            //getting smaller value from non finalized vertex
            //use min heap and use extract in operation
            for (int i = 0; i < V; i++) {
                if (!finalized[i] && (u == -1 ||dist[i]<dist[u]))
                    u=i;
            }
            finalized[u]=true;
            //using relax operation simply update dist[v] from src if you find smaller distance from u to v
            // decrease key operation of min heap and instead of using adjacency graph use adjacency list for better time
            for(int v=0;v<V;v++){
                if(!finalized[v] && graph[u][v]!=0){
                    dist[v]=Math.min(dist[v],dist[u]+graph[u][v]);
                }
            }
        }
        return dist;

    }
    public static void main(String[] args) {
        int[][] grid={{9,4,9,9},{6,7,6,4},
                {8,3,3,7},{7,4,9,10}};
        System.out.println(Arrays.stream(dijkstra(grid,0)).sum());
    }
}
