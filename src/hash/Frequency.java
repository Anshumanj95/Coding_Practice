package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void freq(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int e:arr)
            h.put(e,h.getOrDefault(e,0)+1);
        for(Map.Entry<Integer,Integer> x:h.entrySet())
            System.out.println(x.getKey()+" "+x.getValue());
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,3,4,2,1,4,5};
        freq(arr);
    }
}
