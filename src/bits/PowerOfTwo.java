package bits;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowerOfTwo {
    public static boolean power(int n){
        return ((n&(n-1))==0&&n>0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(power(n));
    }
}
