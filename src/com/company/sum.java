package com.company;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1:");
        int number1=sc.nextInt();
        System.out.print("Enter number2:");
        int number2=sc.nextInt();
        System.out.print("Enter number3:");
        int number3=sc.nextInt();
        System.out.println("the sum of three number:"+(number3+number1+number2));
    }
}
