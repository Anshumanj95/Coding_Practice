package Hackerearth;

import java.util.Scanner;

public class EasyGoing {
    public static void BubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int M=sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N;i++) {
                arr[i] = sc.nextInt();
            }
            BubbleSort(arr);
            int d=N-M;
            int MaxSum=0;
            int MinSum=0;
            for(int i=M;i<=d;i++){
                MaxSum=MaxSum+arr[i];
            }
            for(int i=0;i<d;i++){
                MinSum=MinSum+arr[i];
            }
            int result=MaxSum-MinSum;
            System.out.println(result);
        }
    }
}
