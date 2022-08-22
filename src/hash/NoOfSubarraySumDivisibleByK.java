package hash;

import java.util.HashMap;

public class NoOfSubarraySumDivisibleByK {
    public static int noOfSubArray(int[] arr,int k){
        int res=0;
        HashMap<Long,Integer> map=new HashMap<>();
        long pre=0;
        long rem;
        map.put(pre,1);
        for (int i:arr){
            pre+=i;
            rem=pre%k;
            if (rem<0)
                rem+=k;
            if (map.containsKey(rem))
                res+=map.get(rem);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={5,0,2,3,1};
        System.out.println(noOfSubArray(arr,5));
    }

}
