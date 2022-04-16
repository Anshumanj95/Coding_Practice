package Seraching;

import java.util.Scanner;
import java.util.Arrays;

public class sortedRotated {

    //distinct values are also allowed
    public static int findMin(int[] arr,int n){
        int low=0;
        int high=n-1;
        while(low < high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == arr[high])
                high--;

            else if(arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return arr[high];
    }
    public static int findKey(int[] arr,int n,int k){
        int l=0;
        int h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==k)
                return mid;
            if(arr[l]<=arr[mid]){
                if(k>=arr[l] && k<arr[mid])
                    h=mid-1;
                else
                    l=mid+1;
            }
            else{
                if(k>arr[mid] && k<=arr[h])
                    l=mid+1;
                else
                    h=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,10,1,2,3};
        System.out.println(findMin(arr,arr.length));
        System.out.println(findKey(arr,arr.length,9));
    }
}
