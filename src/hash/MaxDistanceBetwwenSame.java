package hash;

import java.util.*;

public class MaxDistanceBetwwenSame {
    public static int maxDist(int[] arr,int n){
        HashMap<Integer, ArrayList<Integer>> map =new HashMap<>();
        for (int i=0;i<n;i++){
            map.putIfAbsent(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        int max=0;
        for (Map.Entry<Integer,ArrayList<Integer>> x:map.entrySet()){
            ArrayList<Integer> currList=x.getValue();
            if (currList.size()>1){
                max=Math.max(max, currList.get(currList.size()-1)- currList.get(0));
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        System.out.println(maxDist(arr,arr.length));

    }
}
