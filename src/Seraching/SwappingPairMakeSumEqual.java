package Seraching;

import java.util.Arrays;

public class SwappingPairMakeSumEqual {
    public static int findSwapPair(long[] a,int n,long[] b,int m){
        long sum1= Arrays.stream(a).sum();
        long sum2=Arrays.stream(b).sum();
        if ((sum1-sum2)%2!=0)
            return -1;
        long x=(sum1-sum2)/2;
        Arrays.sort(a);
        for (int i=0;i<m;i++){
            if(Arrays.binarySearch(a,x+b[i])>=0)
                return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        long[] a={5,4,7,6};
        long[] b={1,2,3,8};
        System.out.println(findSwapPair(a,a.length,b,b.length));
    }
}
