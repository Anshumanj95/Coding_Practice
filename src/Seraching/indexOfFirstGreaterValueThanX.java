package Seraching;

public class indexOfFirstGreaterValueThanX {
    public static int last(int[] arr,int n,int x){
        int l=0;
        int h=n-1;
        while (l<=h){
            int m=(l+h)/2;
            if (arr[m]>x)
                h=m-1;
            else if (arr[m]<x)
                l=m+1;
            else{
                if (m==n-1||arr[m]!=arr[m+1])
                    return m;
                else
                    l=m+1;
            }
        }
        return h;
    }
    public static void main(String[] args) {
        int[] arr={0,1,1,1,2,4};
        System.out.println(last(arr,arr.length,2));
    }
}
