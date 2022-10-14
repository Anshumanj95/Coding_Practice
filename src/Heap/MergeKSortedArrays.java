package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
    static class triplet{
        int val;
        int aPos;
        int vPos;
        triplet(int val,int aPos,int vPos){
            this.val=val;
            this.aPos=aPos;
            this.vPos=vPos;
        }

    }
    // it is better than 1. if we store all element of all array in one array then sort that arr it takes O(nk lognk)
    //2. second method store first arr in res array then merge it with other arrays and update current res array as last two array
    // using merge procedure of merge Sort it takes O(nk^2)
    //3. in this method we use min heap we store an object of class triplet in this we store value of first element of all
    // array, position of array, index at which value present on that array store this for all first element of all array
    // then we extract min from pq and add next element of last removing array if it has more element before adding we store
    // value of last removing element it takes O(nk logK)
    public static ArrayList<Integer> merge(ArrayList<ArrayList<Integer>> arr){
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<triplet> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for (int i=0;i<arr.size();i++)
            pq.add(new triplet(arr.get(i).get(0),i,0));
        while (!pq.isEmpty()){
            triplet curr= pq.poll();
            ans.add(curr.val);
            int ap=curr.aPos;
            int vp=curr.vPos;
            if(vp+1<arr.get(ap).size())
                pq.add(new triplet(arr.get(ap).get(vp+1),ap,vp+1));
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(10,23,39)));
        arr.add(new ArrayList<>(Arrays.asList(2,4,9)));
        arr.add(new ArrayList<>(Arrays.asList(50,60,67,89)));
        System.out.println(merge(arr));
    }
}
