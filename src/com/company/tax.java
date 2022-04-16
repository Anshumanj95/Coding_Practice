package com.company;

import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float tax=0;
        System.out.println("Enter your Salary in lakhs : ");
        float salary =sc.nextFloat();
        if (salary<=2.5){
            tax=tax+0;
        }
        else if(salary>2.5f && salary<=5f){
            tax=tax+0.05f*(salary-2.5f);
        }
        else if(salary>5f && salary<=10f){
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(salary-5f);
        }
        else if(salary>10f){
            tax=tax+0.05f*(5f-2.5f);
            tax=tax+0.2f*(10f-5f);
            tax=tax+0.3f*(salary-10f);
        }
        System.out.printf("The total tax paid by employee:%f",tax);
    }
}
