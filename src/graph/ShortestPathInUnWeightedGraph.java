package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static graph.Adjacency_List_implementation.addEdge;

public class ShortestPathInUnWeightedGraph {
    public static int[] MiniDist(ArrayList<ArrayList<Integer>> adj,int v,int s){
        int[] dist=new int[v];
        Arrays.fill(dist,Integer.MIN_VALUE);
        dist[s]=0;
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[v];
        q.add(s);
        visited[s]=true;
        while (!q.isEmpty()){
            int u=q.poll();
            for(int i:adj.get(u)){
                if(!visited[i]){
                    dist[i]=dist[u]+1;
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        int[] dist=MiniDist(adj,V,0);
        for(int i:dist)
            System.out.print(i+" ");
    }
}
