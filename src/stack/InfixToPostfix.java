package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostfix {
    public static int precedence(char ch){
        if(ch=='+'||ch=='-')
            return 1;
        if(ch=='*'||ch=='/')
            return 2;
        if(ch=='^')
            return 3;
        return -1;
    }
    public static String convert(String exp){
        Deque<Character> d=new ArrayDeque<>();
        StringBuilder s= new StringBuilder();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isLetter(ch))
                s.append(ch);
            else if(ch=='(')
                d.push(ch);
            else if(ch==')'){
                while (!d.isEmpty() && d.peek()!='('){
                    s.append(d.pop());
                }
                d.pop();
            }
            else{
                while (!d.isEmpty() && precedence(ch)<=precedence(d.peek())){
                    s.append(d.pop());
                }
                d.push(ch);
            }
        }
        while (!d.isEmpty()) s.append(d.pop());
        return s.toString();
    }
    public static void main(String[] args) {
        String exp="a+b*c-d^e^f";
        System.out.println(convert(exp));

    }
}
