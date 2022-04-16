package SortingPractice;

import java.util.*;

public class theif {
    public static int max(int[] arr,int k){
        Arrays.sort(arr);
        int max=0;
        for(int i=k+1;i<arr.length;i++)
            max+=arr[i];
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        System.out.println(max(arr,k));
    }
}
