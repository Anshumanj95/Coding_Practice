package SortingPractice;

import java.util.Arrays;

public class CheckKSortedArray {
    public static String isKSortedArray(int arr[], int n, int k)
    {
        // code here
        int[] aux= Arrays.copyOf(arr,n);
        boolean isk=true;
        Arrays.sort(aux);
        for(int i=0;i<n;i++){
            int j=search(aux,arr[i],n);
            if(k<Math.abs(i-j))
                return "No";
        }
        return "Yes";
    }
    public static int search(int[] arr,int key,int n){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,5,6,4};
        System.out.println(isKSortedArray(arr,arr.length,2));
    }
}
