package hash;

import java.util.HashSet;

public class ContainDuplicateWithinK {
    public static boolean containDuplicate(int[] arr,int n,int k){
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<n;i++){
            if (set.contains(arr[i]))
                return true;
            set.add(arr[i]);
            if (i>=k)
                set.remove(arr[i-k]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1};
        System.out.println(containDuplicate(arr,arr.length,4));
        System.out.println(containDuplicate(arr,arr.length,3));
        System.out.println(containDuplicate(arr,arr.length,5));


    }
}
