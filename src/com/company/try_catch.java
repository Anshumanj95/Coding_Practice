package com.company;

import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[5];
        marks[0]=12;
        marks[1]=32;
        marks[2]=52;
        marks[3]=62;
        marks[4]=92;
        System.out.println("Enter the index of marks array: ");
        int index=sc.nextInt();
        System.out.println("Enter the number which divide the marks: ");
        int number=sc.nextInt();
        try{
            System.out.println("The value of marks at given index: "+marks[index]);
            System.out.println("The result of marks/number is: "+marks[index]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException is occurred!");
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException is occurred!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception is occurred!");
            System.out.println(e);
        }

    }
}
