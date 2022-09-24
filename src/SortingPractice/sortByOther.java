package SortingPractice;

import java.util.*;

public class sortByOther {
    public static int[] sort(int[] a,int[] b){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:a)
            map.put(i,map.getOrDefault(i,0)+1);
        int[] ans=new int[a.length];
        int k=0;
        for (int i:b){
            if (map.containsKey(i)){
                for (int j=1;j<=map.get(i);j++)
                    ans[k++]=i;
            }
            map.remove(i);
        }
        Arrays.sort(a);
        for (int i:a){
            if (map.containsKey(i))
                ans[k++]=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int [] b={2, 1, 8, 3};
        System.out.println(Arrays.toString(sort(a,b)));

    }
}
