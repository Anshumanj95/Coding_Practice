package graph;

import java.util.ArrayList;

public class Adjacency_List_implementation {
    public static void addEdge(ArrayList<ArrayList<Integer>> arr,int v,int u){
        //for undirected graph space is O(v+2*e)
        arr.get(v).add(u);
        arr.get(u).add(v);
        // for directed graph space isO(v+e) arr.get(v).add(u) is only used
    }
    public static void printGraph(ArrayList<ArrayList<Integer>> arr){
        for (ArrayList<Integer> integers : arr) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
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
        printGraph(arr);

    }
}
