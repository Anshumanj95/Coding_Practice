package Maths;

public class PowerOfTwoInteger {
    /*
    Given a positive integer which fits in a 32-bit signed integer,
    find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.
     */
    public static boolean isPower(int n){
        if (n==1)
            return true;
        for (int a=2;a<=Math.sqrt(n);a++){
            int p=(int)(Math.log(n)/Math.log(a));
            if (Math.pow(a,p)==n)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPower(729));
    }
}
