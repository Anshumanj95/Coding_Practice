package com.company;

import java.util.Scanner;

public class km_to_miles {
    public static void main(String[] args) {
        System.out.print("Enter the distance is Kilometer:");
        Scanner sc =new Scanner(System.in);
        double km=sc.nextDouble();
        double miles=km*0.621;
        System.out.println(km+" Kilometer equal to "+miles+" miles");
    }
}