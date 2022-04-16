package graph;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapsSort {
    public static int minimumSwap(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(arr[i],i);
        }
        Arrays.sort(arr);
        boolean[] visited=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(visited[i]||h.get(arr[i])==i)
                continue;
            int j=i,cycle_size=0;
            while (!visited[j]){
                visited[j]=true;
                j=h.get(arr[j]);
                cycle_size++;
            }
            if(cycle_size>0)
                ans+=(cycle_size-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,8,5,4};
        System.out.println(minimumSwap(arr));

    }
}
