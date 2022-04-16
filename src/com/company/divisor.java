package com.company;

import java.util.Scanner;

public class divisor {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		int N=k.nextInt();
		int count=0;
		for(int i=2;i*i<N;i++) {
			boolean isprime=true;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0)
					isprime=false;
				break;
			}
			if(isprime)
				count++;
		}
		System.out.println(count);
	}

}
