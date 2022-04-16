package com.company;

import java.util.Scanner;

public class insertion1 {
	static void Insert(int arr[],int n,int cap,int k,int toadd) {
		if(n<cap) {
			for(int i=n-1;i>=k;i--)
				arr[i+1]=arr[i];
			arr[k]=toadd;
			for(int i=0;i<=n;i++)
				System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cap=sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[cap];
		for(int i=0;i<n;i++) {
			int element=sc.nextInt();
			arr[i]=element;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+"  ");
		}
		 int k=sc.nextInt();
		 int toadd=sc.nextInt();
		 Insert(arr,n,cap,k,toadd);
	}

}
