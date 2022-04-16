package Sorting;

public class InsertionSort {
    public static void sort(int[] arr,int n){
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,3,9,0};
        int n=arr.length;
        printArray(arr);
        sort(arr,n);
        printArray(arr);

    }
}
