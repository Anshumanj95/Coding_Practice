package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumOfInfiniteArray {
    //TCS interview Question
    static int mod=1000000007;
    public static List<Integer> sumInRange(int[] arr,int n,List<List<Long>> queries){
        List<Integer> ans=new ArrayList<>();
        long[] sumArray=new long[n+1];
        //prefix sum of given array
        for (int i=1;i<=n;i++)
            sumArray[i]=(sumArray[i-1]+arr[i-1])%mod;
        for (List<Long> i:queries){
            long l=i.get(0);
            long r=i.get(1);
            // sum upto r index
            long rsum=func(sumArray,n,r);
            //sum upto l index
            long lsum=func(sumArray,n,l-1);
            // sum of curr query(l,r)=rsum-lsum
            ans.add((int)((rsum-lsum+mod)%mod));
        }
        return ans;
    }
    public static long func(long[] sumArray,long n,long idx){
        //No of times given array complete upto index idx
        long count=(idx/n)%mod;
        // sum of repeated array
        long res=(count*sumArray[(int)n])%mod;
        //sum of remaining element of array
        res=(res+sumArray[(int)(idx%n)])%mod;
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Long>> queries=new ArrayList<>();
        queries.add(List.of(1L,3L));
        queries.add(List.of(1L,5L));
        System.out.println(sumInRange(arr,arr.length,queries));


    }
}
