package ArrayPractice;

import java.util.Arrays;

public class array1 {
    public static void Traversal(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int indInsertion(int[] arr,int capacity,int size,int index,int element){
        if(size>=capacity){
            return -1;
        }
        for(int i=size-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=element;
        return 1;
    }
    public static void simpleDeletion(int[] arr,int size,int index){
        for(int i=index;i<size;i++){
            arr[i]=arr[i+1];
        }
    }
    public static void linearSearch(int[] arr,int size,int element) {
        int index;
        for (int i = 0; i < size; i++) {
            if (arr[i] == element){
                System.out.println("element is present");
            }
        }
        System.out.println("element not found");
    }
    public static int BinarySearch(int[] arr,int size,int element){
        int mid,low,high;
        low=0;
        high=size-1;
        while (low<=high) {
            mid=(low+high)/2;
            if (arr[mid] == element) {
                return mid;
            }
            if (arr[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void RotateArray(int arr[],int n,int k){
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        Traversal(temp, temp.length);
        for(int i=0;i<n-k;i++){
           arr[i]=arr[i+k];
        }
        Traversal(arr, arr.length);
        for(int i=0;i<k;i++){
            arr[i+n-k]=temp[i];
        }
    }
    static void rotateArr(int arr[], int k, int n)
    {

       for(int i=0;i<k;i++){
           int temp=arr[0];
           for(int j=0;j<n-2;j++){
               arr[j]=arr[j+1];
           }
           arr[n-1]=temp;
       }


    }
    public static void ReverseArray(int arr[],int n){
        int start=0;
        int end=n-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
//        int capacity=100;
//        int size=5;
//        int index=3;
//        int element=56;
//        int[] arr=new int[capacity];
//        arr[0]=34;
//        arr[1]=43;
//        arr[2]=56;
//        arr[3]=76;
//        arr[4]=98;
//        Traversal(arr,size);
//        indInsertion(arr,capacity,size,index,element);
//        size++;
//        System.out.println("after insertion");
//        Traversal(arr,size);
//        int idd=1;
//        simpleDeletion(arr,size,idd);
//        size--;
//        System.out.println("after simple deletion");
//        Traversal(arr,size);
//        linearSearch(arr,size,76);
//        size--;
//        System.out.println("after deletion");
//        Traversal(arr,size);
//        int binaryIndex=BinarySearch(arr,size,element);
//        if(binaryIndex==-1){
//            System.out.println("element not found");
//        }else
//        System.out.printf("The element is %d was found at %d",element,binaryIndex);
//        int[] arr={1,2,4,5,7,9,8};
//        int n= arr.length;
//        System.out.println("before operation");
//        Traversal(arr,n);
//        int k=2;
////        RotateArray(arr,n,k);
//        rotateArr(arr,k,n);
//        System.out.println("After operation");
//        Traversal(arr,n);

    }
}
