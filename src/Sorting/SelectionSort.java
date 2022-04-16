package Sorting;

public class SelectionSort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sort(int[]arr,int n){
        int min;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            if(min!=i){
                swap(arr,min,i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,6,8,0};
        int n=arr.length;
        printArray(arr);
        sort(arr,n);
        printArray(arr);
    }
}
