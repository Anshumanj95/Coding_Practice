package Maths;

import java.util.Collections;

public class Maths {
    public static int trailingZeros(int n){
        int ans=0;
        for(int i=5;i<=n;i=i*5){
            ans=ans+(n/i);
        }
        return ans;
    }
    public static boolean palindrome(int n){
        int temp=n;
        int rnum=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            rnum=rnum*10+r;
        }
        System.out.println(rnum);
        if(rnum!=temp)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        System.out.println(trailingZeros(60));
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        if(palindrome(n))
//            System.out.printf("%d is a palindrome number",n);
//        else
//            System.out.printf("%d is not a palindrome number",n);
    }
}
