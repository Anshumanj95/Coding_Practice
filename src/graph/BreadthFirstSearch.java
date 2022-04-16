package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static graph.Adjacency_List_implementation.addEdge;

public class BreadthFirstSearch {
    //bfs is same as level order traversal of tree with some more complexity
    //Given an undirected graph and a source vertex 's' ,print B.F.S. from given source.
    //O(v+e)
    public static void bfsWithSource(ArrayList<ArrayList<Integer>> arr,int s){
        boolean[] visited=new boolean[arr.size()+1];
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
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>(v);
        for (int i=0;i<v;i++)
            arr.add(new ArrayList<>());
        addEdge(arr,0,1);
        addEdge(arr,0,2);
        addEdge(arr,1,2);
        addEdge(arr,1,3);
        bfsWithSource(arr,0);
    }
}
