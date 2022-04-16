package SortingPractice;

import java.util.Arrays;

public class SortArrayWithTwoTypesElement {
    public static void rearrangeArrayAsNegativeFirstAndPositiveLast(int[] arr,int l,int r){
        int i=l-1;
        int j=r+1;
        while(true){
            do {
                i++;
            }while(arr[i]<0);
            do {
                j--;
            }while (arr[j]>=0);
            if(i>=j)
                return;
            swap(arr,i,j);
        }
    }
    public static void rearrangeArrayAsEvenFirstAbdOddLast(int[] arr,int l,int r){
        int i=l-1;
        int j=r+1;
        while (true){
            do {
                i++;
            }while (arr[i]%2==0);
            do {
                j--;
            }while (arr[j]%2!=0);
            if(i>=j)
                return;
            swap(arr,i,j);
        }
    }
    public static void binarySort(int[] arr,int l,int h){
        int i=l-1;
        int j=h+1;
        while (true){
            do {
                i++;
            }while (arr[i]==0);
            do {
                j--;
            }while (arr[j]!=0);
            if(i>=j)
                return;
            swap(arr,i,j);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr1={12,-9,4,-3,56};
        rearrangeArrayAsNegativeFirstAndPositiveLast(arr1,0, arr1.length-1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2={1,3,5,2,4,6};
        rearrangeArrayAsEvenFirstAbdOddLast(arr2,0, arr2.length-1);
        System.out.println(Arrays.toString(arr2));
        int[] arr3={1,1,0,0,1,0,1,0};
        binarySort(arr3,0,arr3.length-1);
        System.out.println(Arrays.toString(arr3));

    }
}
