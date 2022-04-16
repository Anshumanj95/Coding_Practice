package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

class DeleteElement {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String o="";
            char ch[] =s.toCharArray();
            for(int j=0;j<ch.length;j++){
                if(j==0 || j%2==0){
                    o+=ch[j];
                }
            }
            System.out.println(o);
        }
    }
}