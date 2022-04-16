package hash;

import java.util.HashSet;

public class PositiveNegativePair {
    public static void findAllPairs(int[] arr){
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(h.contains(-arr[i])){
                System.out.print(-Math.abs(arr[i])+" ");
                System.out.print(Math.abs(arr[i])+" ");
            }
            h.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,6,-1,-2,2,-3};
        findAllPairs(arr);

    }
}
