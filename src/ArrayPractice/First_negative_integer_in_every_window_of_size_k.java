package ArrayPractice;

import java.util.Arrays;

public class First_negative_integer_in_every_window_of_size_k {
    public static int[] printFirstNegativeInteger(int[] arr,int n,int k){
        int[] ans=new int[n-k+1];
        int curr=0,i=0,j=k-1;
        for (int idx=0;idx<n-k+1;idx++){
            int negVal=0;
            if (curr<i)
                curr=i;
            while (curr<=j){
                if (arr[curr]<0){
                    negVal=arr[curr];
                    break;
                }
                curr++;
            }
            ans[idx]=negVal;
            i++;j++;
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr={-8,2,3,-6,10};
        System.out.println(Arrays.toString(printFirstNegativeInteger(arr,arr.length,2)));

    }
}
