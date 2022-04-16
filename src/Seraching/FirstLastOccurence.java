package Seraching;

public class FirstLastOccurence {
    public static int first(int[] arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x)
                high=mid-1;
            else if(arr[mid]<x)
                low=mid+1;
            else{
                if(mid==0||arr[mid-1]!=arr[mid])
                    return mid;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
    public static int last(int[] arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x)
                high=mid-1;
            else if(arr[mid]<x)
                low=mid+1;
            else{
                if(mid==n-1||arr[mid]!=arr[mid+1])
                    return mid;
                else
                    low=mid+1;
            }
        }
        return -1;
    }
    public static int countOccurrencesInSorted(int[] arr,int x){
        int n=arr.length;
        int first=first(arr,x);
        if(first==-1)
            return 0;
        int last=last(arr,x);
        return (last-first+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,4,4,4,4,5,6};
        System.out.println(countOccurrencesInSorted(arr,8));
    }
}
