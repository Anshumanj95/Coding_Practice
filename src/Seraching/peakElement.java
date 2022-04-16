package Seraching;

public class peakElement {
    public static int peak(int[] arr){
        int n=arr.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if((mid==0||arr[mid]>=arr[mid-1])&&(mid==n-1||arr[mid]>=arr[mid+1]))
                return arr[mid];
            if(mid>0&&arr[mid-1]>=arr[mid])
                h=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,4,5,6};
        System.out.println(peak(arr));

    }
}
