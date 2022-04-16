package Recursion;

import java.util.Arrays;

public class DecimalToBinary {
    public static void convert(int n){
        if(n==0)
            return;
        convert(n/2);
        System.out.print(n%2);
    }
    public static void BtoD(String str){
        int ans=0;
        for (int i=0;i<str.length();i++){
            ans+=(str.charAt(i)-'0')*Math.pow(2,str.length()-1-i);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
//        convert(13);
       BtoD("110");

    }
}
