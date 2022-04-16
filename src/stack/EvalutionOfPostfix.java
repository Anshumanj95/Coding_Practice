package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvalutionOfPostfix {
    public static int evaluate(String s){
        Deque<Integer> d=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
                d.push(Character.getNumericValue(ch));
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                int op1=d.pop();
                int op2=d.pop();
                if (ch=='+')
                    d.push(op2+op1);
                else if (ch=='-')
                    d.push(op2-op1);
                else if (ch=='*')
                    d.push(op1*op2);
                else
                    d.push(op2/op1);
                }
            }
        return d.peek();
        /*
        if(c == ' ')
        continue;

        // If the scanned character is an operand
        // (number here),extract the number
        // Push it to the stack.
        else if(Character.isDigit(c))
        {
            int n = 0;

            //extract the characters and store it in num
            while(Character.isDigit(c))
            {
                n = n*10 + (int)(c-'0');
                i++;
                c = exp.charAt(i);
            }
            i--;
         */
    }
    public static void main(String[] args) {
        String s="1 2 + 3 *";
        System.out.println(evaluate(s));
    }
}
