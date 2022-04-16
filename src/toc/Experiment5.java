package toc;

import java.util.Scanner;
import java.util.Stack;

public class Experiment5 {
    static Stack<Character> stack=new Stack<>();
    public static void q0(String s, int i){
        if((i==s.length())&& stack.peek()=='z'){
            System.out.println("Accepted");
            return;
        }
        if((i==s.length())&& stack.peek()!='z'){
            System.out.println("Not Accepted");
            stack.pop();
            return;
        }
        if(s.charAt(i)=='0'&& stack.peek()=='z'){
            stack.push(s.charAt(i));
            System.out.println("(q0,0,Z)->(q0,0Z)");
            q0(s,i+1);
        }
        if(s.charAt(i)=='1'&& stack.peek()=='z'){
            stack.push(s.charAt(i));
            System.out.println("(q0,1,Z)->(q0,1Z)");
            q0(s,i+1);
        }
        if(s.charAt(i)=='0'&& stack.peek()=='0'){
            stack.push(s.charAt(i));
            System.out.println("(q0,0,0)->(q0,00)");
            q0(s,i+1);
        }
        if(s.charAt(i)=='1'&& stack.peek()=='1'){
            stack.push(s.charAt(i));
            System.out.println("(q0,1,1)->(q0,11)");
            q0(s,i+1);
        }
        if(s.charAt(i)=='0'&& stack.peek()=='1'){
            stack.pop();
            System.out.println("(q0,0,1)->(q0,E)");
            q0(s,i+1);
        }
        if(s.charAt(i)=='1'&& stack.peek()=='0'){
            stack.pop();
            System.out.println("(q0,1,0)->(q0,E)");
            q0(s,i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();
        System.out.println("Transition States are: ");
        stack.push('z');
        q0(s,0);

    }
}
