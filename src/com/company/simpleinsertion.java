package com.company;

import java.util.Scanner;

public class simpleinsertion {
	
	static int Insert(int arr[],int n,int key,int cap) {
		if(n>=cap)
			return n;
		arr[n]=key;
		return(n+1);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cap=sc.nextInt();
		int arr[]=new int[cap];
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
				arr[i]=i+1;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		int key=25;
		n=Insert(arr,n,key,cap);
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
