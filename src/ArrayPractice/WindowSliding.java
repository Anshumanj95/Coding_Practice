package ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WindowSliding {
    public static int MaximumSumOfKConsecutiveElements(int[] arr,int k){
        int n=arr.length;
        int curr_sum=0;
        for(int i=0;i<k;i++)
            curr_sum+=arr[i];
        int max_sum=curr_sum;
        for(int i=k;i<n;i++){
            curr_sum+=(arr[i]-arr[i-k]);
            max_sum=Math.max(max_sum,curr_sum);
        }
        return max_sum;
    }
    public static boolean FindSubArrayWithGivenSum(int[] arr,int sum){
        int n=arr.length;
        int curr_sum=arr[0];
        int s=0;
        for(int e=1;e<n;e++){
            while(curr_sum>sum &&s<e-1) {
                curr_sum -= arr[s];
                s++;
            }
            if(curr_sum==sum)
                return true;
            curr_sum+=arr[e];
        }
        return curr_sum==sum;
    }
    //for any n-bonacci series first n-1 terms are zero then n term is 1 then sum of n terms
    // here we maintain an array and in array index start from 0 therefore first n-1 numbers are starting from 0
    public static void NbonacciSeries(int n,int m){
        int[] arr=new int[m];
        Arrays.fill(arr,0);
        arr[n-1]=1;
        arr[n]=1;
        for(int i=n+1;i<m;i++){
            arr[i]=2*arr[i-1]-arr[i-n-1];
        }
        for(int e:arr)
            System.out.print(e+" ");
    }
    public static void main(String[] args) {
//        int[] arr={1,4,20,3,10,5};
//        System.out.println(FindSubArrayWithGivenSum(arr,34));
        NbonacciSeries(3,8);
    }
}
