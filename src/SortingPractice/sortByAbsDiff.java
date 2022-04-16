package SortingPractice;

import java.util.Arrays;
import java.util.Comparator;

public class sortByAbsDiff {
    static void sortABS(int[] arr, int n,int k)
    {
        int[][] arr2=new int[n][2];
        for(int i=0;i<n;i++){
            arr2[i][0]=Math.abs(k-arr[i]);
            arr2[i][1]=i;
        }
        Arrays.sort(arr2,(a, b)->Integer.compare(a[0],b[0]));
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[arr2[i][1]];
        }
        for(int i=0;i<n;i++)
            arr[i]=temp[i];
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={5,3,7,2,9,10};
        int k=7;
        sortABS(arr,arr.length,k);

    }
}
