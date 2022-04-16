package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RullingPair {
    public static int RulingPair(int[] arr,int n){
        HashMap<Integer, Integer> map=new HashMap<>();
        int ans=-1;
        for (int i=0;i<n;i++){
            int num=arr[i];
            int sum=sumOfDigits(num);
            if (map.containsKey(sum)){
                int val1=map.get(sum);
                ans=Math.max(ans,val1+num);
                num=Math.max(val1,num);
            }
            map.put(sum,num);

        }
        System.out.println(map);
        return ans;
    }
    public static int sumOfDigits(int num){
        int rem=0;
        while (num!=0){
            rem+=num%10;
            num=num/10;
        }
        return rem;
    }
    public static void main(String[] args) {
        int[] arr={55,23,32,46,88};
        System.out.println(RulingPair(arr,arr.length));
    }
}
