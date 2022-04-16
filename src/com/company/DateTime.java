package com.company;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class DateTime {
    public static String findDay(int month, int day, int year) {
        LocalDate d= LocalDate.of(year,month,day);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("e");
        int days= Integer.parseInt(d.format(df));
        switch (days){
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
            case 7:
                return "SATURDAY";

        }
        return " ";
    }

    public static void main(String[] args)  throws IOException {
        Scanner sc=new Scanner(System.in);
        int month = sc.nextInt();

        int day = sc.nextInt();

        int year = sc.nextInt();

        String res = findDay(month, day, year);
        System.out.println(res);


    }
}
