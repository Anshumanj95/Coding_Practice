package ArrayPractice;

import java.util.Arrays;

public class ProductExpectSelf {
    //o(n) time o(n) space and three traversal
    public static int[] product_expect_self_1(int[] arr,int n){
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=arr[0];
        for (int i=1;i<n;i++)
            left[i]=arr[i]*left[i-1];
        right[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){
            right[i]=right[i+1]*arr[i];
        }
        int[] ans=new int[n];
        ans[0]=right[1];
        for (int i=1;i<n-1;i++)
            ans[i]=left[i-1]*right[i+1];
        ans[n-1]=left[n-2];
        return ans;
    }
    public static int[] product_expect_self_2(int[] arr,int n){
        int[] ans=new int[n];
        int product=1;
        for (int i=0;i<n;i++){
            product*=arr[i];
            ans[i]=product;
        }
        product=1;
        for (int i=n-1;i>0;i--){
            ans[i]=ans[i-1]*product;
            product*=arr[i];
        }
        ans[0]=product;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={-1,1,0,-3,3};
        System.out.println(Arrays.toString(product_expect_self_1(arr,arr.length)));
        System.out.println(Arrays.toString(product_expect_self_2(arr,arr.length)));

    }
}
