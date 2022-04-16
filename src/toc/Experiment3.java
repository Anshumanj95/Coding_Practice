package toc;

import java.util.Scanner;

public class Experiment3 {
    public static void q0(String s,int i){
        System.out.print("q0->");
        if(i==s.length()){
            System.out.println("Accepted");
            return;
        }
        if(s.charAt(i)=='0')
            q0(s,i+1);
        else
            q1(s,i+1);
    }
    public static void q1(String s,int i){
        System.out.print("q1->");
        if(i==s.length()){
            System.out.println("Not Accepted");
            return;
        }
        if(s.charAt(i)=='0')
            q2(s,i+1);
        else
            q0(s,i+1);
    }
    public static void q2(String s,int i){
        System.out.print("q2->");
        if(i==s.length()){
            System.out.println("Not Accepted");
            return;
        }
        if(s.charAt(i)=='0')
            q1(s,i+1);
        else
            q2(s,i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        String s=Integer.toBinaryString(num);
        System.out.println("Transition States are: ");
        q0(s,0);
    }
}
