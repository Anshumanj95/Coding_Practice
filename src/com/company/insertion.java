package com.company;

import java.util.Scanner;

public class insertion {
    static void insert(int arr[],int cap,int n,int key,int toadd){
        if(n<cap){
            for(int i=n-1;i>=key;i--)
                arr[i+1]=arr[i];
            arr[key]=toadd;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cap=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[cap];
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            arr[i]=element;
        }
        for(int e:arr)
            System.out.print(e+" ");
        int key=sc.nextInt();
        int toadd=sc.nextInt();
        insert(arr,cap,n,key,toadd);
        for(int e:arr)
            System.out.print(e+" ");
    }
}
