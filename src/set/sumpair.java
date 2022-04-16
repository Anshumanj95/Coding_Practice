package set;
import java.util.*;
public class sumpair {
    public static boolean pair(int[] arr,int sum){
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(h.contains(sum-arr[i]))
                return true;
            h.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,6,8};
        System.out.println(pair(arr,7));
    }
}
