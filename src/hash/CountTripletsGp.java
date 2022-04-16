package hash;

import java.util.HashMap;
import java.util.Map;

public class CountTripletsGp {
    public static long count(int[] arr,int r){
        Map<Integer,Integer> right=new HashMap<>();
        Map<Integer,Integer> left=new HashMap<>();
        for (int item:arr)
            right.put(item,right.getOrDefault(item,0)+1);
        int count=0;
        for (int i=0;i<arr.length;i++){
            // a
            int mid=arr[i];
            int c1=0,c3=0;
            right.put(mid,right.getOrDefault(mid,0)-1);
            //  a/r
            if(left.containsKey(mid/r)&&mid%r==0)
                c1=left.get(mid/r);
            // a*r
            if(right.containsKey(mid*r))
                c3=right.get(mid*r);
            count+=c1*c3;
            left.put(mid,left.getOrDefault(mid,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,3,9,9,27,81};
        System.out.println(count(arr,3));
    }
}
