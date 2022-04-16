package SortingPractice;

import java.util.Arrays;

public class MaximumSelction {
    public static int maximum_count(int[][] ranges,int n){
        //sort according to end ranges
        Arrays.sort(ranges,(a, b)->a[1]-b[1]);
        int prev=-1;
        int count=0;
        for (int i=0;i<n;i++){
            if (ranges[i][0]>=prev)
            {
                count++;
                prev=ranges[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] ranges={{7,9},{2,8},{1,3},{10,11},{10,16}};
        System.out.println(maximum_count(ranges, ranges.length));
    }
}
