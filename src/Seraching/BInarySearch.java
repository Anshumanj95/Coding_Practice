package Seraching;

public class BInarySearch {
    public static int binarySearch(int[] arr,int x,int l,int h){
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]==x)
                return m;
            else if(arr[m]>x)
                h=m-1;
            else
                l=m+1;
        }
        return -1;//return l if element is not present, and we have to know the index where it should insert in sorted array
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(binarySearch(arr,2,0,arr.length-1));

    }
}
