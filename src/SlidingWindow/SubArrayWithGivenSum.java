package SlidingWindow;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    public static ArrayList<Integer> subArray(int[] arr,int n,int s){
        int curr=arr[0];
        int i=0;
        for (int j=1;j<=n;j++){
            while (curr>s && i<j-1)
                curr-=arr[i++];
            if (curr==s){
                ArrayList<Integer> ans=new ArrayList<>();
                ans.add(i+1);
                ans.add(j);
                return ans;
            }
            if (j<n)
                curr+=arr[j];

        }
        return new ArrayList<>();
    }
    public static void main(String[] args) {

    }
}
