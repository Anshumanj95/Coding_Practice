package com.company;

import java.util.Scanner;

public class exactly {
	static int i;
	static int count=0;
	public static int SquareRoot(int N) {
		for(i=2;i<=N;i++) {
			if(Math.sqrt(i)==(int)Math.sqrt(i))
				prime(i);
		}
		return count;
	}
	public static void prime(int N) {
		for(int i=2;i*i<N;i++) {
			boolean isprime=true;
			for(int j=2;j*j<=i;) {
				if(i%j==0)
					isprime=false;
				break;
			}
			if(isprime)
				count++;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(SquareRoot(n));
	}

}
