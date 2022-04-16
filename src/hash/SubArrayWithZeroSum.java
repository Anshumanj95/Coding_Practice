package hash;

import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static boolean find(int[] arr){
        HashSet<Integer> h=new HashSet<>();
        int pre_sum=0;
        for(int e:arr){
            pre_sum+=e;
            if(h.contains(pre_sum))
                return true;
            if(pre_sum==0)
                return true;
            h.add(e);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,3,2};
        System.out.println(find(arr));
    }
}
