package lab;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==0||n==1)
            return 1;
        return  fact(n-1)*n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));


    }
}
