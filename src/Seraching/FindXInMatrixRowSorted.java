package Seraching;

public class FindXInMatrixRowSorted {
    //each row is sorted and every first element of row is greater than previous row last element
    public static boolean isPresent(int[][] arr,int x){
        int n=arr.length;
        int m=arr[0].length;
        int l=0;
        int h=m*n-1;
        while (l<=h){
            int mid=(l+h)/2;
            int ele=arr[mid/m][mid%m];
            if (ele==x)
                return true;
            else if(ele<x)
                l=mid+1;
            else
                h=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,4,5},{8,12,14,16},{23,25,26,29}};
        System.out.println(isPresent(arr,12));
    }
}
