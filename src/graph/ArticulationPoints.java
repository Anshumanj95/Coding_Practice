package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/*
In DFS tree, a vertex u is articulation point if one of the following two conditions is true.
       1.u is the root of DFS tree, and it has at least two children.
       2.u is not the root of DFS tree, and it has a child v such that no vertex in the subtree rooted with v has a back edge to one of the ancestors (in DFS tree) of u.
 */
public class ArticulationPoints {
    //discovery time:time in which we traverse a vertex in dfs tree root of tree as 1 time 1st child of root has time then first child of first child is 3 and so on...
    // low value: which is the lowest discovery time reaches from a vertex
    static class Graph{
        private final int V;
        private final ArrayList<ArrayList<Integer>> adj;
        int time=0;

        Graph(int v){
            V=v;
            adj=new ArrayList<>(V);
            for (int i=0;i<v;i++)
                adj.add(new ArrayList<>());
        }
        void addEdge(int u,int v){
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        void ArticulationPoint(){
            boolean[] visited=new boolean[V];
            int[] disc=new int[V];
            int[] low=new int[V];
            int[] parent=new int[V];
            boolean[] ap=new boolean[V];
            Arrays.fill(parent,-1);
            for(int i=0;i<V;i++){
                if (!visited[i])
                    findAp(i,visited,disc,low,parent,ap);
            }
            for (int i=0;i<V;i++){
                if (ap[i])
                    System.out.print(i+" ");
            }

        }
        void findAp(int u,boolean[] visited,int[] disc,int[] low,int[] parent,boolean[] ap){
            // Count of children in DFS Tree
            int child=0;
            // Mark the current node as visited
            visited[u]=true;
            // Initialize discovery time and low value
            disc[u]=low[u]=++time;
            // Go through all vertices adjacent to this
            for (int v : adj.get(u)) {
                // If v is not visited yet, then make it a child of u
                // in DFS tree and recur for it
                if (!visited[v]) {
                    child++;
                    parent[v] = u;
                    findAp(v, visited, disc, low, parent, ap);
                    // Check if the subtree rooted with v has
                    // a connection to one of the ancestors of u
                    low[u] = Math.min(low[u], low[v]);
                    // If u is root of DFS tree and has two or more children.
                    if (parent[u] == -1 && child > 1)
                        ap[u] = true;
                    // If u is not root and low value of one of
                    // its child is more than discovery value of u.
                    if (parent[u] != -1 && low[v] >= disc[u])
                        ap[u] = true;
                    // Update low value of u for parent function calls.
                } else if (v != parent[u])
                    low[u] = Math.min(low[u], disc[v]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Articulation points in first graph ");
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.ArticulationPoint();
        System.out.println();

    }
}
