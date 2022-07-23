package SortingPractice;

import java.util.Arrays;

public class CountSmallerNumberAfterItself {
    static class pair{
        int value;
        int idx;
        pair(int value,int idx){
            this.value=value;
            this.idx=idx;
        }
    }
    public  static void merge(int[] ans,pair[] arr,int l ,int m,int r){
        pair[] temp=new pair[r-l+1];
        int i=l;
        int j=m+1;
        int k=0;
        while (i<=m && j<=r){
            if (arr[i].value<=arr[j].value)
                temp[k++]=arr[j++];
            else{
                ans[arr[i].idx]+=(r-j+1);
                temp[k++]=arr[i++];
            }
        }
        while (i<=m)
            temp[k++]=arr[i++];
        while (j<=r)
            temp[k++]=arr[j++];
        for (int e=l;e<=r;e++)
            arr[e]=temp[e-l];
    }
    public static void mergeSort(int[] ans,pair[] arr,int l,int r){
        if (l<r){
            int m=(l+r)/2;
            mergeSort(ans,arr,l,m);
            mergeSort(ans,arr,m+1,r);
            merge(ans,arr,l,m,r);
        }
    }
    public static int[] countSmaller(int[] nums,int n){
        pair[] arr=new pair[n];
        int[] ans=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=new pair(nums[i],i);
        mergeSort(ans,arr,0,n-1);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={5,2,6,1};
        System.out.println(Arrays.toString(countSmaller(arr,arr.length)));
    }
}
