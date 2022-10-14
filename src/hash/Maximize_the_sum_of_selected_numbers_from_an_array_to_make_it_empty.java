package hash;

import java.util.Collections;
import java.util.TreeMap;

public class Maximize_the_sum_of_selected_numbers_from_an_array_to_make_it_empty {
    public static int maximizeSum (int[] arr, int n) {
        TreeMap<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
        for(int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);
        int ans=0;
        for(int i:map.keySet()){
            int freq=map.get(i);
            if (freq<=0)
                continue;
            while (freq>0){
                ans+=i;
                if (map.containsKey(i-1) && map.get(i-1)>0)
                    map.put(i-1,map.get(i-1)-1);
                freq--;
            }
            map.put(i,freq);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4};
        System.out.println(maximizeSum(arr,arr.length));
    }
}
