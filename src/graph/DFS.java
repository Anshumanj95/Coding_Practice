package graph;

import java.util.ArrayList;

import static graph.Adjacency_List_implementation.addEdge;

public class DFS {
    //it is as same as preorder traversal of tree but with some complexity dfs in a recursive in nature it call for source then for its edges(for
    //small value edge first in general) then call for its edges and so on....
    public static void dfs(ArrayList<ArrayList<Integer>> arr,int v,int s){
        boolean[] visited=new boolean[v+1];
        dfsRec(arr,s,visited);
        /* for disconnected graph simply run a loop for i-0 to v then check if visited[i]==false then class dfsRec(arr,i,visited)
        for (int i=0;i<v;i++){
            if(!visited[i]){
                dfsRec(arr,i,visited);
            }
        }
         */
    }
    public static void dfsRec(ArrayList<ArrayList<Integer>> arr,int s,boolean[] visited){
        visited[s]=true;
        System.out.print(s+" ");
        for(int u:arr.get(s)){
            if(!visited[u]){
                dfsRec(arr,u,visited);
            }
        }
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>(v);
        for (int i=0;i<v;i++)
            arr.add(new ArrayList<>());
        addEdge(arr,0,1);
        addEdge(arr,0,2);
        addEdge(arr,1,3);
        addEdge(arr,1,4);
        addEdge(arr,2,3);
        addEdge(arr,3,4);
        dfs(arr,v,0);
    }
}
