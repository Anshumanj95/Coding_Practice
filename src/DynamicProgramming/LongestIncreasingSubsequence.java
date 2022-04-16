package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    //O(n*n)
    public static int getMaximumSubsequence(int[] arr,int n){
        int[] lis=new int[n];
        lis[0]=1;
        for(int i=1;i<n;i++){
            lis[i]=1;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i])
                    lis[i]=Math.max(lis[i],lis[j]+1);
            }
        }
        return Arrays.stream(lis).max().getAsInt();
    }
    //tail[i] stores the minimum possible tail value for lis of len(i+1)
    //simple build a tail array if arr[i] is greater than last element of tail simply append this if
    // arr[i[ is smaller than last element of tail than find ceil of that number in tail array and replace it with ciel of
    // that number time Complexity is O(nlongn)
    public static int getMaxLen(int[] arr,int n){
        int[] tail=new int[n];
        int len=1;
        tail[0]=arr[0];
        for (int i=1;i<n;i++){
            if(arr[i]>tail[len-1]) {
                tail[len] = arr[i];
                len++;
            }
            else{
                int c=ceilIdx(tail,0,len-1,arr[i]);
                tail[c]=arr[i];
            }
        }
        return len;
    }
    public static int ceilIdx(int[] arr,int l,int r,int x){
        while (r<l){
            int m=l+(r-l)/2;
            if (arr[m]>=x)
                r=m;
            else
                l=m+1;
        }
        return r;
    }
    //function to find minimum deletion in array to make it sorted
    public static int minDeletion(int[] arr,int n){
        return n-getMaxLen(arr,n);
    }
    public static void main(String[] args) {
        int[] arr={3,4,2,8,5,10};
        System.out.println(getMaxLen(arr,arr.length));
        System.out.println(minDeletion(arr,arr.length));


    }
}
