package hash;

import java.util.Arrays;
import java.util.HashMap;

public class DivideArrayIntoKConsecutiveNumbers {
    public static boolean isPossible(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);
        Arrays.sort(arr);
        for (int i:arr){
            if (map.get(i)>0){
                int last=i+k;
                while (i!=last){
                    if (map.getOrDefault(i,0)>0){
                        map.put(i,map.getOrDefault(i,0)-1);
                        i++;
                    }
                    else
                        return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,4,5,6};
        System.out.println(isPossible(arr,4));
    }
}
