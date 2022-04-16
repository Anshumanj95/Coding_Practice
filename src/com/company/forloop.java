package com.company;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        for(int i=4;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int sum=0;
        int n=5;
        int i=0;
        while(i<=n){
            sum=sum+2*i;
            i++;
        }
        System.out.println(sum);
        int t=2;
        int ts=0;
        for (int j=2;j>0;j--){
            System.out.printf("%d X %d=%d\n",t,j,t*j);
            ts=ts+(t*j);
        }
        System.out.println(ts);
        int f=5;
        int s=1;
        for(int j=1;j<=5;j++){
            s=s*j;
        }
        System.out.println(s);
    }
}
