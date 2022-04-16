package com.company;

import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=12;i++){
            System.out.printf("%d * %d=%d\n",n,i,n*i);
        }

    }
}
