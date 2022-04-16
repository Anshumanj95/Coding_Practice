package ArrayPractice;

import java.util.Arrays;

public class MinimumSwapsAndKToghter {
    public static int minimumSwaps(int[] arr,int n,int k){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k)
                count++;
        }
        int bad=0;
        for(int i=0;i<count;i++){
            if(arr[i]>k)
                bad++;
        }
        int ans=bad;
        int i=0,j=count;
        while(j<n){
            if(arr[i]>k)
                bad--;
            if(arr[j]>k)
                bad++;
            ans=Math.min(ans,bad);
            i++;
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,7,9,5,8,7,4};
        System.out.println(minimumSwaps(arr,arr.length,6));
    }
}
