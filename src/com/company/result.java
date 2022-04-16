package com.company;

import java.util.Scanner;

public class result {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("Enter your Physics marks: ");
        s1=sc.nextInt();
        System.out.println("Enter your Chemistry marks: ");
        s2=sc.nextInt();
        System.out.println("Enter your Maths marks: ");
        s3=sc.nextInt();
        float avg=(s1+s2+s3)/3.0f;
        System.out.println("your average: "+avg);
        if(avg>=40 && s1>=33 && s2>=33 && s3>=33){
            System.out.println("Congo You are passed");
        }
        else{
            System.out.println("you are failed");
        }
    }
}
