package Maths;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class LargestPerimeterTriangle {
    public static int largestPerimeter(int[] arr){
        Arrays.sort(arr);
        for (int i=arr.length-2;i>=0;i--)
            if (arr[i]+arr[i+1]>arr[i+2])
                return arr[i]+arr[i+1]+arr[i+2];
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1};
        System.out.println(largestPerimeter(arr));
    }
}
