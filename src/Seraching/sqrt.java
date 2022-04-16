package Seraching;

import java.util.Scanner;

public class sqrt {
    public static long floorSqrt(long x){
        long low=0;
        long high=x;
        long ans=0;
        while(low<=high){
            long mid=(low+high)/2;
            if(mid*mid==x)
                return mid;
            else if(mid*mid<x)
                low=mid+1;
            else {
                high = mid - 1;
                ans=high;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans=15;
        System.out.println(floorSqrt(ans));
    }
}
