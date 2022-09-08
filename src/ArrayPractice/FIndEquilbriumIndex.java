package ArrayPractice;

import java.util.ArrayList;

public class FIndEquilbriumIndex {
    public static ArrayList<Integer> findEquilibriumIndices(int[] arr) {
        // Write your code here.
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        int[] pre=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        int sum=pre[n-1];
        for(int i=0;i<n;i++){
            if(pre[i]-arr[i]==sum-pre[i])
                ans.add(i);
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr={-7,1,5,2,-4,3,0};
        System.out.println(findEquilibriumIndices(arr));
    }
}
