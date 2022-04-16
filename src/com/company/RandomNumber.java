package com.company;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        Random r=new Random();
        for(int i=0;i<=6;i++){
            double f=r.nextInt(6);
            System.out.print("  "+f);
        }
    }
}

