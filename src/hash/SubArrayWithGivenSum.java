package hash;

import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static boolean check(int[] arr,int sum){
        HashSet<Integer> h=new HashSet<>();
        int pre_sum=0;
        for(int e:arr){
            pre_sum+=e;
            if(pre_sum==sum)
                return true;
            if(h.contains(pre_sum-sum))
                return true;
            h.add(pre_sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,4,6,4,3};
        int sum=9;
        System.out.println(check(arr,sum));

    }
}
