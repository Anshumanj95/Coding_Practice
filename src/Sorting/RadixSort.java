package Sorting;

import java.util.Arrays;

public class RadixSort {
    // time complexity is O(d*(n+b)) d is no of digits b is base of number in this base is 10 and space is O(n+b)
    //if we want to reduce time we increase the value of but its increase space taken
    //it use count sort it sort array in passes and number of pass depend upon no of digits in maximum element in given array
    public static void sort(int[] arr){
        //get max number
        int max= Arrays.stream(arr).max().getAsInt();
        //call count sort for every pass in this example first sort by last digits then sort by second last digit and then first or most significant digit
        for(int exp=1;max/exp>0;exp*=10)
            countSort(arr,arr.length,exp);
    }
    public static void countSort(int[] arr,int n,int exp){
        int[] count=new int[10];
        int[] output=new int[n];
        //arr[i]/exp%10 give us last digit when exp is 1 last digits is use when exp is 10 2nd last digit and when exp is 100 first digits is use and so on
        for(int i=0;i<n;i++){
            count[(arr[i]/exp)%10]++;
        }
        for (int i=1;i<10;i++)
            count[i]+=count[i-1];
        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<n;i++)
            arr[i]=output[i];
    }
    public static void main(String[] args) {
        int[] arr={2,34,122,564,789,319};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
