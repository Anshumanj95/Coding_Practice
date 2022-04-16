package hash;

import java.util.Arrays;
import java.util.HashMap;

public class sortByOther {
    public static int[] sort(int[] a,int n,int[] b,int m){
        int[] ans=new int[n];
        int k=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int e:a){
            h.put(e,h.getOrDefault(e,0)+1);
        }
        for(int e:b){
            if(h.containsKey(e))
                for(int i=1;i<=h.get(e);i++)
                    ans[k++]=e;
            h.remove(e);
        }
        Arrays.sort(a);
        for(int e:a)
            if(h.containsKey(e))
                ans[k++]=e;
        return ans;
//
    }
    public static void main(String[] args) {
        int[] arr={2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] b={2,1,5,3};
        int[] ans=sort(arr,arr.length,b, b.length);
        for (int i=0;i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
