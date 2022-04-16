package hash;

import java.util.HashSet;

public class PairWithGivenSum {
    public static boolean pair(int[] arr,int sum){
        HashSet<Integer> h=new HashSet<>();
        for(int e:arr){
            if(h.contains(sum-e))
                return true;
            h.add(e);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,7,9,4};
        int sum=12;
        System.out.println(pair(arr,sum));

    }
}
