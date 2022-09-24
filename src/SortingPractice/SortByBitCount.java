package SortingPractice;

import java.util.*;

public class SortByBitCount {
    public static void sort(int[] arr,int n){
        TreeMap<Integer, ArrayList<Integer>> map=new TreeMap<>(Collections.reverseOrder());
        for (int i:arr){
           int setBits=Integer.bitCount(i);
           map.putIfAbsent(setBits,new ArrayList<>());
           map.get(setBits).add(i);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for (Map.Entry<Integer,ArrayList<Integer>> x:map.entrySet()){
            ans.addAll(x.getValue());
        }
        for (int i=0;i<n;i++)
            arr[i]=ans.get(i);

        //one line code
        //Arrays.sort(arr, (a, b) -> Integer.bitCount(b)-Integer.bitCount(a));


    }
    public static void main(String[] args) {
        int[] arr={5, 2, 3, 9, 4, 6, 7, 15, 32};
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
