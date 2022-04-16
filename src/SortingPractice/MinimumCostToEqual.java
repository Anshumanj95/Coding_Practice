package SortingPractice;

import java.util.Arrays;

public class MinimumCostToEqual {
    public static long costOfOperation(int n,long[] h,long[] cost,long eq_h){
        long c=0;
        for(int i=0;i<n;i++){
            c+=Math.abs(h[i] - eq_h) *cost[i];
        }
        return c;
    }
    public static long bsearch(int n,long[] h,long[] cost){
        long max= Arrays.stream(h).max().getAsLong();
        long ans=Long.MAX_VALUE;
        long high=1+max;
        long low=0;
        while(low<high){
            long mid=(low+high)>>1;
            long bm=(mid>0)?costOfOperation(n,h,cost,mid-1):Long.MAX_VALUE;
            long m=costOfOperation(n,h,cost,mid);
            long am=costOfOperation(n,h,cost,mid+1);
            if(ans==m)
                break;
            ans=Long.min(ans,m);
            if(bm<=m)
                high=mid;
            else if(am<=m)
                low=mid+1;
            else
                return m;
        }
        return ans;
    }
    public static void main(String[] args) {
        long[] h = {9, 12, 18, 3, 10};
        long[] cost={100, 110, 150, 25, 99};
        int n = h.length;
        System.out.println(bsearch(n, h, cost));

    }
}
