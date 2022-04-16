package lab;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.addition\n" +
                "2.Subtraction\n" +
                "3.Multiplication\n" +
                "4.Division");
        System.out.println("Enter the operator");
        int n=sc.nextInt();
        System.out.println("Enter the first operand");
        int a=sc.nextInt();
        System.out.println("Enter the Second operand");
        int b=sc.nextInt();
        if(n==1){
            System.out.println("Answer is:"+(a+b));
        }
        if(n==2)
            System.out.println("Answer is:"+(a-b));
        if(n==3)
            System.out.println("Answer is:"+(a*b));
        if(n==4)
            System.out.println("Answer is:"+(a/b));
    }
}
