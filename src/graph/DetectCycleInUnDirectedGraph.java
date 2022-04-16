package graph;

import java.util.ArrayList;

import static graph.Adjacency_List_implementation.addEdge;

public class DetectCycleInUnDirectedGraph {
    public static boolean Dfs(ArrayList<ArrayList<Integer>> adj,int v){
        boolean[] visited=new boolean[v];
        for(int i=0;i<v;i++){
           if(!visited[i]){
               if(dfsRec(adj,i,visited,-1))
                   return true;
           }
        }
        return false;
    }
    // we take parent variable for get error  prev vertex is always adjacent of current, and it
    // returns true but actual answer is false 1->2 1 is adjacent of 2 and 2 is also adjacent of 1 it gives true
    //in output which is wrong therefore we maintain parent variable else if condition
    public static boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int s,boolean[] visited,int parent){
        visited[s]=true;
        for(int u:adj.get(s)){
            if(!visited[u]) {
                if (dfsRec(adj, u, visited, s)) {
                    return true;
                }
            }
            else if(u!=parent)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,4);
        addEdge(adj,4,5);
        addEdge(adj,1,3);
        addEdge(adj,2,3);

        if(Dfs(adj,V))
            System.out.println("Cycle found");
        else
            System.out.println("No cycle found");

    }
}
