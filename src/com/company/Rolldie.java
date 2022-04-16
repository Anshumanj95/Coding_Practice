package com.company;

import java.util.Random;

public class Rolldie {
    public static void main(String[] agrs ){
        Random r=new Random();
        int f1=0;
        int f2=0;
        int f3=0;
        int f4=0;
        int f5=0;
        int f6=0;
        for(int i=0;i<=6;i++){
            int face=1+r.nextInt(6);
            switch (face)
            {
                case 1:
                    ++f1;
                    break;
                case 2:
                    ++f2;
                    break;
                case 3:
                    ++f3;
                    break;
                case 4:
                    ++f4;
                    break;
                case 5:
                    ++f5;break;
                case 6:
                    ++f6;
                    break;
            }
            System.out.println("Face\tFrequency");
            System.out.printf("1\t\t%d\n2\t\t%d\n3\t\t%d\n4\t\t%d\n5\t\t%d\n6\t\t%d\n",f1,f2,f3,f4,f5,f6);
        }
    }
}
