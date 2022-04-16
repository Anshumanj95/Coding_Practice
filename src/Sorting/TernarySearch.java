package Sorting;

public class TernarySearch {
    public static int sort(int[] arr,int n,int k){
        int l=0;
        int r=n-1;
        while(l<=r){
            int m1=l+(r-l)/3;
            int m2=r-(r-l)/3;
            if(arr[m1]==k)
                return m1;
            if(arr[m2]==k)
                return m2;
            if(k<arr[m1])
                r=m1-1;
            else if(k>arr[m2])
                l=m2+1;
            else{
                l=m1+1;
                r=m2-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,8};
        System.out.println(sort(arr,arr.length,5));
    }
}
