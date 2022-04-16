package lab;

import java.util.Scanner;

public class Volume {
    static class box{
        long a;
        long b;
        long c;
        box(long a,long b,long c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public long volume(long a,long b,long c){
            return a*b*c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        long a=sc.nextInt();
        System.out.println("Enter breadth");
        long b=sc.nextInt();
        System.out.println("Enter Height");
        long c=sc.nextInt();
        box b1=new box(a,b,c);
        System.out.println("Volume of box with given dimension is:"+b1.volume(a,b,c));
    }
}
