package com.company;

import java.util.Scanner;

public class FisrtCapital {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String n=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
        System.out.println(n);
    }
}
