package Recursion;

public class CountSumSubset {
    public static int countSubset(int[] arr,int n,int sum){
        if(n==0)
            return (sum==0)?1:0;
        return countSubset(arr,n-1,sum)+countSubset(arr,n-1,sum-arr[n-1]);
    }
    public static void main(String[] args) {
        int[] arr={12,5,3,6,9};
        System.out.println(countSubset(arr,arr.length,9));

    }
}
