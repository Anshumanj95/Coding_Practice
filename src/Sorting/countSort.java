package Sorting;

import java.util.Arrays;

public class countSort {
    //count sort use when range or k is smaller or in linear with n but when k is high does not use or its time taken is o(N*N) o(n^3)
    //for that we use radix sort
    public static void sort(int[] arr,int n){
       int max=Arrays.stream(arr).max().getAsInt();
       int min=Arrays.stream(arr).min().getAsInt();
       int range=max-min+1;
       int[] count=new int[range];
       int[] output=new int[n];
       for(int i=0;i<n;i++){
           count[arr[i]-min]++;
       }
       for(int i=1;i<range;i++){
           count[i]+=count[i-1];
       }
       for(int i=n-1;i>=0;i--){
           output[--count[arr[i]-min]]=arr[i];
       }
        System.arraycopy(output, 0, arr, 0, n);
    }
    public static String countsort(String str){
        char[] charr=str.toCharArray();
        sort(charr);
        return String.valueOf(charr);
    }
    public static void sort(char[] arr){
        int n=arr.length;
        int[] allchar=new int[257];
        for (int i=0;i<n;i++){
            allchar[arr[i]]++;
        }
        for (int i=1;i<257;i++){
            allchar[i]+=allchar[i-1];
        }
        char[] out=new char[n];
        for(int i=n-1;i>=0;i--){
            out[allchar[arr[i]]-1]=arr[i];
            allchar[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=out[i];
        }
    }
    public static void main(String[] args) {
//    int[] arr={ -5, -10, 0, -3, 8, 5, -1, 10 };
//    sort(arr,arr.length);
//        System.out.println(Arrays.toString(arr));
        String s="anshuman";
        System.out.println(countsort(s));
    }

}
