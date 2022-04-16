package Maths;

import java.util.Arrays;

public class SmallestPositive_Integer_that_can_not_be_represented_as_Sum {
    public static int smallest(int[] arr,int n){
        int ans=1;
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            if (arr[i]>ans)
                return ans;
            else
                ans+=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1, 10, 3, 11, 6, 15};
        System.out.println(smallest(arr,arr.length));
    }
}
