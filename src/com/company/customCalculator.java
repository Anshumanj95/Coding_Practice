package com.company;

import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String getMessage() {
        return "Please enter valid input";
    }
}
class CannotDivideByZero extends Exception{
    @Override
    public String getMessage() {
        return "Please enter correct divisor";
    }
}
class MaxInputReached extends Exception{
    @Override
    public String getMessage() {
        return "Please Enter input smaller than 100000";
    }
}
class Calculator{
    public double addition(double a,double b) throws MaxInputReached{
        double c=a+b;
        if(a>100000 && b>100000){
            try{
                throw new MaxInputReached();
            }
            catch (MaxInputReached e){
                System.out.println(e.getMessage());
            }
        }
        return c;
    }
    public double subtraction(double a,double b) throws MaxInputReached{
        double c=a-b;
        if(a>100000 && b>100000){
            try{
                throw new MaxInputReached();
            }
            catch (MaxInputReached e){
                System.out.println(e.getMessage());
            }
        }
        return c;
    }
    public double multiplication(double a,double b) throws MaxInputReached{
        double c=a*b;
        if(a>100000 && b>100000){
            try{
                throw new MaxInputReached();
            }
            catch (MaxInputReached e){
                System.out.println(e.getMessage());
            }
        }
        return c;
    }
    public double division(double a,double b) throws MaxInputReached,CannotDivideByZero{
        double c=a/b;

        if(b==0){
            try {
                throw new CannotDivideByZero();
            }
            catch (CannotDivideByZero e){
                System.out.println(e.getMessage());
            }
        }
        else if(a>100000 && b>100000){
            try{
                throw new MaxInputReached();
            }
            catch (MaxInputReached e){
                System.out.println(e.getMessage());
            }
        }
        return c;
    }
}
public class customCalculator {
    public static void main(String[] args) throws MaxInputReached ,CannotDivideByZero{
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        Calculator c1=new Calculator();
        double result=c1.division(a,b);
        System.out.println(result);
    }
}
