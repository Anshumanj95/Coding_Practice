package com.company;

import java.util.Scanner;

public class Prime {
    public static void prime(int n){
        if(n==0||n==1){
            System.out.println(n+" is not prime");
            return;
        }
        boolean isprime=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=true;
                break;
            }
        }
        if(isprime)
            System.out.println(n+" is not a prime");
        else
            System.out.println(n+" is a prime");

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        prime(n);
    }
}
