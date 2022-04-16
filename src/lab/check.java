package lab;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>=97&&ch<123)
            System.out.println(ch+" is in lowerCase");
        else if(ch>=65&&ch<91)
            System.out.println(ch+" is in upperCase");

    }
}
