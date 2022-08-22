package bits;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowerOfTwo {
    public static boolean power(int n){
        return ((n&(n-1))==0&&n>0);
    }
    public static  boolean isPowerOfFour(int num) {
        return num > 0 && (num&(num-1)) == 0 && (num - 1) % 3 == 0;
        //for those who are the power of 2 but not power of 4 we use 0x55555555 to check th set bit at odd position
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(power(n));
    }
}
