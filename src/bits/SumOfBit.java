package bits;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfBit {
    public static int Difference(int[] arr,int n){
        int ans=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if((arr[j]&(1<<i))==0) {
                    count++;
                }
            }
            ans=ans+count*(n-count)*2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,4,2};
//        System.out.println(Difference(arr,arr.length));


    }
}
