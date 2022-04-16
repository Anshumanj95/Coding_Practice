package toc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Experiment6 {
    static Stack<Character> stack=new Stack<>();
    static int len1=0;
    static int len0=0;
    public static void q0(String s, int i){
        if((i==s.length())&& stack.peek()=='z'){

            if(len0==len1)
            System.out.println(len0);
            else
                System.out.println("Not equal length");
        }
        else if((i==s.length())&& stack.peek()!='z'){
            System.out.println("Not equal length");
        }
        else if(s.charAt(i)=='0'&& stack.peek()=='z'){
            stack.push(s.charAt(i));
            len0++;
            q0(s,i+1);
        }
        else if(s.charAt(i)=='1'&& stack.peek()=='z'){
            stack.push(s.charAt(i));
            len1++;
            q0(s,i+1);
        }
        else if(s.charAt(i)=='0'&& stack.peek()=='0'){
            stack.push(s.charAt(i));
            len0++;
            q0(s,i+1);
        }
        else if(s.charAt(i)=='1'&& stack.peek()=='1'){
            stack.push(s.charAt(i));
            len1++;
            q0(s,i+1);
        }
        else if(s.charAt(i)=='0'&& stack.peek()=='1'){
            stack.pop();
            len0++;
            q0(s,i+1);
        }
        else if(s.charAt(i)=='1'&& stack.peek()=='0'){
            stack.pop();
            len1++;
            q0(s,i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        stack.push('z');
        q0(str,0);

    }
}
