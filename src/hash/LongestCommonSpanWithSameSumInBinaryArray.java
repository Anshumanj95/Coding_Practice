package hash;

import java.util.HashMap;

public class LongestCommonSpanWithSameSumInBinaryArray {
    public static int longest(int[] arr1,int[] arr2){
        int[] temp=new int[arr1.length];
        for(int i=0;i< arr1.length;i++){
            temp[i]=arr1[i]-arr2[i];
        }
        HashMap<Integer,Integer> h=new HashMap<>();
        int pre=0;
        int res=0;
        for(int i=0;i<temp.length;i++){
            pre+=temp[i];
            if(pre==0)
                res=i+1;
            if(!h.containsKey(pre))
                h.put(pre,i);
            if(h.containsKey(pre))
                res= Math.max(res,i-h.get(pre));
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,0,0,0};
        int[] arr2={1,0,1,1,0,1};
        System.out.println(longest(arr,arr2));
        boolean[] arr1=new boolean[3];
        boolean[] brr2=new boolean[3];

    }
}
