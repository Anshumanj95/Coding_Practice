package toc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Experiment8 {
    static boolean flag=true;
    static char[] str;
    public static void q0(int i){
        if(str[i]=='0'){
            str[i]='1';
            q2(i+1);
        }
        else{
            str[i]='0';
            flag=false;
            q1(i+1);
        }
    }
    public static void  q1(int i){
        if(i==str.length)
            return;
        if(str[i]=='0') {
            str[i]='1';
            q2(i+1);
        }
        else{
            str[i]='0';
            flag=false;
            q1(i+1);
        }
    }
    public static void q2(int i){
        if(i==str.length)
            return;
        if (str[i]=='0')
            q2(i+1);
        else
            q2(i+1);
    }
    public static void reverse(int j,int k,char[] str){
        while (j<k){
            char ch=str[j];
            str[j]=str[k];
            str[k]=ch;
            j++;k--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary Number");
        String s=sc.next();
        str=s.toCharArray();
        reverse(0,str.length-1,str);
        q0(0);
        System.out.print("Number after increment by one is: ");
        reverse(0,str.length-1,str);
        if (!flag)
            System.out.print(1);
        System.out.println(str);

    }
}
