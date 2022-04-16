package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class KosarajuStronglyConnectedComponent {
    static class Graph{
        private final int V;
        private final ArrayList<ArrayList<Integer>> adj;
        Graph(int v){
            V=v;
            adj=new ArrayList<>(v);
            for(int i=0;i<V;i++){
                adj.add(new ArrayList<>());
            }
        }
        void addEdge(int v,int u){
            adj.get(v).add(u);
        }
        //dfs traversal

        public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
        {
            //code here
            int count=0;
            Stack<Integer> st=new Stack<>();
            boolean[] visited=new boolean[V];
            for(int i=0;i<V;i++)
                if(!visited[i])
                    topo(adj,i,visited,st);
            //reverse all the edges
            ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
            for(int i=0;i<V;i++){
                arr.add(new ArrayList<>());
            }
            int i=0;
            for(ArrayList<Integer> e:adj){
                for(int x:e)
                    arr.get(x).add(i);
                i++;
            }
            //traverse graph according to topological sort
            Arrays.fill(visited,false);
            while (!st.isEmpty()){
                int v=st.pop();
                if(!visited[v]){
                    count++;
                    dfs(arr,v,visited);
                    System.out.println();

                }
            }
            return count;
        }
        static void topo(ArrayList<ArrayList<Integer>> adj,int s,boolean[] vis,Stack<Integer> st){
            vis[s]=true;
            for(int x:adj.get(s)){
                if(!vis[x])
                    topo(adj,x,vis,st);
            }
            st.push(s);
        }
        static void dfs(ArrayList<ArrayList<Integer>> adj,int s,boolean[] vis){
            vis[s]=true;
            System.out.print(s+" ");
            for(int x:adj.get(s)){
                if(!vis[x])
                    dfs(adj,x,vis);
            }
        }
    }

    public static void main(String[] args) {
        Graph g=new Graph(5);
        g.addEdge(1,0);
        g.addEdge(0,2);
        g.addEdge(2,1);
        g.addEdge(0,3);
        g.addEdge(3,4);
        int count=g.kosaraju(5, g.adj);

    }
}
