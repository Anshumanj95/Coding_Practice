package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class MotherVertex {
    /*
    Very Nice Logical problem. Doing the work in V+E is main goal here. The idea is to keep storing the DFS call vertex that are not visited till point.Then in the end also check if the lastDFS vertex is actually a mother vertex or not.
    Given a Directed Graph, find a Mother Vertex in the Graph (if present).
    A Mother Vertex is a vertex through which we can reach all the other vertices of the Graph.

     */
    public static int mother(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited=new boolean[V];
        int lstVer=0;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                lstVer=i;
                dfs(i,adj,visited);
            }
        }
        Arrays.fill(visited,false);
        dfs(lstVer,adj,visited);
        for(int i=0;i<V;i++){
            if (!visited[i])
                return -1;
        }
        return lstVer;
    }
    public static void dfs(int u,ArrayList<ArrayList<Integer>> adj,boolean[] visited){
        visited[u]=true;
        for(int v:adj.get(u)){
            if(!visited[v])
                dfs(v,adj,visited);
        }
    }
    public static void main(String[] args) {

    }
}
