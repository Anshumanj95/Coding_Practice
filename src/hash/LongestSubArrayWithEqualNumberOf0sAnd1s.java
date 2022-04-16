package hash;

import java.util.HashMap;

public class LongestSubArrayWithEqualNumberOf0sAnd1s {
    public static int longest(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                arr[i]=-1;
        }
        HashMap<Integer,Integer> h=new HashMap<>();
        int pre_sum=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];
            if(pre_sum==0)
                res=i+1;
            if(!h.containsKey(pre_sum))
                h.put(pre_sum,i);
            if(h.containsKey(pre_sum))
                res=Math.max(res,i-h.get(pre_sum));
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,0,1,1};
        System.out.println(longest(arr));

    }
}
