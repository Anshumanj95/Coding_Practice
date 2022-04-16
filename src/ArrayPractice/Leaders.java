package ArrayPractice;

import java.util.Collections;

public class Leaders {
    public static void leaders(int[] arr){
        int n=arr.length;
        int curr=arr[n-1];
        System.out.print(curr+" ");
        for(int i=n-2;i>=0;i--){
            if(curr<arr[i]){
                curr=arr[i];
                System.out.print(curr+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,5,9,8,2};
        leaders(arr);

    }
}
