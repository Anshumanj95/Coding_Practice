package hash;

import java.util.HashMap;

public class ValidPairArray {
    // return true if array is divide into pair where sum of each pair gives remainder m when divide by k
    public static boolean isValidArray(int[] arr,int n,int k,int m){
        if (n%2!=0)
            return false;
        // idea is simple if half value have remainder i%k then other half value have remainder m-rem or k-rem+m
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:arr)
            map.put(i%k,map.getOrDefault(i%k,0)+1);
        for (int i:arr){
            int rem=i%k;
            int r1=map.get(rem);
            int r2;
            if (rem<=m)
                r2=map.get(m-rem);
            else
                r2=map.get(k-rem+m);
            if (r1!=r2)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={0,2,5,6,8,3};
        System.out.println(isValidArray(arr,arr.length,3,2));
    }
}
