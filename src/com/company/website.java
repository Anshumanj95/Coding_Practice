package com.company;

import java.util.Scanner;

public class website {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the url of website");
        String website=sc.next();
        if(website.endsWith(".org"))
            System.out.println("This website is an organizational website ");
        else if(website.endsWith(".com"))
            System.out.println("This website is an commercial website ");
        if(website.endsWith(".in"))
            System.out.println("This website is an Indian website ");
    }
}
