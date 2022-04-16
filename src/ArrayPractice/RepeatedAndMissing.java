package ArrayPractice;

import java.util.Arrays;

public class RepeatedAndMissing {
    public static int[] findTwoElement(int[] arr,int n){
        int[] ans=new int[2];
        int[] check=new int[n+1];
        for (int i=0;i<n;i++)
            check[arr[i]]++;
        for (int i=0;i<=n;i++){
            if (check[i]==2)
                ans[0]=i;
            else if (check[i]==0)
                ans[1]=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,3,3};
        System.out.println(Arrays.toString(findTwoElement(arr,arr.length)));
    }
}
