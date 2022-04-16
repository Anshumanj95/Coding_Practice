package lab;

import java.util.Scanner;

public class GCd {
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Gcd of "+a+" and "+b+" is:"+gcd(a,b));
    }
}
