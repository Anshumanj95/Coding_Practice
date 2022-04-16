package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static graph.Adjacency_List_implementation.addEdge;
//O(v+e)
public class BFS_on_disconnected_graphs {
    public static void bfs(ArrayList<ArrayList<Integer>> arr, int s,boolean[] visited){
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        visited[s]=true;
        while (!q.isEmpty()){
            int u=q.poll();
            System.out.print(u+" ");
            for(int v:arr.get(u)){
                if(!visited[v]){
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
    }
    //B.F.S on disconnected graphs.
    public static void bfsDis(ArrayList<ArrayList<Integer>> arr,int V){
        boolean[] visited=new boolean[V+1];
        for(int i=0;i<V;i++){
            if(!visited[i])
                bfs(arr,i,visited);
        }
    }
    //Print number of islands in a graph (or number of connected components in a graph).
    public static int countConnectedComponent(ArrayList<ArrayList<Integer>> arr,int V){
        int count=0;
        boolean[] visited=new boolean[V+1];
        for(int i=0;i<V;i++){
            if(!visited[i]) {
                bfs(arr, i, visited);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(v);
        for (int i=0;i<v;i++)
            adj.add(new ArrayList<>());
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,4,5);
        addEdge(adj,5,6);
        addEdge(adj,4,6);
        bfsDis(adj,v);

    }
}
