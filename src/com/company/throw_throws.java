package com.company;

import java.util.Scanner;

class NegativeNumber extends Exception{
    public String toString() {
        return "Dimension not be negative";
    }

    public String getMessage() {
        return "Dimension not be negative please enter positive number";
    }
}
public class throw_throws {
    public static double area(int a,int b) throws NegativeNumber{
        if(a<0 || b<0){
            throw new NegativeNumber();
        }
        double result=a*b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first dimension");
        int a=sc.nextInt();
        System.out.println("Enter the second dimension");
        int b=sc.nextInt();
        try {
            double c=area(a,b);
            System.out.println(c);
        } catch (NegativeNumber negativeNumber) {
            System.out.println(negativeNumber.getMessage());
        }
    }
}
