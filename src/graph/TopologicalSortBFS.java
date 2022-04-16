package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortBFS {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int v,int u){
        adj.get(v).add(u);
    }
    //kahn's algorithm O(v+e) this sorting topological sorting is only for acyclic graph(which does not have cycle )
    public static void sort(ArrayList<ArrayList<Integer>> adj,int v){
        int[] inDegree=new int[v];
        for(int u=0;u<v;u++){
            for(int x: adj.get(u))
                inDegree[x]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(inDegree[i]==0)
                q.add(i);
        }
        while (!q.isEmpty()){
            int u=q.poll();
            System.out.print(u+" ");
            for (int x: adj.get(u)){
                if(--inDegree[x]==0)
                    q.add(x);
            }
        }
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
        sort(adj,V);
    }
}
