package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class BridgesInGraph {
    static class Graph {
        private final int V;
        private final ArrayList<ArrayList<Integer>> adj;
        int time = 0;

        Graph(int v) {
            V = v;
            adj = new ArrayList<>(V);
            for (int i = 0; i < v; i++)
                adj.add(new ArrayList<>());
        }
        void addEdge(int u,int v){
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
         void Bridge(){
            boolean[] visited=new boolean[V];
            int[] disc=new int[V];
            int[] low=new int[V];
            int[] parent=new int[V];
             Arrays.fill(parent,-1);
             for(int i=0;i<V;i++){
                 if(!visited[i])
                     findBridge(i,visited,disc,low,parent);
             }
         }
         void findBridge(int u,boolean[] visited,int[] disc,int[] low,int[] parent){
            visited[u]=true;
            low[u]=disc[u]=++time;
            for(int v:adj.get(u)){
                if(!visited[v]){
                    parent[v]=u;
                    findBridge(v,visited,disc,low,parent);
                    low[u]=Math.min(low[u],low[v]);
                    if(low[v]>disc[u])
                        System.out.println(u+"-"+v);
                }
                else if(v!=parent[u])
                    low[u]=Math.min(low[u],disc[v]);
            }
         }
    }
    public static void main(String[] args) {
        System.out.println("Bridges in first graph ");
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.Bridge();
    }
}
