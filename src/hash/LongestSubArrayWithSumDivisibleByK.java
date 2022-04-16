package hash;

import java.util.HashMap;

public class LongestSubArrayWithSumDivisibleByK {
    public static int longest(int[] arr,int k){
//        Iterate over the array while storing sum of prefix covered
//        and the remainder when that sum is divided by k.
//        Store the index at which a particular remainder is found in a hashmap.
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int ps=0,max=0;
        for (int i=0;i<arr.length;i++){
            //Be careful with -ve number modulus , you need to convert negative mods to positive mods to pass all test cases.
            //-5%2 = -1 , but if we use this in map our calculation will be wrong.
            //so use : (sum%k)+k)%k
            ps=((ps+arr[i])%k+k)%k;
            if (map.get(ps)!=null)
                max=Math.max(max,i-map.get(ps));
            else
                map.put(ps,i);
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
