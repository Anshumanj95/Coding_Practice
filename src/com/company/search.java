package com.company;

import java.util.Scanner;

public class search {
    static int find(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter element of array ");
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            arr[i]=element;
        }
        System.out.println("Enter the element which u want");
        int key=sc.nextInt();
        int pos=find(arr,n,key);
        if(pos==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element" +key+" found at:"+(pos+1));

    }

}
