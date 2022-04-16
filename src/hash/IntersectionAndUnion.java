package hash;

import java.util.HashSet;

public class IntersectionAndUnion {
    public static void intersection(int[] arr,int[] arr1){
        HashSet<Integer> h=new HashSet<>();
        for(int e:arr)
            h.add(e);
        for(int e:arr1){
            if(h.contains(e))
                System.out.print(e+" ");
            h.remove(e);
        }
        System.out.println();
    }
    public static void union(int[] arr,int[] arr1){
        HashSet<Integer> h=new HashSet<>();
        for(int e:arr)
            h.add(e);
        for (int e:arr1)
            h.add(e);
        System.out.println(h);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] arr1={2,31,4};
        intersection(arr,arr1);
        union(arr,arr1);

    }
}
