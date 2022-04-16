package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class TarjansStronglyConnectedComponent {
    static class Graph{
        private final int V;
        private final ArrayList<ArrayList<Integer>> adj;
        int time;
        Graph(int v){
            V=v;
            adj=new ArrayList<>();
            for(int i=0;i<V;i++){
                adj.add(new ArrayList<>());
            }
            time=0;
        }
        void addEdge(int u,int v){
            adj.get(u).add(v);
        }
        void SCC(){
            int[] disc=new int[V];
            int[] low=new int[V];
            Arrays.fill(disc,-1);
            Arrays.fill(low,-1);
            boolean[] stackMember=new boolean[V];
            Stack<Integer> st=new Stack<>();
            for(int i=0;i<V;i++){
                if(disc[i]==-1)
                    findSCC(i,low,disc,stackMember,st);
            }
        }
        void findSCC(int u,int[] low,int[] disc,boolean[] stackMember,Stack<Integer> st){
            disc[u]=time;
            low[u]=time;
            time++;
            stackMember[u]=true;
            st.push(u);
            for(int v:adj.get(u)){
                if(disc[v]==-1){
                    findSCC(v,low,disc,stackMember,st);
                    low[u]=Math.min(low[u],low[v]);
                }
                else if(stackMember[v]){
                    low[u]=Math.min(low[u],disc[v]);
                }
            }
            int w=-1;
            if(low[u]==disc[u]){
                while (w!=u){
                    w=st.pop();
                    System.out.print(w+" ");
                    stackMember[w]=false;
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        System.out.println("SSC in the graph ");
        g.SCC();

    }
}
