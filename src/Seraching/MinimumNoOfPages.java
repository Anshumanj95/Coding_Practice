package Seraching;

import java.util.Arrays;

public class MinimumNoOfPages {
    public static int minimum(int[] arr,int n,int k){
        int high= Arrays.stream(arr).sum();
        int low= Arrays.stream(arr).max().getAsInt();
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(isFeasible(arr,n,k,mid)){
                res=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return res;
    }
    public static boolean isFeasible(int[] arr,int n,int k,int ans){
        int sum=0;
        int req=1;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>ans){
                req++;
                sum=arr[i];
            }
            else
                sum+=arr[i];
        }
        return (req<=k);
    }
    public static void main(String[] args) {

    }
}
