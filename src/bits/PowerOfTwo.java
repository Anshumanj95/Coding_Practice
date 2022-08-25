package bits;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class PowerOfTwo {
    public static boolean power(int n){
        return ((n&(n-1))==0&&n>0);
    }
    public static  boolean isPowerOfFour(int num) {
        return num > 0 && (num&(num-1)) == 0 && (num - 1) % 3 == 0;
    }
    public static boolean powerOf3(int num){
        //3^19==1162261467
        return (num>0 && 1162261467%num==0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(power(n));
    }
}
