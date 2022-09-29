package ArrayPractice;

import java.util.ArrayList;
import java.util.List;

public class FindKClosetElements {
    //Given a sorted integer array arr, two integers k and x,
    //return the k the closest integers to x in the array. The result should also be sorted in ascending order.
    public static List<Integer> findKClosetEle(int[] arr, int k, int x){
        int l=0;
        int h=arr.length-1;
        while (h-l>=k){
            if (Math.abs(arr[l]-x)>Math.abs(arr[h]-x))
                l++;
            else
                h--;
        }
        List<Integer> ans=new ArrayList<>();
        for (int i=l;i<=h;i++)
            ans.add(arr[i]);
        return ans;
    }
    public static void main(String[] args) {

    }
}
