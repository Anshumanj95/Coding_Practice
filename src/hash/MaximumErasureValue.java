package hash;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue {
    public static int maximumUniqueSubArray(int[] arr){
        Set<Integer> set=new HashSet<>();
        int ans=0,sum=0,i=0,j=0;
        while (i<arr.length && j<arr.length){
            if (!set.contains(arr[j])){
                sum+=arr[j];
                ans=Math.max(ans,sum);
                set.add(arr[j++]);
            }
            else {
                sum-=arr[i];
                set.remove(arr[i++]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={4,2,4,5,6};
        System.out.println(maximumUniqueSubArray(arr));
    }
}
