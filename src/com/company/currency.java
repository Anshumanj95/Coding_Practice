package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.text.*;
public class currency {
    public static void main(String[] args) {
        Locale indiaLocale = new Locale("en", "IN");
        Scanner sc=new Scanner(System.in);
       double currency=sc.nextDouble();
        NumberFormat india=NumberFormat.getCurrencyInstance(indiaLocale);
        System.out.println(india.format(currency));
    }
}
