package toc;

import java.util.Scanner;
import java.util.Stack;

public class Experiment11 {
    //wcwr
    static Stack<Integer> stk=new Stack<>();
    public static void q0(String s,int i){
        if(i==s.length()) {
            System.out.println("String is Rejected");
            return;
        }
        if (s.charAt(i)=='0'){
            stk.push(0);
            q0(s,i+1);
        }
        else if (s.charAt(i)=='1'){
            stk.push(1);
            q0(s,i+1);
        }
        else if (s.charAt(i)=='c'||s.charAt(i)=='C')
            q1(s,i+1);
        else
            System.out.println("Input symbol mis-match");
    }
    public static void q1(String s, int i){
        if (i==s.length() && stk.peek()==-1){
            System.out.println("String Accepted");
            return;
        }
        if (i==s.length() && stk.peek()!=-1){
            System.out.println("String Rejected");
            return;
        }
        if (s.charAt(i)=='0'&& stk.peek()==0){
            stk.pop();
            q1(s,i+1);
        }
        else if(s.charAt(i)=='1'&& stk.peek()==1){
            stk.pop();
            q1(s,i+1);
        }
        else{
            q1(s,i+1);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();
        stk.push(-1);
        q0(s,0);

    }
}
