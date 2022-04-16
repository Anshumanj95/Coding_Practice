package graph;

import java.util.ArrayList;
import java.util.Stack;

import static graph.TopologicalSortBFS.addEdge;

public class TopologicalSortByDFS {
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int v){
        boolean[] visited=new boolean[v];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<v;i++){
            if(!visited[i]){
                dfsRec(adj,i,st,visited);
            }
        }
        while (!st.isEmpty())
            System.out.print(st.pop()+" ");
    }
    public static void dfsRec(ArrayList<ArrayList<Integer>> adj,int u,Stack<Integer> st,boolean[] visited){
        visited[u]=true;
        for(int v:adj.get(u)){
            if(!visited[v]){
                dfsRec(adj,v,st,visited);
            }
        }
        st.push(u);
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0, 2);
        addEdge(adj,0, 3);
        addEdge(adj,1, 3);
        addEdge(adj,1, 4);
        addEdge(adj,2, 3);

        System.out.println("Following is a Topological Sort of");
        dfs(adj,V);

    }
}
