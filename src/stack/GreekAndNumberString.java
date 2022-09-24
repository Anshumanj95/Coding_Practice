package stack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class GreekAndNumberString {
    public static int minLen(String s,int n){
        Stack<Character> st=new Stack<>();
        HashSet<String> set=new HashSet<>(Arrays.asList("12","21", "34", "43", "56", "65", "78", "87", "09", "90"));
        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            if (st.isEmpty()){
                st.push(ch);
                continue;
            }
            String str=ch+""+st.peek();
            if (set.contains(str))
                st.pop();
            else
                st.push(ch);
        }
        return st.size();
    }
    public static void main(String[] args) {
        String s="12213";
        System.out.println(minLen(s,s.length()));
    }
}
