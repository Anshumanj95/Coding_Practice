package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluationofPrefix {
    public static int evaluate(String s){
        Deque<Integer> d=new ArrayDeque<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
                d.push(Character.getNumericValue(ch));
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                int op1=d.pop();
                int op2=d.pop();
                if(ch=='+')
                    d.push(op1+op2);
                else if(ch=='-')
                    d.push(op1-op2);
                else if(ch=='*')
                    d.push(op1*op2);
                else
                    d.push(op1/op2);
            }
        }
        return d.peek();
    }
    public static void main(String[] args) {
        String s="-+2*319";
        System.out.println(evaluate(s));

    }
}
