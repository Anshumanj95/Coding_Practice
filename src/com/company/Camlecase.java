package com.company;

import java.util.Scanner;

public class Camlecase {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            String s=sc.next();
            String d="";
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c>=65&c<=90){
                    d+=c;
                }
            }
            System.out.println(d.length());
            T--;
        }
    }
}
