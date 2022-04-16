package stack;

import java.util.Stack;

public class RemoveKDigits {
    public static String remove(String str,int k){
        int n=str.length();
        if(k>=n)
            return "0";
        if(k==0)
            return str;
        Stack<Character> s=new Stack<>();
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
            while(!s.isEmpty()&&k>0&& s.peek()>c){
                s.pop();
                k--;
            }
            if(!s.isEmpty()||c!='0'){
                s.push(c);
            }
        }
        while(!s.isEmpty()&&k-->0){
            s.pop();
        }
        while(s.isEmpty())
            return "0";
        str="";
        while(!s.isEmpty()){
            str=s.pop()+str;
        }
        return str;
    }
    public static void main(String[] args) {
        String s="1002991";
        int k=3;
        System.out.println(remove(s,k));

    }
}
