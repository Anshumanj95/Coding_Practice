package Recursion;

import java.util.ArrayList;

public class SubsetSum {
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        find(arr,new ArrayList<>(),0,ans,k,n);
        return ans;

    }
    public static void find(ArrayList<Integer> arr,ArrayList<Integer> curr,int i,ArrayList<ArrayList<Integer>> ans,int k,int n){
        if(k==0)
            ans.add(new ArrayList<>(curr));
        if(i==n)
            return;
        for(int j=i;j<n;j++){
            curr.add(arr.get(j));
            find(arr,curr,j+1,ans,k-arr.get(j),n);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(-2);
        arr.add(0);
        arr.add(-5);
        arr.add(2);
        ArrayList<ArrayList<Integer>> ans=findSubsetsThatSumToK(arr,arr.size(),0);

    }
}
