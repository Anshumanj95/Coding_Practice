package stack;

import java.util.HashMap;
import java.util.Stack;

public class DecodeString {
    static HashMap<Integer,Integer> closePos=new HashMap<>();
    public static String decode(String s){
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='[')
                st.push(i);
            else if(s.charAt(i)==']')
                closePos.put(st.pop(),i);
        }
        return solve(s,0,s.length()-1);
    }
    public static String solve(String s,int l,int r){
        StringBuilder sb=new StringBuilder();
        int num=0;
        while (l<=r){
            char ch=s.charAt(l);
            if (Character.isDigit(ch))
                num=num*10+ch-'0';
            else if (ch=='['){
                sb.append(solve(s,l+1,closePos.get(l)-1).repeat(num));
                num=0;
                l=closePos.get(l);
            }
            else
                sb.append(ch);
            l++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="3[a2[c]]";
        System.out.println(decode(s));
    }
}
