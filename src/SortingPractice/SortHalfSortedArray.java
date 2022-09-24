package SortingPractice;

import java.util.ArrayList;

public class SortHalfSortedArray {
    //given an array where both parts are sorted return sorted array
    //it is merge step of mergesort in simple we simply use sort function but it take O(nlogn) time
    public static void sortHalf(ArrayList<Integer> arr,int n){
        int i=0,half_i=0;
        for (i=0;i<n-1;i++){
            if (arr.get(i)>arr.get(i+1)){
                half_i=i+1;
                break;
            }
        }
        if (half_i==0)
            return;
        i=0;
        int j=half_i;
        ArrayList<Integer> ans=new ArrayList<>();
        while (i<half_i && j<n){
            if (arr.get(i)<arr.get(j))
                ans.add(arr.get(i++));
            else
                ans.add(arr.get(j++));
        }
        while (i<half_i)
            ans.add(arr.get(i++));
        while (j<n)
            ans.add(arr.get(j++));
        arr.clear();
        arr.addAll(ans);

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(8);
        arr.add(1);
        arr.add(7);
        arr.add(10);
        arr.add(15);
        sortHalf(arr,arr.size());
        System.out.println(arr);
    }
}
