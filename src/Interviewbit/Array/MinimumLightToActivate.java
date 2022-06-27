package Interviewbit.Array;

import java.util.ArrayList;

public class MinimumLightToActivate {
    public static int solve(ArrayList<Integer> arr,int B){
        int n=arr.size();
        int count=0;
        int i=0;
        boolean flag=false;
        while (i<n){
            int a=Math.max(0,i-B+1);
            int b=Math.min(n-1,i+B-1);
            for (;b>=a;b--){
                if (arr.get(b)==1){
                    count++;
                    i=b+B;
                    flag=true;
                    break;
                }
            }
            if (!flag)
                return -1;
            flag=false;
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        System.out.println(solve(arr,3));
    }
}
