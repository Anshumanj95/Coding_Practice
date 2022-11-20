package ArrayPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class MaximumConsecutiveGap {
    //sorting o(nlongn)
    public static int solve1(ArrayList<Integer> arr){
        Collections.sort(arr);
        int max=-1;
        for (int i=0;i<arr.size()-1;i++)
            max=Math.max(max,arr.get(i+1)-arr.get(i));
        return max;

    }
    // o(n) using treemap to sort internally
    public static int solve2(ArrayList<Integer> arr){
        int prev=-1;
        int max=0;
        int i=0;
        TreeSet<Integer> set=new TreeSet<>(arr);
        for (int num:set){
            if (i==0){
                prev=num;
                i=1;
            }
            else {
                max=Math.max(max,num-prev);
                prev=num;
            }
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
