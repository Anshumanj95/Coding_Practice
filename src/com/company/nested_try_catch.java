package com.company;

import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        marks[0] = 12;
        marks[1] = 32;
        marks[2] = 52;
        marks[3] = 62;
        marks[4] = 92;
        boolean flag = true;
        while (flag){
            System.out.println("Enter the index of marks array: ");
            int index = sc.nextInt();
                System.out.println("welcome in program");
                try {
                    System.out.println("value at given index is:" + marks[index]);
                    flag = false;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("please enter the correct index");
                    System.out.println(e);
                }
            }
            System.out.println("Thankyou for using");
        }

    }
