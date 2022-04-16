package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOfNodes {
    static int level;
    public static int levelOfX(ArrayList<ArrayList<Integer>> adj,int v,int x){
        boolean[] visited=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i])
                level=-1;
                if(bfs(i,adj,visited,x))
                    return level;
        }
        return -1;
    }
    public  static boolean bfs(int src,ArrayList<ArrayList<Integer>> adj,boolean[] visited,int x){
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        visited[src]=true;
        while (!q.isEmpty()){
            int size=q.size();
            level++;
            for(int i=0;i<size;i++){
                int u=q.poll();
                if(u==x)
                    return true;
                for(int v:adj.get(u)){
                    if(!visited[v]){
                        visited[v]=true;
                        q.add(v);
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
