package lab;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero is not possible");
        }

    }
}
