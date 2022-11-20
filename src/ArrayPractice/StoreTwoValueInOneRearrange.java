package ArrayPractice;

import java.util.Arrays;

public class StoreTwoValueInOneRearrange {
    public static void arrange(long[] arr,int n){
        for (int i=0;i<n;i++){
            arr[i]+= (arr[(int) arr[i]]%n)*n;
        }
        for (int i=0;i<n;i++)
            arr[i]=arr[i]/n;
    }
    public static void main(String[] args) {
       long[] arr={0,5,1,2,4,3};
        arrange(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
