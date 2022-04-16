package String;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyString {
    public static String multiply(String s1,String s2){
        BigInteger a=new BigInteger(s1);
        BigInteger b=new BigInteger(s2);
        return a.multiply(b).toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(multiply(s1,s2));
    }
}
