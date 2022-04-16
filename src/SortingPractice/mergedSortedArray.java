package SortingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mergedSortedArray {
    public static int[] mergeArray(int[] arr1,int m,int[] arr2,int n){
        int[] arr3=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j])
                arr3[k++]=arr1[i++];
            else
                arr3[k++]=arr2[j++];
        }
        while(i<m){
            arr3[k++]=arr1[i++];
        }
        while(j<n){
            arr3[k++]=arr2[j++];
        }
        return arr3;
    }
    public static void mergeThree(int[] arr1,int[] arr2,int[] arr3){
       int[]res1=mergeArray(arr1,arr1.length,arr2,arr2.length);
       int[] res2=mergeArray(arr3,arr3.length,res1, res1.length);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int e:res2)
            ans.add(e);
    }
    // logic is simple we just all small element is arr1 and all greater element in arr2 hen simply sort both array
    public static void mergeTwoArrayWithoutSpace(int[] arr1,int n,int[] arr2,int m){
        int i=n-1,j=0;
        while(i>=0 && j<m){
            if(arr1[i]>arr2[j]){
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String[] args) {
        int[] arr1={1,2,4,6};
        int[] arr2={2,5,7,9};
        int[] arr3={1,2,3,4};
        mergeThree(arr1,arr2,arr3);

    }
}
