package com.company;

import java.util.Scanner;

public class varargs {
//    static int sum(int...arr){// use for taking infinite parameter without method overloading
//        //as int[]arr
//        int result=0;
//        for(int a:arr){
//            result+=a;
//        }
//        return result;
//    }
    static int sum(int a,int b){
        return a+b;
    }
    static int factorial(int n){
        if(n==0||n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int multiply(int a,int b){
        return a*b;
    }
    static int divide(int a,int b){
        if(a==0 &&b==0){
            System.out.println("Invalid entry");
            return 1234;}
        else
            return(a/b);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int i=1;
       do{
           System.out.println("Enter which Operation you want to do\n" +
                   "Press suitable numbers\n" +
                   "a.addition\n" +
                   "b.Subtraction\n" +
                   "c.Multiplication\n" +
                   "d.Division\n" +
                   "e.Factorial");
           System.out.println("Enter the operation");
           String entry=sc.next();
           switch (entry){
               case "a":
                   System.out.println("Enter the values:");
                   int a=sc.nextInt();
                   int b=sc.nextInt();
                   System.out.println("Their sum is: "+sum(a,b));
                   break;
               case "b":
                   System.out.println("Enter the values:");
                   int c=sc.nextInt();
                   int d=sc.nextInt();
                   System.out.println("Their subtraction  is: "+sub(c,d));
                   break;
               case "c":
                   System.out.println("Enter the values:");
                   int e=sc.nextInt();
                   int f=sc.nextInt();
                   System.out.println("Their multiplication is: "+multiply(e,f));
                   break;
               case "d":
                   System.out.println("Enter the values:");
                   int g=sc.nextInt();
                   int h=sc.nextInt();
                   System.out.println("Their Division is: "+divide(g,h));
                   break;
               case "e":
                   System.out.println("Enter the values:");
                   int j=sc.nextInt();
                   System.out.println("The factorial is: "+factorial(j));
                   break;
           }
           i++;
       }while(i==0);
        System.out.println("Thank you");
    }
}
