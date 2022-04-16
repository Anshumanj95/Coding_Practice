package toc;

import java.util.Scanner;

public class Experiment7 {
    static StringBuffer ans=new StringBuffer();
    public static void q0(String s,int i){
        if(i==s.length())
            return;
        if(s.charAt(i)=='0'){
            ans.append("0");
            q0(s,i+1);
        }
        else{
            ans.append("1");
            q1(s,i+1);
        }
    }
    public static void q1(String s,int i){
        if (i==s.length())
            return;
        if(s.charAt(i)=='0'){
            ans.append("1");
            q1(s,i+1);
        }
        else {
            ans.append("0");
            q1(s,i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number");
        String s=sc.next();
        StringBuilder stringBuffer=new StringBuilder(s);
        s=String.valueOf(stringBuffer.reverse());
        q0(s,0);
        System.out.print("2's Complement is: ");
        System.out.println(ans.reverse());


    }
}
