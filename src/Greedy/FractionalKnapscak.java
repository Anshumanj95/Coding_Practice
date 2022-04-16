package Greedy;

import java.util.Arrays;

public class FractionalKnapscak {
    static class pair{
        int val;
        int wight;
        pair(int i,int j){
            val=i;
            wight=j;
        }
    }
    public static double knapsack(int W,pair[] arr,int n){
        Arrays.sort(arr,(p1,p2)->p2.val*p1.wight-p1.val*p2.wight);
        double ans=0.0;
        for(int i=0;i<n;i++){
            if(arr[i].wight<=W){
                ans+=arr[i].val;
                W-=arr[i].wight;
            }
            else{
                ans+=arr[i].val*((double)W/arr[i].wight);
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        pair[] arr={new pair(60,10),new pair(100,20),new pair(120,30)};
        System.out.println(knapsack(50,arr,arr.length));
    }
}
