package graph;

import java.util.ArrayList;

public class Possiblepathsbetween2vertices {
    static int count;
    //dfs and backtrack
    public static int countPath(int v, ArrayList<ArrayList<Integer>> adj,int src,int des){
        if(src==des)
            return 1;
        boolean[] visited=new boolean[v];
        count=0;
        dfs(src,des,adj,visited);
        return count;
    }
    public static void dfs(int src,int des,ArrayList<ArrayList<Integer>> adj,boolean[] visited){
        visited[src]=true;
        for(int v:adj.get(src)){
            if(!visited[v]){
                if(v==des) count++;
                dfs(v,des,adj,visited);
            }
        }
        //backtrack step
        visited[src]=false;
    }
    public static void main(String[] args) {


    }
}
