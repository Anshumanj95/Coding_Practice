package SortingPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllDistinctTriplet {
    public static ArrayList<ArrayList<Integer>> find(int[] arr,int n){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            if (i==0 ||(i>0 && arr[i]!=arr[i-1])){
                int j=i+1;
                int k=n-1;
                while (j<k){
                    int sum=arr[i]+arr[j]+arr[k];
                    if (sum==0){
                        ArrayList<Integer> curr=new ArrayList<>();
                        curr.add(arr[i]);
                        curr.add(arr[j]);
                        curr.add(arr[k]);
                        ans.add(curr);
                        while (j<k && arr[j]==arr[j+1])
                            j++;
                        while (j<k && arr[k]==arr[k-1])
                            k--;
                        j++;
                        k--;
                    }
                    else if (sum>0)
                        k--;
                    else
                        j++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1 ,2 ,3, -1 ,-2, -3};
        System.out.println(find(arr,arr.length));
    }
}
