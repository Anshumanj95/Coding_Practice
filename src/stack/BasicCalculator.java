package stack;

import java.util.Stack;

public class BasicCalculator {
    public static int calculate(String s){
        Stack<Integer> st=new Stack<>();
        int sum=0;
        int sign=1;
        int n=s.length();
        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            if (Character.isDigit(ch)){
                int val=0;
                while (i<n && Character.isDigit(s.charAt(i))){
                    val=val*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;
                val=val*sign;
                sign=1;
                sum+=val;
            }
            else if(ch=='('){
                st.push(sum);// store previous sum and sign
                st.push(sign);
                sum=0;// compute sum of nested
                sign=1;
            }
            else if(ch==')'){
                sum*=st.pop();//sign
                sum+=st.pop();//sum of nested bracket
            }
            else if (ch=='-'){
                sign=-1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s="(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }
}
