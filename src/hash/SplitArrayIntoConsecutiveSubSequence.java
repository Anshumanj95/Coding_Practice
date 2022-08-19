package hash;

import java.util.HashMap;

public class SplitArrayIntoConsecutiveSubSequence {
    public static boolean isPossible(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for (int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);
        for (int i:arr){
            if (map.get(i)==0)
                continue;
            // if num is present in hypothetical map means next value is present in array
            if (hmap.getOrDefault(i,0)>0){
                // reduce the count of that value
                hmap.put(i,hmap.get(i)-1);
                // put next value in the map
                hmap.put(i+1,hmap.getOrDefault(i+1,0)+1);
                //reduce the frequency in actual map
                map.put(i,map.get(i)-1);
            }
            // if i i+1 i+2 are present in array then consider that subsequence (as mention length is 3)
            if (map.getOrDefault(i,0)>0 && map.getOrDefault(i+1,0)>0 && map.getOrDefault(i+2,0)>0){
                // reduce their frequency
                map.put(i,map.get(i)-1);
                map.put(i+1,map.get(i+1)-1);
                map.put(i+2,map.get(i+2)-1);
                //put next value in hypothetical map
                hmap.put(i+3,hmap.getOrDefault(i+3,0)+1);
            }
            // else return false
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5};
    }
}
