package Seraching;

public class UnboundedBinarySearch {
    public static int search(int[] arr,int x){
        if(arr[0]==0)
            return 0;
        int i=1;
        while(arr[i]<x)
            i=i*2;
        if(arr[i]==x)
            return i;
        return BInarySearch.binarySearch(arr,x,(i/2)+1,i-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,35,46,78,90,100,200,900,700,1000};
        System.out.println(search(arr,5));
    }
}
