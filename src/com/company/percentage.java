package com.company;

import java.util.Scanner;

public class percentage {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you got in subject1:");
        float sub1=sc.nextFloat();
        System.out.println("Enter the number you got in subject2:");
        float sub2=sc.nextFloat();
        System.out.println("Enter the number you got in subject3:");
        float sub3=sc.nextFloat();
        System.out.println("Enter the number you got in subject4:");
        float sub4=sc.nextFloat();
        System.out.println("Enter the number you got in subject5:");
        float sub5=sc.nextFloat();
        float sum=sub1+sub2+sub3+sub4+sub5;
        float percentage =(sum/5);
        System.out.println("You got "+percentage+"%");
    }
}
