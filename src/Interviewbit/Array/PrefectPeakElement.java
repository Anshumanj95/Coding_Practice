package Interviewbit.Array;

public class PrefectPeakElement {
    //You need to check that whether there exist a element which is strictly greater
    // than all the elements on left of it and strictly smaller than all the elements on right of it.
    public static boolean findPrefectPeak(int[] arr){
        int n=arr.length;
        int[] pre=new int[n];
        int[] suf=new int[n];
        pre[0]=arr[0];
        for (int i = 1; i < n; i++) {
            pre[i]=Math.max(pre[i-1],arr[i]);
        }
        suf[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--)
            suf[i]=Math.min(suf[i+1],arr[i]);
        for (int i = 1; i < n-1; i++) {
            if (pre[i-1]<arr[i] && arr[i]>suf[i+1] && arr[i]!=suf[i+1])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={5,1,4,3,6,8,9,10,7};
        System.out.println(findPrefectPeak(arr));
    }
}
