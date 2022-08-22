package hash;

import java.util.HashMap;

public class NoOfSubArray {
    // for given sum also it works simply replace pre-sum
    public static int subArrayWithEqualZeroAndOne(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                arr[i]=-1;
        }
        HashMap<Integer,Integer> h=new HashMap<>();
        int pre=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            pre+=arr[i];
            if(pre==0)
                count++;
            if(h.containsKey(pre))
                count+=h.get(pre);
            h.put(pre,h.getOrDefault(pre,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
