package PriorityQueue;

import java.util.ArrayList;
import java.util.*;

public class maxMinheap {
    //root node is lowest
    public static PriorityQueue<Integer> minheap(ArrayList<Integer> arr){
        PriorityQueue<Integer>ans=new PriorityQueue<>(arr);
        return ans;
    }
    // root node is highest
    public static PriorityQueue<Integer> maxheap(ArrayList<Integer> arr){
        PriorityQueue<Integer> ans1=new PriorityQueue<>(Collections.reverseOrder());
        for(int e:arr)
            ans1.add(e);
        return ans1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(23);
        al.add(21);
        al.add(34);
        al.add(56);
        al.add(1);
        al.add(3);
        al.add(4);
        al.add(32);
        //in increasing order not sure
        PriorityQueue<Integer> ans=minheap(al);
        for(int e:ans)
            System.out.print(e+" ");
        System.out.println();
        //in decreasing order not sure
        PriorityQueue<Integer> ans1=maxheap(al);
        for(int e:ans1)
            System.out.print(e+" ");
    }
}
