package SortingPractice;

import java.util.Arrays;

public class countPossibleTriangle {
    public static int count(int[] arr,int n){
        Arrays.sort(arr);
        int count=0;
        for(int c=n-1;c>=1;c--){
            int a=0;
            int b=c-1;
            while(a<b){
                if(arr[a]+arr[b]>arr[c]){
                    count+=b-a;
                    b--;
                }
                else
                    a++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={6,4,9,7,8};
        System.out.println(count(arr,arr.length));
    }
}
