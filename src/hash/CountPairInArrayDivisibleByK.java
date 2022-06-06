package hash;

import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;

public class CountPairInArrayDivisibleByK {
    public static long countPair(int[] arr,int k){
        long count=0;
        HashMap<Integer,Long> map=new HashMap<>();
        for (int i:arr){
            if (map.containsKey(i%k))
                count+=map.get(i%k);
            int r=i%k;
            int v=(k-r)%k;
            if (map.containsKey(v))
                map.put(v,map.get(v)+1);
            else
                map.put(v,(long)1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={2,2,1,3,5,7};
        System.out.println(countPair(arr,4));
    }
}
