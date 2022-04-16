package Sorting;

import java.util.Arrays;

public class DnfSort {
    public static void dnf(int[] arr,int n){
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,1,1,1,1,0,0,0,2,2,2};
        dnf(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
