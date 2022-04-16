package com.company;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=sc.nextInt();
        int marks[]=new int[n];
        System.out.println("enter the marks now");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        int avg=0;
        for(int i=0;i<n;i++){
            avg+=marks[i];
        }
        avg/=n;
        System.out.println("the average marks are"+avg);
    }
}
