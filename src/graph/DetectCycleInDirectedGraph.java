package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static graph.Adjacency_List_implementation.addEdge;

public class DetectCycleInDirectedGraph {
    //back edge - when a recursion function calls its parent then its known as back edge
    // therefore we maintain recSt array which is just same as recursion stack
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj,int v){
        boolean[] visited=new boolean[v];
        boolean[] recSt=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                if(dfsRec(adj,i,visited,recSt))
                    return true;
            }
        }
        return false;
    }
    public static boolean dfsRec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited,boolean[] resSt){
        visited[s]=true;
        resSt[s]=true;
        for(int i: adj.get(s)){
            if(!visited[i] && dfsRec(adj,i,visited,resSt))
                return true;
            else if(resSt[i])
                return true;
        }
        return false;
    }
    /* it simply use kahn topological sorting algo which is work only for acyclic graph
    here we use a count variable first we put all 0 in degree edges as in kahn algo then if there is a cycle is graph
    at that point q is empty and count!=vertex of graph we return false otherwise return true
     */
    public static boolean detect(ArrayList<ArrayList<Integer>> adj,int v){
        int[] inDegree=new int[v];
        for(int i=0;i<v;i++){
            for(int x:adj.get(i))
                inDegree[x]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(inDegree[i]==0)
                q.add(i);
        }
        int count=0;
        while (!q.isEmpty()){
            int u=q.poll();
            for(int x:adj.get(u)){
                if(--inDegree[x]==0)
                    q.add(x);
            }
            count++;
        }
        return (count!=v);
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,2,1);
        addEdge(adj,2,3);
        addEdge(adj,3,4);
        addEdge(adj,4,5);
        addEdge(adj,5,3);

        if(detect(adj,V))
            System.out.println("Cycle found");
        else
            System.out.println("No cycle found");

    }
}
