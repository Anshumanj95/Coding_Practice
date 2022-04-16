package com.company;

import java.util.Scanner;

public class deletion {
    static int delete(int arr[],int n,int todel){
        for(int i=0;i<n;i++){
            if(arr[i]==todel){
                int index=i;
                for(int j=index+1;j<n;j++){
                    arr[j-1]=arr[j];
                }
                return (n-1);
            }
        }
        return n;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            arr[i]=element;
        }
        for(int e:arr)
            System.out.print(e+" ");
        int todel=sc.nextInt();
        int k=delete(arr,n,todel);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
