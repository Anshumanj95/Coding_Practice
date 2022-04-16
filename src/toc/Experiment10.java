package toc;

import java.util.Scanner;
import java.util.Stack;

public class Experiment10 {
    static Stack<Integer> stk=new Stack<>();
    public static void q0(String s,int i){
        if((i==s.length())&& stk.peek()==-1){
            System.out.println("Expression accepted");
            return;
        }
        if ((i==s.length()) && stk.peek()!=-1){
            System.out.println("Expression rejected");
            return;
        }
        else if (s.charAt(i)=='(' && stk.peek()==-1){
            stk.push(0);
            System.out.println("(q0,(,Z)->(q0,0Z)");
            q0(s,i+1);
        }
        else if (s.charAt(i)=='('&&stk.peek()==0){
            stk.push(0);
            System.out.println("(q0,(,0)->(q0,00)");
            q0(s,i+1);
        }
        else if (s.charAt(i)==')'&& stk.peek()==0){
            stk.pop();
            System.out.println("(q0,),0)->(q0,E)");
            q0(s,i+1);
        }
        else{
            q0(s,i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Expression");
        String s=sc.next();
        stk.push(-1);
        System.out.println("State Transition are");
        q0(s,0);


    }
}
