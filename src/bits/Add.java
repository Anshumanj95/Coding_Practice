package bits;

import java.util.Scanner;

public class Add {
    public static int add(int a,int b){
        while(b!=0){
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }
        return a;
    }
    public static int subtract(int a,int b){
        while (b!=0){
            int borrow=~a&b;
            a=a^b;
            b=borrow<<1;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(add(a,b));
        System.out.println(subtract(a,b));
    }
}
