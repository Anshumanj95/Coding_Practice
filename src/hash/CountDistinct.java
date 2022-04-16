package hash;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinct {
    public static int distinct(int[] arr){
        int n=arr.length;
        HashSet<Integer> h=new HashSet<>();
        for(int e:arr)
            h.add(e);

        return h.size();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,2,1};
        System.out.println(distinct(arr));

    }
}
