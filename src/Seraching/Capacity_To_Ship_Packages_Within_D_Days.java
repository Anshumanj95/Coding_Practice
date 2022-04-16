package Seraching;

import java.util.Arrays;

public class Capacity_To_Ship_Packages_Within_D_Days {
    public static int leastMinWeightCapacity(int[] arr,int D){
        int start= Arrays.stream(arr).max().getAsInt();
        int end=Arrays.stream(arr).sum();
        while (start<end){
            int mid=(start+end)/2;
            int days=solve(mid,arr);
            if (days<=D)
                end=mid;
            else
                start=mid+1;
        }
        return start;
    }
    public static int solve(int cap,int[] arr){
        int total=0;
        int days=1;
        for (int i:arr){
            if (i>cap)
                return -1;
            if (total+i<=cap)
                total+=i;
            else{
                days++;
                total=i;
            }
        }
        return days;
    }
    public static void main(String[] args) {
        int[] arr={9,8,10};
        System.out.println(leastMinWeightCapacity(arr,3));

    }
}
