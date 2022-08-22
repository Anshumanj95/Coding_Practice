package hash;

import java.util.HashMap;

public class NoOfSubArrayWithGivenSum {
    public static int noOfSubArray(int[] arr,int sum){
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int pre=0;
        map.put(pre,1);
        for (int i:arr){
            pre+=i;
            if (map.containsKey(pre-sum))
                res+=map.get(pre-sum);
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={5,0,2,3,1};
        System.out.println(noOfSubArray(arr,5));
    }
}
