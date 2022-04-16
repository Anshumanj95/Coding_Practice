package com.company;

import java.util.Scanner;

public class method {
    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d=%d\n",n,i,n*i);
        }
    }
    static void pattern(int n){
        for(int i=0;i<=n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternR(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int sumRec(int n){
        if(n==1)
            return 1;
        else
            return n+sumRec(n-1);
    }
    static int fib(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    static void pattern_Rec(int n){
        if(n>0){
            pattern_Rec(n-1);
            for(int i=0;i<n;i++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
       pattern_Rec(t);
    }
}
