package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    public static void sort(int[] arr,int k){
        int n=arr.length;
        int max= Arrays.stream(arr).max().getAsInt();
        max++;
        ArrayList<ArrayList<Integer>> bucket=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<k;i++){
            bucket.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            int bi=(k*arr[i])/max;
            bucket.get(bi).add(arr[i]);
        }
        for(int i=0;i<k;i++){
            Collections.sort(bucket.get(i));
        }
        int index=0;
        for(int i=0;i<k;i++){
            for(int j=0;j< bucket.get(i).size();j++){
                arr[index++]=bucket.get(i).get(j);
            }
        }
    }
    public static void main(String[] args) {
        int[]  arr={11,20,34,54,99,89,23,45};
        int k=4;
        sort(arr,k);
        System.out.println(Arrays.toString(arr));

    }
}
