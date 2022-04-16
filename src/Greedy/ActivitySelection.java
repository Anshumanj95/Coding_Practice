package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    static class pair{
        int start;
        int finish;
        pair(int i,int j){
            start=i;
            finish=j;
        }
    }
    public static int maxJobs(int[] start,int[] end,int n){
        pair[] arr=new pair[n];
        for(int i=0;i<n;i++)
            arr[i]=new pair(start[i],end[i]);
        Arrays.sort(arr, Comparator.comparingInt(p -> p.finish));
        int res=1;
        int prev=0;
        for(int curr=1;curr<n;curr++){
            if(arr[curr].start>arr[prev].finish){
                res++;
                prev=curr;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] start={2,1};
        int[] end={2,2};
        System.out.println(maxJobs(start,end,start.length));
    }
}
