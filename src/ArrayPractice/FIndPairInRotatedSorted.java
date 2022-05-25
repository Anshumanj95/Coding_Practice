package ArrayPractice;

public class FIndPairInRotatedSorted {
    public static boolean checkPair(int[] arr,int x,int n){
        int i;
        for (i=0;i<n-1;i++){
            if (arr[i]>arr[i+1])
                break;
        }
        int l=(i+1)%n;
        int r=i;
        while (l!=r){
            if (arr[l]+arr[r]==x)
                return true;
            else if (arr[l]+arr[r]<x)
                l=(l+1)%n;
            else
                r=(n+r-1)%n;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={11,15,6,8,9,10};
        System.out.println(checkPair(arr,15, arr.length));
    }
}
