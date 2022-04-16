package com.company;

import java.util.Scanner;

public class Leftshift {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int a=A.length();
        int b=B.length();
        int c=a+b;
        System.out.println(c);
        int i=A.compareTo(B);
        if(i>0)
            System.out.println("Yes");
        else
            System.out.println("No");
        String e=A.substring(1,4).toUpperCase()+A.substring(4);
        String d=B.substring(1,4).toUpperCase()+B.substring(4);
        System.out.println(e+" "+d);
    }
}